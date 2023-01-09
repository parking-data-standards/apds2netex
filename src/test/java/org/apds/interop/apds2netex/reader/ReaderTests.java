package org.apds.interop.apds2netex.reader;

import generated.org.apds.model.PlaceDTO;
import generated.org.apds.model.RateTableDTO;
import generated.org.apds.model.RightSpecificationDTO;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class ReaderTests {

    final String TEST_PLACE_FILE = "src/test/resources/2places.json";
    final String TEST_PLACE2_FILE = "src/test/resources/arndale_places.json";
    final String TEST_RIGHT_FILE = "src/test/resources/arndale_rights.json";
    final String TEST_RATE_FILE = "src/test/resources/arndale_rates.json";
    final String RATE_ID = "0376c349-ed20-4f6f-9551-1a82f9f5f734";
    final String RIGHT_ID = "6091d5d0-5264-4d66-a31a-1a9e2c9eed89";
    final String PLACE1_ID = "place1_id";
    final String PLACE1_NAME ="place1_name";
    final String PLACE2_ID = "place2_id";
    final String PLACE2_NAME = "place2_name";

    @Test
    public void readToStringTest() throws IOException {

        String fileAsString = ApdsDataReader.getAsStringFromInputStream(
                Files.newInputStream(new File(TEST_PLACE_FILE).toPath())
        );
        assertNotNull( "must have non-null result", fileAsString);
    }

    @Test
    public void readSimplePlacesToListTest() throws IOException {
        InputStream source = Files.newInputStream(new File(TEST_PLACE_FILE).toPath());
        assertNotNull( "must have non-null source stream", source);
        List<PlaceDTO> places = ApdsDataReader.getPlacesFromInputStream( source);
        assertNotNull( "must be able to deserialize", places);
        assertEquals( "must have list with 2 places", 2, places.size());
        PlaceDTO place1 = places.get(0);
        assertEquals( "id must match", PLACE1_ID, place1.getId());
        assert place1.getName() != null;
        assertEquals( "name must match", PLACE1_NAME, place1.getName().getEn());
        PlaceDTO place2 = places.get(1);
        assertEquals( "id must match", PLACE2_ID, place2.getId());
        assert place2.getName() != null;
        assertEquals( "name must match", PLACE2_NAME, place2.getName().getEn());
    }

    @Test
    public void readComplexPlacesToListTest() throws IOException {
        InputStream source = Files.newInputStream(new File(TEST_PLACE2_FILE).toPath());
        assertNotNull( "must have non-null source stream", source);
        List<PlaceDTO> places = ApdsDataReader.getPlacesFromInputStream( source);
        assertNotNull( "must be able to deserialize", places);
        assertEquals( "must have list with 1 place", 1, places.size());
    }

    @Test
    public void readRightToListTest() throws IOException {

        InputStream source = Files.newInputStream( new File( TEST_RIGHT_FILE).toPath());
        assertNotNull( "must have non-null source stream", source);
        List<RightSpecificationDTO> rights = ApdsDataReader.getRightsFromInputStream( source);
        assertNotNull( "must be able to deserialize right(s)", rights);
        assertEquals( "must have exactly 1 right in list", 1, rights.size());
        RightSpecificationDTO right = rights.get(0);
        assertEquals( "id must match", RIGHT_ID, right.getId());
    }

    @Test
    public void readRateToListTest() throws IOException {

        InputStream source = Files.newInputStream( new File( TEST_RATE_FILE).toPath());
        assertNotNull( "must have non-null source stream", source);
        List<RateTableDTO> rates = ApdsDataReader.getRatesFromInputStream( source);
        assertNotNull( "must be able to deserialize right(s)", rates);
        assertEquals( "must have exactly 1 right in list", 1, rates.size());
        RateTableDTO rate = rates.get(0);
        assertEquals( "id must match", RATE_ID, rate.getId());
    }
}
