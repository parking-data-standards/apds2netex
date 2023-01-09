//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.09 at 10:43:34 AM CET 
//


package generated.eu.cen.netex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingLayoutEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingLayoutEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="covered"/&gt;
 *     &lt;enumeration value="openSpace"/&gt;
 *     &lt;enumeration value="multistorey"/&gt;
 *     &lt;enumeration value="underground"/&gt;
 *     &lt;enumeration value="roadside"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="cycleHire"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingLayoutEnumeration")
@XmlEnum
public enum ParkingLayoutEnumeration {

    @XmlEnumValue("covered")
    COVERED("covered"),
    @XmlEnumValue("openSpace")
    OPEN_SPACE("openSpace"),
    @XmlEnumValue("multistorey")
    MULTISTOREY("multistorey"),
    @XmlEnumValue("underground")
    UNDERGROUND("underground"),
    @XmlEnumValue("roadside")
    ROADSIDE("roadside"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("cycleHire")
    CYCLE_HIRE("cycleHire");
    private final String value;

    ParkingLayoutEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingLayoutEnumeration fromValue(String v) {
        for (ParkingLayoutEnumeration c: ParkingLayoutEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}