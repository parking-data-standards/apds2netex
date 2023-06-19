package org.apds.interop.apds2netex.netex;

import generated.eu.cen.netex.*;
import org.apds.interop.apds2netex.datetime.XmlDateTime;
import java.math.BigDecimal;
import java.util.UUID;

public class ObjectFactoryHelper {

    public static final String DEFAULT_REF = "DEFAULT";
    public static final String DEFAULT_COUNTRY = "GB";
    public static final String MLS_DEFAULT_LANG = "en";
    public static final String DEFAULT_CURRENCY = "GBP";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String DEFAULT_TIMEZONE = "Europe/London";
    public static final String DEFAULT_LOCATION_SYSTEM = "WGS84"; // 4326
    public static final String DEFAULT_VERSION = "1";
    public static final String DEFAULT_PUBLICATION_VERSION = "1.0";
    public static final String ANY_VERSION = "any";
    public final static String NETEX_PARKING_VERSION = "version=\"2.01:FR-NETEX_PARKING-1.0\"";
    public final static String PARKING_TYPE_OF_FRAME = "FR:TypeOfFrame:NETEX_PARKING";
    private static final String ADDRESS_ID_PATTERN = "%s:PostalAddress:%s:LOC";
    public static final String RESPSETREF_ID_PATTERN = "%s:ResponsibilitySetRef:%s:LOC";
    public static final String RESPROLE_ID_PATTERN = "%s:ResponsibilityRoleAssignment:%02d:LOC";
    public static final String ORGREF_ID_PATTERN = "%s:Organisation:%s:LOC";
    private static final String TIMEINTERVAL_ID_PATTERN = "%s:TimeIntervalPrice:%s:LOC";
    private static final ObjectFactory netexFactory = new ObjectFactory();

    public static MultilingualString buildMultilingualString(String lang, String value) {
        MultilingualString string = new MultilingualString();
        string.setLang( lang);
        string.setValue( value);
        return string;
    }

    public static MultilingualString buildMultilingualString(String value) {
        return buildMultilingualString( MLS_DEFAULT_LANG, value);
    }

    public static LocaleStructure buildLocaleDefaults() {
        LocaleStructure loc = new LocaleStructure();
        loc.setDefaultLanguage( DEFAULT_LANGUAGE);
        loc.setTimeZone( DEFAULT_TIMEZONE);
        return loc;
    }

    public static PublicationDelivery addMember(PublicationDelivery pub, Object newMember) {
        if ( newMember instanceof Parking) {
            pub.getDataObjects().getCompositeFrame().getFrames().getGeneralFrame().get(0).getMembers().getParking().add( (Parking) newMember);
        } else if ( newMember instanceof ParkingTariff) {
            pub.getDataObjects().getCompositeFrame().getFrames().getGeneralFrame().get(0).getMembers().getParkingTariff().add( (ParkingTariff) newMember);
        } else if ( newMember instanceof GeneralOrganisation) {
            pub.getDataObjects().getCompositeFrame().getFrames().getGeneralFrame().get(0).getMembers().getGeneralOrganisation().add((GeneralOrganisation) newMember);
        } else if ( newMember instanceof ResponsibilitySet) {
            pub.getDataObjects().getCompositeFrame().getFrames().getGeneralFrame().get(0).getMembers().getResponsibilitySet().add((ResponsibilitySet) newMember);
        }
        return pub;
    }

    public static VersionFrameDefaultsStructure createInstanceOfFrameDefaults() {
        return netexFactory.createVersionFrameDefaultsStructure();
    }

    public static SimplePointVersionStructure createInstanceOfSimplePoint(BigDecimal latitude, BigDecimal longitude) {

        LocationStructure location = netexFactory.createLocationStructure();
        location.setLatitude( latitude);
        location.setLongitude( longitude);
        SimplePointVersionStructure point = netexFactory.createSimplePointVersionStructure();
        point.setLocation( location);
        return point;
    }

    public static ResponsibilitySet createInstanceOfResponsibilitySet( String id) {
        ResponsibilitySet set = netexFactory.createResponsibilitySet();
        set.setVersion( ANY_VERSION);
        set.setId( id);
        return set;
    }

