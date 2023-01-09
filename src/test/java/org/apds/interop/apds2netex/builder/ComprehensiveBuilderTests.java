package org.apds.interop.apds2netex.builder;

import org.apds.interop.apds2netex.netex.NetexSerializer;
import org.apds.interop.apds2netex.netex.PublicationDelivery;
import org.junit.Test;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class ComprehensiveBuilderTests {

    final String TEST_RIGHT_FILE = "src/test/resources/arndale_rights.json";
    final String TEST_RATE_FILE = "src/test/resources/arndale_rates.json";
    final String TEST_PLACE_FILE = "src/test/resources/arndale_places.json";
    final String OUTPUT_FILE = "src/test/resources/temp/arndale.xml";

    @Test
    public void buildFromComprehensiveInputTest() {

        Apds2NetexBuilder builder = Apds2NetexBuilder
                .newInstance()
                .usingPlaces( TEST_PLACE_FILE)
                .usingRights( TEST_RIGHT_FILE)
                .usingRates( TEST_RATE_FILE);

        PublicationDelivery publication = builder.build();
        assertTrue( "operation must be successful", builder.isSuccess());

        String stringRepresentation = NetexSerializer.serialize( publication, PublicationDelivery.class);
        assertNotNull( "must be able to serialize result", stringRepresentation);
        NetexSerializer.outputToFile( OUTPUT_FILE, stringRepresentation);
    }
}
