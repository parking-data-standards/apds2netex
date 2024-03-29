//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.17 at 07:55:45 AM CEST 
//


package generated.eu.cen.netex;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethodEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethodEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}normalizedString"&gt;
 *     &lt;enumeration value="cash"/&gt;
 *     &lt;enumeration value="cashExactChangeOnly"/&gt;
 *     &lt;enumeration value="cashAndCard"/&gt;
 *     &lt;enumeration value="coin"/&gt;
 *     &lt;enumeration value="banknote"/&gt;
 *     &lt;enumeration value="cheque"/&gt;
 *     &lt;enumeration value="travellersCheque"/&gt;
 *     &lt;enumeration value="postalOrder"/&gt;
 *     &lt;enumeration value="creditCard"/&gt;
 *     &lt;enumeration value="debitCard"/&gt;
 *     &lt;enumeration value="cardsOnly"/&gt;
 *     &lt;enumeration value="travelCard"/&gt;
 *     &lt;enumeration value="contactlessPaymentCard"/&gt;
 *     &lt;enumeration value="contactlessTravelCard"/&gt;
 *     &lt;enumeration value="directDebit"/&gt;
 *     &lt;enumeration value="bankTransfer"/&gt;
 *     &lt;enumeration value="epayDevice"/&gt;
 *     &lt;enumeration value="epayAccount"/&gt;
 *     &lt;enumeration value="sms"/&gt;
 *     &lt;enumeration value="mobilePhone"/&gt;
 *     &lt;enumeration value="voucher"/&gt;
 *     &lt;enumeration value="token"/&gt;
 *     &lt;enumeration value="warrant"/&gt;
 *     &lt;enumeration value="mileagePoints"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethodEnumeration")
@XmlEnum
public enum PaymentMethodEnumeration {

    @XmlEnumValue("cash")
    CASH("cash"),
    @XmlEnumValue("cashExactChangeOnly")
    CASH_EXACT_CHANGE_ONLY("cashExactChangeOnly"),
    @XmlEnumValue("cashAndCard")
    CASH_AND_CARD("cashAndCard"),
    @XmlEnumValue("coin")
    COIN("coin"),
    @XmlEnumValue("banknote")
    BANKNOTE("banknote"),
    @XmlEnumValue("cheque")
    CHEQUE("cheque"),
    @XmlEnumValue("travellersCheque")
    TRAVELLERS_CHEQUE("travellersCheque"),
    @XmlEnumValue("postalOrder")
    POSTAL_ORDER("postalOrder"),
    @XmlEnumValue("creditCard")
    CREDIT_CARD("creditCard"),
    @XmlEnumValue("debitCard")
    DEBIT_CARD("debitCard"),
    @XmlEnumValue("cardsOnly")
    CARDS_ONLY("cardsOnly"),
    @XmlEnumValue("travelCard")
    TRAVEL_CARD("travelCard"),
    @XmlEnumValue("contactlessPaymentCard")
    CONTACTLESS_PAYMENT_CARD("contactlessPaymentCard"),
    @XmlEnumValue("contactlessTravelCard")
    CONTACTLESS_TRAVEL_CARD("contactlessTravelCard"),
    @XmlEnumValue("directDebit")
    DIRECT_DEBIT("directDebit"),
    @XmlEnumValue("bankTransfer")
    BANK_TRANSFER("bankTransfer"),
    @XmlEnumValue("epayDevice")
    EPAY_DEVICE("epayDevice"),
    @XmlEnumValue("epayAccount")
    EPAY_ACCOUNT("epayAccount"),
    @XmlEnumValue("sms")
    SMS("sms"),
    @XmlEnumValue("mobilePhone")
    MOBILE_PHONE("mobilePhone"),
    @XmlEnumValue("voucher")
    VOUCHER("voucher"),
    @XmlEnumValue("token")
    TOKEN("token"),
    @XmlEnumValue("warrant")
    WARRANT("warrant"),
    @XmlEnumValue("mileagePoints")
    MILEAGE_POINTS("mileagePoints"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PaymentMethodEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentMethodEnumeration fromValue(String v) {
        for (PaymentMethodEnumeration c: PaymentMethodEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
