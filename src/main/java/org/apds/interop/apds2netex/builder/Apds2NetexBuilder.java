package org.apds.interop.apds2netex.builder;


import generated.eu.cen.netex.GeneralOrganisation;
import generated.eu.cen.netex.Parking;
import generated.eu.cen.netex.ParkingTariff;
import generated.eu.cen.netex.ResponsibilitySet;
import generated.org.apds.model.PlaceDTO;
import generated.org.apds.model.RateTableDTO;
import generated.org.apds.model.RightSpecificationDTO;
import generated.org.apds.model.VersionedReferenceDTO;
import org.apds.interop.apds2netex.netex.ObjectFactoryHelper;
import org.apds.interop.apds2netex.netex.PublicationDelivery;
import org.apds.interop.apds2netex.reader.ApdsDataParser;
import org.apds.interop.apds2netex.reader.ApdsDataReader;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Apds2NetexBuilder {

    private InputStream placesSource;
    private InputStream ratesSource;
    private InputStream rightsSource;
    private String lastError;
    private List<PlaceDTO> places;
    private List<RightSpecificationDTO> rights;
    private List<RateTableDTO> rates;

    private String FRAME_ID = "GF1";
    private String PARTICIPANT_REF = "APDS_DEMO";

    public final String ERR_NO_PLACES_SOURCE = "no input source for APDS places specified";
    public final String ERR_NO_RATES_SOURCE = "no input source for APDS rates specified";
    public final String ERR_NO_RIGHTS_SOURCE = "no input source for APDS right specifications specified";
    public final String ERR_READ_PLACES = "failed to read places input file or map contents to valid list of APDS places";
    public final String ERR_READ_RATES = "failed to read rates input file or map contents to valid list of APDS rates";
    public final String ERR_READ_RIGHTS = "failed to read rights input file or map contents to valid list of APDS right specifications";
    public final String ERR_NO_PLACES = "no places in data source";

    public Apds2NetexBuilder usingPlaces( InputStream placesSource) {
        this.placesSource = placesSource;
        return this;
    }

    public Apds2NetexBuilder usingPlaces( String placesSourceFile) {
        try {
            this.placesSource = Files.newInputStream( new File( placesSourceFile).toPath());
        } catch ( Exception ex) {
        }
        return this;
    }

    public Apds2NetexBuilder usingRates( String ratesSourceFile) {
        try {
            this.ratesSource = Files.newInputStream( new File( ratesSourceFile).toPath());
        } catch ( Exception ex) {

        }
        return this;
    }

    public Apds2NetexBuilder usingRights( String rightsSourceFile) {
        try {
            this.rightsSource = Files.newInputStream( new File( rightsSourceFile).toPath());
        } catch ( Exception ex) {

        }
        return this;
    }

    public Apds2NetexBuilder usingRates( InputStream ratesSource) {
        this.ratesSource = ratesSource;
        return this;
    }

    public Apds2NetexBuilder usingRights( InputStream rightsSource) {
        this.rightsSource = rightsSource;
        return this;
    }

    public PublicationDelivery build() {

        lastError = null;

        if ( placesSource == null) {
            lastError = ERR_NO_PLACES_SOURCE;
            return null;
        }

        if ( ratesSource == null) {
            lastError = ERR_NO_RATES_SOURCE;
            return null;
        }

        if ( rightsSource == null) {
            lastError = ERR_NO_RIGHTS_SOURCE;
        }

        places = ApdsDataReader.getPlacesFromInputStream( placesSource);
        if ( places == null) {
            lastError = ERR_READ_PLACES;
            return null;
        }

        if ( places.size() == 0) {
            lastError = ERR_NO_PLACES;
            return null;
        }

        rates = ApdsDataReader.getRatesFromInputStream( ratesSource);
        if ( rates == null) {
            lastError = ERR_READ_RATES;
            return null;
        }

        rights = ApdsDataReader.getRightsFromInputStream( rightsSource);
        if ( rights == null) {
            lastError = ERR_READ_RIGHTS;
            return null;
        }

        PublicationDelivery publication = ObjectFactoryHelper.createInstanceOfPublicationDelivery( FRAME_ID, PARTICIPANT_REF);

        // PLACES
        for ( PlaceDTO place : places) {
            Parking parking = ObjectFactoryHelper.createInstanceOfParking( place.getId(), getNonNullName( place));
            Apds2NetexTransformer.populateFromApdsPlace( parking, place);
            ObjectFactoryHelper.addMember( publication, parking);

            if ( place.getResponsibilityRoleAssignments() != null) {
                ResponsibilitySet respSet = Apds2NetexTransformer.responsibilitySetFromPlaceDTO( place);
                ObjectFactoryHelper.addMember( publication, respSet);
                List<GeneralOrganisation> organisations = Apds2NetexTransformer.getOrganisationsFromPlaceDTO( place);
                for ( GeneralOrganisation org : organisations) {
                    ObjectFactoryHelper.addMember( publication, org);
                }
            }

            // RIGHT SPECIFICATION + RATES
            VersionedReferenceDTO rightRef = place.getRightSpecifications() != null ? place.getRightSpecifications().get(0) : null;
            RightSpecificationDTO right = rightRef != null ? ApdsDataParser.getRightById( rightRef.getId(), rights) : null;
            if ( right != null) {
                List<String> placeIds = collectPlaceIds( right);
                if ( right.getRateEligibility() != null && right.getRateEligibility().size() > 0) {
                    VersionedReferenceDTO rateRef = right.getRateEligibility().get(0).getRate();
                    if  ( rateRef != null) {
                        RateTableDTO rate = ApdsDataParser.getRateById(rateRef.getId(), rates);
                        if ( rate != null) {
                            ParkingTariff tariff = ObjectFactoryHelper.createInstanceOfParkingTariff(UUID.randomUUID().toString() + ":" + rate.getId());
                            Apds2NetexTransformer.populateFromApdsRate( tariff, rate, placeIds);
                            ObjectFactoryHelper.addMember( publication, tariff);
                        }
                    }
                }
            }
        }

        return publication;
    }

    private static List<String> collectPlaceIds( RightSpecificationDTO right) {
        List<String> placeIds = new ArrayList<>();
        if ( right.getHierarchyElements() != null) {
            for ( VersionedReferenceDTO placeRef : right.getHierarchyElements()) {
                placeIds.add( placeRef.getId());
            }
        }
        return placeIds;
    }

    public static Apds2NetexBuilder newInstance() {
        return new Apds2NetexBuilder();
    }
    public String getLastError() { return lastError;}
    public boolean isSuccess() { return lastError == null;}
    public Apds2NetexBuilder forParticipantRef( String participantRef) { this.PARTICIPANT_REF = participantRef; return this;}
    public Apds2NetexBuilder forFrameId( String frameId) { this.FRAME_ID = frameId; return this;}
    private String getNonNullName( PlaceDTO place) { return place.getName() != null && place.getName().size() > 0 ? place.getName().get(0).getString() : "";}
}
