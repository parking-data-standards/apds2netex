package org.apds.interop.apds2netex.netex;

import generated.eu.cen.netex.*;
import org.junit.Test;

import java.math.BigDecimal;

import static junit.framework.TestCase.*;

public class FactoryHelperTests {

    @Test
    public void createPostalAddressTest() {

        String TEST_ID = "123";
        PostalAddress address = ObjectFactoryHelper.createInstanceOfPostalAddress( TEST_ID);
        assertNotNull( "must have non-null address", address);
        assertNotNull( "must have non-null address id", address.getId());
        assertTrue( "full id must contain TEST_ID", address.getId().contains( TEST_ID));
        assertEquals( "version must match", ObjectFactoryHelper.ANY_VERSION, address.getVersion());
    }

    @Test
    public void createPointTest() {
        BigDecimal LAT = BigDecimal.valueOf(1.23);
        BigDecimal LON = BigDecimal.valueOf(4.56);
        SimplePointVersionStructure point = ObjectFactoryHelper.createInstanceOfSimplePoint( LAT, LON);
        assertNotNull( "must have non-null point instance", point);
        assertNotNull( "embedded location must not be null", point.getLocation());
        assertEquals( "latitude must match", LAT, point.getLocation().getLatitude());
        assertEquals( "longitude must match", LON, point.getLocation().getLongitude());
    }

    @Test
    public void createParkingRefTest() {
        String REF = "TESTREF";
        ParkingRefStructure refStruct = ObjectFactoryHelper.createInstanceOfParkingRefStructure( REF);
        assertNotNull( "must have non-null ref structure", refStruct);
        assertEquals( "reference must match", REF, refStruct.getRef());
    }

    @Test
    public void createOrganisationTest() {

        String ORG_ID = "789";
        String ORG_NAME = "ORG789";
        String ORG_NUMBER = "NUM789";
        GeneralOrganisation org = ObjectFactoryHelper.createInstanceOfGeneralOrganisation( ORG_ID, ORG_NAME, ORG_NUMBER);
        assertNotNull( "must have non-null organisation instance", org);
        assertEquals( "id must match", ORG_ID, org.getId());
        assertEquals( "name must match", ORG_NAME, org.getName().getValue());
        assertEquals( "number must match", ORG_NUMBER, org.getCompanyNumber());
    }

    @Test
    public void createTimeIntervalPriceTest() {
        String PRICE_ID = "P1";
        double PRICE_AMOUNT = 12.34;
        TimeIntervalPrice price = ObjectFactoryHelper.createInstanceOfTimeIntervalPrice( PRICE_ID, PRICE_AMOUNT);
        assertNotNull( "must have non-null price instance", price);
        assertTrue( "id must match", price.getId().contains( PRICE_ID));
        assertEquals( "version must match", ObjectFactoryHelper.ANY_VERSION, price.getVersion());
        assertEquals( "amount must match", PRICE_AMOUNT, price.getAmount());
    }

    @Test
    public void createChargeBandTest() {

        ParkingChargeBand band = ObjectFactoryHelper.createInstanceOfParkingChargeBand();
        assertNotNull( "must have non-null band instance", band);
        assertNotNull( "embeded prices must not be null", band.getPrices());
    }

    @Test
    public void createParkingTariffTest() {

        String TARIFF_ID = "T123";
        ParkingTariff tariff = ObjectFactoryHelper.createInstanceOfParkingTariff( TARIFF_ID);
        assertNotNull( "must have non-null tariff instance", tariff);
        assertNotNull( "applies-to list must not be null", tariff.getAppliesTo());
        assertNotNull( "bands list must not be null", tariff.getParkingChargeBands());
        assertEquals( "id must match", TARIFF_ID, tariff.getId());
    }

    @Test
    public void createParkingTest() {

        String PARKING_ID = "001";
        String PARKING_NAME = "P001";
        Parking parking = ObjectFactoryHelper.createInstanceOfParking( PARKING_ID, PARKING_NAME);
        assertNotNull( "must have non-null parking instance", parking);
        assertEquals( "id must match", PARKING_ID, parking.getId());
        assertEquals( "name must match", PARKING_NAME, parking.getName().getValue());
    }

    @Test
    public void createMinimalPublicationTest() {

        String FRAME_ID = "GF1";
        String PARTICIPANT_REF = "DEMO";
        PublicationDelivery publication = ObjectFactoryHelper.createInstanceOfPublicationDelivery( FRAME_ID, PARTICIPANT_REF);
        assertNotNull( "must have non-null publication instance", publication);
        assertEquals( "participant ref must match", PARTICIPANT_REF, publication.getParticipantRef());
    }
}
