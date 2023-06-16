package org.apds.interop.apds2netex.builder;

import generated.eu.cen.netex.*;
import generated.org.apds.model.*;
import org.apds.interop.apds2netex.netex.ObjectFactoryHelper;

import javax.xml.bind.annotation.XmlEnumValue;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static generated.eu.cen.netex.StakeholderRoleTypeEnumeration.ENTITY_LEGAL_OWNERSHIP;

public class Apds2NetexTransformer {

    public static ParkingTariff populateFromApdsRate( ParkingTariff tariff, RateTableDTO rate, List<String> placeIds) {

        tariff.setName( ObjectFactoryHelper.buildMultilingualString( ObjectFactoryHelper.MLS_DEFAULT_LANG, rate.getRateTableName().get(0).getString()));

        if ( placeIds != null) {
            for ( String placeId : placeIds) {
                tariff.getAppliesTo().getParkingRef().add( ObjectFactoryHelper.createInstanceOfParkingRefStructure( placeId));
            }
        }

        // the steps
        if ( rate.getRateLineCollections() != null && rate.getRateLineCollections().size() > 0) {
            RateLineCollectionDTO collection = rate.getRateLineCollections().get(0);
            if ( collection.getRateLines() != null && collection.getRateLines().size() > 0) {
                for (RateLineDTO rateLine : collection.getRateLines()) {
                    ParkingChargeBand band = ObjectFactoryHelper.createInstanceOfParkingChargeBand();
                    band.setMaximumStay( ApdsDurationParser.calculateDuration( rateLine.getDurationStart(), rateLine.getDurationEnd()));
                    TimeIntervalPrice price = ObjectFactoryHelper.createInstanceOfTimeIntervalPrice(UUID.randomUUID().toString() + ":" + rate.getId() + ":" + collection.getCollectionSequence() + ":" + String.valueOf( rateLine.getSequence()),
                            rateLine.getValue() != null ? rateLine.getValue().doubleValue() : 0.0);
                    if ( band.getPrices() == null) {
                        band.setPrices(new ParkingChargeBand.Prices());
                    }
                    band.getPrices().getTimeIntervalPrice().add( price);

                    ParkingTariff.ParkingChargeBands bands = tariff.getParkingChargeBands();
                    if ( bands != null) {
                        List<ParkingChargeBand> bandList = bands.getParkingChargeBand();
                        if ( bandList != null) {
                            bandList.add( band);
                        }
                    }
                }
            }
        }

        return tariff;
    }

