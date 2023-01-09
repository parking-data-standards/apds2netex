package org.apds.interop.apds2netex.netex;

import org.apache.commons.io.output.XmlStreamWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;

public class NetexSerializer {

    public static boolean outputToFile( String fileName, String payload) {

        if ( fileName != null && !fileName.isEmpty()) {
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                PrintWriter writer = new PrintWriter( fileWriter);
                writer.print( payload);
                writer.close();
                return true;

            } catch ( Exception ignore) {
            }
        }
        return false;
    }

    public static <T> String serialize( Object object, Class<T> clazz) {

        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            StringWriter sw = new StringWriter();
            marshaller.marshal(object, sw);
            return stripNamespacePrefixes( sw.toString());
        } catch ( JAXBException ex) {
            return "";
        }
    }

    private static String stripNamespacePrefixes( String input) {
        return input.replaceAll( "</ns2:", "</").replaceAll( "<ns2:", "<");
    }
}
