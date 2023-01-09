package org.apds.interop.apds2netex.datetime;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.Instant;
import java.util.GregorianCalendar;

public class XmlDateTime {

    public static XMLGregorianCalendar now() {

        try {
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTimeInMillis(Instant.now().toEpochMilli());
            return DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
        } catch ( DatatypeConfigurationException configEx) {
            return null;
        }
    }
}