    public static Parking populateFromApdsPlace(Parking parking, PlaceDTO place) {

        // BASICS

        parking.setId( place.getId());
        parking.setName( ObjectFactoryHelper.buildMultilingualString( place.getName().get(0).getString()));
        parking.setResponsibilitySetRef( String.format( ObjectFactoryHelper.RESPSETREF_ID_PATTERN, ObjectFactoryHelper.MLS_DEFAULT_LANG, place.getId()));

        if ( place.getAliases() != null && place.getAliases().size() > 0) {
            parking.setPublicCode( place.getAliases().get(0).get(0).getString());
        } else {
            parking.setPublicCode( place.getId());
        }

        if ( place.getDescription() != null && place.getDescription().get(0).getString() != null) {
            parking.setDescription( ObjectFactoryHelper.buildMultilingualString( place.getDescription().get(0).getString()));
        }

        // OPENING TIMES

        parking.setValidityConditions( new Parking.ValidityConditions());

        if ( place.getOpeningTimes() != null && place.getOpeningTimes().getAccessAndEgress() != null) {
            if ( place.getOpeningTimes().getAccessAndEgress() != null) {
                for ( AccessAndEgressDTO accessEgress : place.getOpeningTimes().getAccessAndEgress()) {
                    if (accessEgress.getValidity() != null) {
                        ValidityDTO validity = accessEgress.getValidity();
                        List<PeriodDTO> validPeriods = validity.getValidPeriods();
                        if (validPeriods != null) {
                            int index = 1;
                            for (PeriodDTO period : validPeriods) {
                                AvailabilityCondition condition = createInstanceOfAvailabilityCondition(period.getPeriodName().get(0).getString(), index, "any", true);
                                RecurringTimePeriodOfDayDTO timePeriod = period.getRecurringTimePeriodOfDay();
                                if ( timePeriod != null) {
                                    addTimeband( condition, create( index, timePeriod.getStartTimeOfPeriod(), timePeriod.getEndTimeOfPeriod()));
                                }
                                if ( period.getRecurringDayWeekMonthPeriod() != null && period.getRecurringDayWeekMonthPeriod().getApplicableDay() != null) {
                                    condition.setDayTypes( createFromDays( index, period.getRecurringDayWeekMonthPeriod().getApplicableDay()));
                                }
                                parking.getValidityConditions().getAvailabilityCondition().add(condition);
                                index++;
                            }
                        }
                        List<PeriodDTO> exceptionPeriods = validity.getExceptionPeriods();
                        if (exceptionPeriods != null) {
                            int index = 1;
                            for (PeriodDTO period : exceptionPeriods) {
                                AvailabilityCondition condition = createInstanceOfAvailabilityCondition( period.getPeriodName().get(0).getString(), index, "any", false);
                                RecurringTimePeriodOfDayDTO timePeriod = period.getRecurringTimePeriodOfDay();
                                if ( timePeriod != null) {
                                    addTimeband( condition, create( index, timePeriod.getStartTimeOfPeriod(), timePeriod.getEndTimeOfPeriod()));
                                }
                                if ( period.getRecurringDayWeekMonthPeriod() != null && period.getRecurringDayWeekMonthPeriod().getApplicableDay() != null) {
                                    condition.setDayTypes( createFromDays( index, period.getRecurringDayWeekMonthPeriod().getApplicableDay()));
                                }
                                parking.getValidityConditions().getAvailabilityCondition().add(condition);
                                index++;
                            }
                        }
                    }
                }
            }
        }

        // DETAILS TAKEN FROM PLACE CHARACTERISTICS
        CharacteristicsDTO characteristics = place.getCharacteristics();
        if ( characteristics != null) {

            // capacity
            if ( characteristics.getSpacesTotal() != null) {
                parking.setTotalCapacity(BigInteger.valueOf(characteristics.getSpacesTotal()));
            }
            if ( characteristics.getEvChargingPoints() != null) {
                parking.setRechargingAvailable( characteristics.getEvChargingPoints() > 0);
                // parking.setNumberOfBaysWithRecharging( BigInteger.valueOf( characteristics.getEvChargingPoints()));
            }

            // address
            if ( place.getPlaceStreetAddress() != null) {
                parking.setPostalAddress( postalAddressFromAddressDTO( place.getPlaceStreetAddress(), place.getId()));
            }

            // location
            if ( place.getIndicativePointLocation() != null && place.getIndicativePointLocation().getCoordinates() != null && place.getIndicativePointLocation().getCoordinates().size() >= 2) {
                parking.setCentroid( ObjectFactoryHelper.createInstanceOfSimplePoint( place.getIndicativePointLocation().getCoordinates().get(1), place.getIndicativePointLocation().getCoordinates().get(0)));
            }

            // structure grade
            if ( characteristics.getStructureGrade() != null) {
                switch ( characteristics.getStructureGrade()) {
                    case ABOVEGROUND:
                        parking.setParkingLayout( ParkingLayoutEnumeration.MULTISTOREY);
                        break;
                    case GROUNDLEVEL:
                        parking.setParkingLayout( ParkingLayoutEnumeration.OPEN_SPACE);
                        break;
                    case UNDERGROUND:
                        parking.setParkingLayout( ParkingLayoutEnumeration.UNDERGROUND);
                        break;
                    default:
                        parking.setParkingLayout( ParkingLayoutEnumeration.UNDEFINED);
                }
            }

            // structure type
            if ( characteristics.getStructureType() != null) {
                switch ( characteristics.getStructureType()) {
                    case ONSTREET:
                        parking.setParkingType( ParkingTypeEnumeration.ROADSIDE);
                        break;
                    case OFFSTREETSURFACE:
                    case OFFSTREETSTRUCTURE:
                        parking.setParkingType( ParkingTypeEnumeration.OTHER);
                        break;
                    default:
                        parking.setParkingType( ParkingTypeEnumeration.UNDEFINED);
                }
            }

            // payment methods
            if ( place.getPaymentMethods() != null && place.getPaymentMethods().size() > 0) {
                for ( PaymentMethodDTO paymentMethod : place.getPaymentMethods()) {
                    if ( paymentMethod.getPaymentMode() != null && paymentMethod.getPaymentMode().size() > 0) {
                        parking.getParkingPaymentProcess().addAll( paymentProcessFromPaymentTiming( paymentMethod.getPaymentMode()));
                    }
                }
            }
        }

        return parking;
    }

