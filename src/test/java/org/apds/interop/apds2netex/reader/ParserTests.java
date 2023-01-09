package org.apds.interop.apds2netex.reader;

import generated.org.apds.model.RateTableDTO;
import generated.org.apds.model.RightSpecificationDTO;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static junit.framework.TestCase.*;

public class ParserTests {

    final String TEST_RIGHT_FILE = "src/test/resources/arndale_rights.json";
    final String TEST_RATE_FILE = "src/test/resources/arndale_rates.json";
    final String EXISTING_RATE = "0376c349-ed20-4f6f-9551-1a82f9f5f734";
    final String NON_EXISTING_RATE = "XXX";
    final String EXISTING_RIGHT = "6091d5d0-5264-4d66-a31a-1a9e2c9eed89";
    final String NON_EXISTING_RIGHT = "YYY";

    @Test
    public void simpleRateLookUpTest() throws IOException {
        List<RateTableDTO> rates = ApdsDataReader.getRatesFromInputStream(Files.newInputStream( new File(TEST_RATE_FILE).toPath()));
        assert rates != null;
        assertNull( "query of non-existing rate must return null", ApdsDataParser.getRateById( NON_EXISTING_RATE, rates));
        RateTableDTO rate = ApdsDataParser.getRateById( EXISTING_RATE, rates);
        assertNotNull( "query of existing rate must not return null", rate);
        assertEquals( "id must match", EXISTING_RATE, rate.getId());
    }

    @Test
    public void simpleRightLookUpTest() throws IOException {
        List<RightSpecificationDTO> rights = ApdsDataReader.getRightsFromInputStream( Files.newInputStream( new File( TEST_RIGHT_FILE).toPath()));
        assert rights != null;
        assertNull( "query of non-existing right must return null", ApdsDataParser.getRightById( NON_EXISTING_RIGHT, rights));
        RightSpecificationDTO right = ApdsDataParser.getRightById( EXISTING_RIGHT, rights);
        assertNotNull( "query of existing right must not return null", right);
        assertEquals( "id must match", EXISTING_RIGHT, right.getId());
    }
}
