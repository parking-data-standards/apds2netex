//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.16 at 01:18:17 PM CEST 
//


package generated.eu.cen.netex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="revise"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="unchanged"/&gt;
 *     &lt;enumeration value="delta"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ModificationEnumeration")
@XmlEnum
public enum ModificationEnumeration {

    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("revise")
    REVISE("revise"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("unchanged")
    UNCHANGED("unchanged"),
    @XmlEnumValue("delta")
    DELTA("delta");
    private final String value;

    ModificationEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationEnumeration fromValue(String v) {
        for (ModificationEnumeration c: ModificationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