    private static AvailabilityCondition createInstanceOfAvailabilityCondition( String id, int index, String version, boolean isAvailable) {
        AvailabilityCondition condition = new AvailabilityCondition();
        condition.setId( String.format( "FR:AvailabilityCondition:%s:%d", id, index));
        condition.setVersion( version);
        condition.setIsAvailable( isAvailable);
        return condition;
    }

    public static AvailabilityCondition addTimeband( AvailabilityCondition condition, Timeband timeband) {
        if ( condition.getTimebands() == null) {
            condition.setTimebands( new AvailabilityCondition.Timebands());
            condition.getTimebands().setId( "FR:timebands:01");
        }
        condition.getTimebands().getTimeband().add( timeband);
        return condition;
    }

    public static Timeband create( int index, String startTime, String endTime) {
        Timeband timeband = new Timeband();
        timeband.setId( String.format( "FR:Timeband:%02d", index));
        timeband.setVersion( "any");
        if ( startTime != null ){
            timeband.setStartTime(startTime + (startTime.length() == 5 ? ":00" : ""));
        }
        if ( endTime != null) {
            timeband.setEndTime(endTime + (endTime.length() == 5 ? ":00" : ""));
        }
        return timeband;
    }

    public static AvailabilityCondition.DayTypes createFromDays( int index, List<DayOfWeekEnumDTO> days) {
        AvailabilityCondition.DayTypes dayTypes = new AvailabilityCondition.DayTypes();
        AvailabilityCondition.DayTypes.DayType dayType = new AvailabilityCondition.DayTypes.DayType();
        dayType.setId( String.format( "FR:DayType:%02d", index));
        dayType.setVersion( "any");
        dayType.setProperties( new PropertiesOfDayRelStructure());
        dayType.getProperties().setPropertyOfDay( new PropertiesOfDayRelStructure.PropertyOfDay());
        for ( DayOfWeekEnumDTO day : days) {
            dayType.getProperties().getPropertyOfDay().getDaysOfWeek().add( mapFrom(day));
        }
        dayTypes.getDayType().add( dayType);
        return dayTypes;
    }

    public static DayOfWeekEnumeration mapFrom( DayOfWeekEnumDTO apdsDayOfWeek) {
        try {
            return DayOfWeekEnumeration.valueOf(apdsDayOfWeek.name());
        } catch ( Exception ex) {
            return null;
        }
    }

    public static List<GeneralOrganisation> getOrganisationsFromPlaceDTO( PlaceDTO place) {
        List<GeneralOrganisation> orgs = new ArrayList<>();
        if ( place.getResponsibilityRoleAssignments() != null) {
            for ( ResponsibilityRoleAssignmentDTO assignment : place.getResponsibilityRoleAssignments()) {
                if ( assignment.getOrganisation() != null) {
                    OrganisationDTO apdsOrg = assignment.getOrganisation();
                    GeneralOrganisation org = ObjectFactoryHelper.createInstanceOfGeneralOrganisation( apdsOrg.getId(), apdsOrg.getName(), apdsOrg.getId());
                    orgs.add( org);
                }
            }
        }
        return orgs;
    }

