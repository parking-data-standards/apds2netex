//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.16 at 02:26:09 PM CEST 
//


package generated.eu.cen.netex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingPaymentProcessEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingPaymentProcessEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="free"/&gt;
 *     &lt;enumeration value="payAtBay"/&gt;
 *     &lt;enumeration value="payAndDisplay"/&gt;
 *     &lt;enumeration value="payAtExitBoothManualCollection"/&gt;
 *     &lt;enumeration value="payAtMachineOnFootPriorToExit"/&gt;
 *     &lt;enumeration value="payByPrepaidToken"/&gt;
 *     &lt;enumeration value="payByMobileDevice"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingPaymentProcessEnumeration")
@XmlEnum
public enum ParkingPaymentProcessEnumeration {

    @XmlEnumValue("free")
    FREE("free"),
    @XmlEnumValue("payAtBay")
    PAY_AT_BAY("payAtBay"),
    @XmlEnumValue("payAndDisplay")
    PAY_AND_DISPLAY("payAndDisplay"),
    @XmlEnumValue("payAtExitBoothManualCollection")
    PAY_AT_EXIT_BOOTH_MANUAL_COLLECTION("payAtExitBoothManualCollection"),
    @XmlEnumValue("payAtMachineOnFootPriorToExit")
    PAY_AT_MACHINE_ON_FOOT_PRIOR_TO_EXIT("payAtMachineOnFootPriorToExit"),
    @XmlEnumValue("payByPrepaidToken")
    PAY_BY_PREPAID_TOKEN("payByPrepaidToken"),
    @XmlEnumValue("payByMobileDevice")
    PAY_BY_MOBILE_DEVICE("payByMobileDevice"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingPaymentProcessEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingPaymentProcessEnumeration fromValue(String v) {
        for (ParkingPaymentProcessEnumeration c: ParkingPaymentProcessEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