    public static PostalAddress createInstanceOfPostalAddress( String id) {
        PostalAddress address = netexFactory.createPostalAddress();
        address.setVersion( ANY_VERSION);
        address.setId( String.format( ADDRESS_ID_PATTERN, DEFAULT_COUNTRY, id));
        return address;
    }

    public static ParkingRefStructure createInstanceOfParkingRefStructure( String ref) {
        ParkingRefStructure refStruct = netexFactory.createParkingRefStructure();
        refStruct.setRef( ref);
        return refStruct;
    }

    public static GeneralOrganisation createInstanceOfGeneralOrganisation( String id, String name, String number) {
        GeneralOrganisation organisation = netexFactory.createGeneralOrganisation();
        organisation.setId( id);
        organisation.setVersion(ANY_VERSION);
        organisation.setCompanyNumber( number != null ? number : id);
        organisation.setName( buildMultilingualString( name));
        return organisation;
    }

    public static TimeIntervalPrice createInstanceOfTimeIntervalPrice( String id, double amount) {
        TimeIntervalPrice price = netexFactory.createTimeIntervalPrice();
        price.setId( String.format( TIMEINTERVAL_ID_PATTERN, DEFAULT_COUNTRY, id));
        price.setVersion( ANY_VERSION);
        price.setAmount( amount);
        return price;
    }

    public static ParkingChargeBand createInstanceOfParkingChargeBand() {
        ParkingChargeBand band = netexFactory.createParkingChargeBand();
        band.setPrices( new ParkingChargeBand.Prices());
        return band;
    }

        public static ParkingTariff createInstanceOfParkingTariff( String id) {
        ParkingTariff tariff = netexFactory.createParkingTariff();
        tariff.setId( id);
        tariff.setVersion( ANY_VERSION);
        ParkingTariff.AppliesTo appliesToList = netexFactory.createParkingTariffAppliesTo();
        tariff.setAppliesTo( appliesToList);
        ParkingTariff.ParkingChargeBands bands = netexFactory.createParkingTariffParkingChargeBands();
        tariff.setParkingChargeBands( bands);
        return tariff;
    }

    public static Parking createInstanceOfParking( String parkingId, String name) {

        Parking parking = netexFactory.createParking();
        parking.setName( buildMultilingualString( name));
        parking.setId( parkingId);
        parking.setVersion( DEFAULT_VERSION);
        return parking;
    }

    public static Parking createInstanceOfParking() {
        return createInstanceOfParking( null, null);
    }

    public static PublicationDelivery createInstanceOfPublicationDelivery(String generalFrameId, String participantRef) {

        PublicationDelivery publication = new PublicationDelivery();
        publication.setParticipantRef( participantRef);
        publication.setVersion( DEFAULT_PUBLICATION_VERSION);
        publication.setPublicationTimestamp(XmlDateTime.now());

        DataObjectsStructure dataObjects = new DataObjectsStructure();
        CompositeFrameVersionStructure compositeFrame = netexFactory.createCompositeFrameVersionStructure();
        compositeFrame.setId( "FR:CompositeFrame:" + UUID.randomUUID().toString() + ":LOC");
        compositeFrame.setVersion( DEFAULT_VERSION);
        compositeFrame.setCreated( XmlDateTime.now());
        FramesRelStructure frames = netexFactory.createFramesRelStructure();
        GeneralFrameVersionStructure generalFrame = netexFactory.createGeneralFrameVersionStructure();
        generalFrame.setVersion( DEFAULT_VERSION);
        generalFrame.setId( generalFrameId);

        TypeOfFrameRefStructure tof = netexFactory.createTypeOfFrameRefStructure();
        tof.setRef( PARKING_TYPE_OF_FRAME);
        tof.setValue( NETEX_PARKING_VERSION);
        generalFrame.setTypeOfFrameRef( tof);

        generalFrame.setMembers( new GeneralFrameVersionStructure.Members());

        frames.getGeneralFrame().add( generalFrame);
        compositeFrame.setFrames( frames);

        dataObjects.setCompositeFrame( compositeFrame);
        publication.setDataObjects( dataObjects);

        return publication;
    }

}
