package org.apds.interop.apds2netex.netex;

import org.junit.Test;

import static junit.framework.TestCase.*;

public class SerializerTests {

    final String OUTPUT_PATH = "src/test/resources/temp/output.xml";

    @Test
    public void minimalSerializationTest() {

        PublicationDelivery publication = ObjectFactoryHelper.createInstanceOfPublicationDelivery( "F1", "P1");
        String stringRepresentaion = NetexSerializer.serialize( publication, PublicationDelivery.class);
        assertNotNull( "must be able to serialize publication", stringRepresentaion);
        assertFalse( "result must not be empty", stringRepresentaion.isEmpty());
        assertTrue( "must be able to output result to file", NetexSerializer.outputToFile( OUTPUT_PATH, stringRepresentaion));
    }
}
