package org.apds.interop.apds2netex.builder;

import generated.eu.cen.netex.PublicationDeliveryStructure;
import org.apds.interop.apds2netex.netex.PublicationDelivery;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import static junit.framework.TestCase.assertNotNull;

public class SimpleBuilderTests {

    final String TEST_RIGHT_FILE = "src/test/resources/arndale_rights.json";
    final String TEST_RATE_FILE = "src/test/resources/arndale_rates.json";
    final String TEST_PLACE_FILE = "src/test/resources/arndale_places.json";

    @Test
    public void minimalBuildTest() throws IOException {

        InputStream placesSource = Files.newInputStream( new File( TEST_PLACE_FILE).toPath());
        InputStream ratesSource = Files.newInputStream( new File( TEST_RATE_FILE).toPath());
        InputStream rightsSource = Files.newInputStream( new File( TEST_RIGHT_FILE).toPath());

        Apds2NetexBuilder builder =
            Apds2NetexBuilder
                .newInstance()
                .usingPlaces( placesSource)
                .usingRates( ratesSource)
                .usingRights( rightsSource);

        PublicationDelivery publication = builder.build();
        System.out.println( builder.getLastError());
        assertNotNull( "must have non-null publication by now", publication);
    }
}
