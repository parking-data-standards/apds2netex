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
 * <p>Java class for StakeholderRoleTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StakeholderRoleTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Planning"/&gt;
 *     &lt;enumeration value="Operation"/&gt;
 *     &lt;enumeration value="Control"/&gt;
 *     &lt;enumeration value="Reservation"/&gt;
 *     &lt;enumeration value="EntityLegalOwnership"/&gt;
 *     &lt;enumeration value="FareManagement"/&gt;
 *     &lt;enumeration value="SecurityManagement"/&gt;
 *     &lt;enumeration value="DataRegistrar"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StakeholderRoleTypeEnumeration")
@XmlEnum
public enum StakeholderRoleTypeEnumeration {

    @XmlEnumValue("Planning")
    PLANNING("Planning"),
    @XmlEnumValue("Operation")
    OPERATION("Operation"),
    @XmlEnumValue("Control")
    CONTROL("Control"),
    @XmlEnumValue("Reservation")
    RESERVATION("Reservation"),
    @XmlEnumValue("EntityLegalOwnership")
    ENTITY_LEGAL_OWNERSHIP("EntityLegalOwnership"),
    @XmlEnumValue("FareManagement")
    FARE_MANAGEMENT("FareManagement"),
    @XmlEnumValue("SecurityManagement")
    SECURITY_MANAGEMENT("SecurityManagement"),
    @XmlEnumValue("DataRegistrar")
    DATA_REGISTRAR("DataRegistrar"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    StakeholderRoleTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StakeholderRoleTypeEnumeration fromValue(String v) {
        for (StakeholderRoleTypeEnumeration c: StakeholderRoleTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