    public static ResponsibilitySet responsibilitySetFromPlaceDTO( PlaceDTO place) {

        ResponsibilitySet set = ObjectFactoryHelper.createInstanceOfResponsibilitySet( String.format( ObjectFactoryHelper.RESPSETREF_ID_PATTERN, ObjectFactoryHelper.MLS_DEFAULT_LANG, place.getId()));
        set.setRoles( new ResponsibilitySet.Roles());
        if ( place.getResponsibilityRoleAssignments() != null && place.getResponsibilityRoleAssignments().size() > 0) {
            for ( ResponsibilityRoleAssignmentDTO roleAssignment : place.getResponsibilityRoleAssignments()) {
                ResponsibilityRoleAssignmentType assignment = new ResponsibilityRoleAssignmentType();
                assignment.getStakeholderRoleType().add( roleTypeFromApdsRoleType( roleAssignment.getType()));
                ResponsibilityRoleAssignmentType.ResponsibleOrganisationRef orgRef = new ResponsibilityRoleAssignmentType.ResponsibleOrganisationRef();
                if ( roleAssignment.getOrganisation() != null && roleAssignment.getOrganisation().getId() != null) {
                    orgRef.setRef(roleAssignment.getOrganisation().getId());
                } else {
                    orgRef.setRef( ObjectFactoryHelper.DEFAULT_REF);
                }
                assignment.setResponsibleOrganisationRef( orgRef);
                set.getRoles().getResponsibilityRoleAssignment().add( assignment);
            }
        }
        return set;
    }

    private static PostalAddress postalAddressFromAddressDTO( AddressDTO apdsAddress, String placeId) {

        PostalAddress address = ObjectFactoryHelper.createInstanceOfPostalAddress( placeId);

        // city
        if ( apdsAddress.getCity() != null) {
            address.setTown( ObjectFactoryHelper.buildMultilingualString( apdsAddress.getCity().get(0).getString()));
        }

        // postcode
        if ( apdsAddress.getPostCode() != null) {
            address.setPostCode( apdsAddress.getPostCode());
        }

        // other address infos
        if ( apdsAddress.getAddressLines() != null) {
            for ( AddressLineDTO line : apdsAddress.getAddressLines()) {
                if ( line.getType().equals( AddressLineTypeEnumDTO.STREET)) {
                    address.setStreet( ObjectFactoryHelper.buildMultilingualString( line.getText()));
                } else if ( line.getType().equals( AddressLineTypeEnumDTO.TOWN)) {
                    address.setTown( ObjectFactoryHelper.buildMultilingualString( line.getText()));
                }
            }
        }

        return address;
    }

    private static List<ParkingPaymentProcessEnumeration> paymentProcessFromPaymentTiming( List<PaymentTimingEnumDTO> paymentTimings) {

        List<ParkingPaymentProcessEnumeration> processes = new ArrayList<>();
        if ( paymentTimings != null) {
            for ( PaymentTimingEnumDTO paymentTiming : paymentTimings) {
                switch (paymentTiming) {
                    case OTHER:
                    case PAYAFTEREXIT:
                    case PAYPRIORTOEXIT:
                        processes.add( ParkingPaymentProcessEnumeration.OTHER);
                        break;
                    case PAYANDEXIT:
                        processes.add( ParkingPaymentProcessEnumeration.PAY_AT_MACHINE_ON_FOOT_PRIOR_TO_EXIT);
                        break;
                    case PREPAY:
                    case PAYONENTRY:
                        processes.add( ParkingPaymentProcessEnumeration.PAY_AND_DISPLAY);
                        processes.add( ParkingPaymentProcessEnumeration.PAY_BY_MOBILE_DEVICE);
                        break;
                    default:
                        processes.add( ParkingPaymentProcessEnumeration.UNDEFINED);
                }
            }
        }
        return processes;
    }

    private static StakeholderRoleTypeEnumeration roleTypeFromApdsRoleType( ContactTypeEnumDTO apdsContactType) {

        if ( apdsContactType == null) {
            return StakeholderRoleTypeEnumeration.OTHER;
        }

        switch ( apdsContactType) {
            case EMERGENCYCONTACT:
            case CUSTOMERSERVICE:
            case OPERATOR:
                return StakeholderRoleTypeEnumeration.OPERATION;
            case OWNER:
                return StakeholderRoleTypeEnumeration.ENTITY_LEGAL_OWNERSHIP;
            case SECURITYSERVICE:
                return StakeholderRoleTypeEnumeration.SECURITY_MANAGEMENT;
            case PROPERTYMANAGER:
                return StakeholderRoleTypeEnumeration.CONTROL;
        }
        return StakeholderRoleTypeEnumeration.OTHER;
    }

}
