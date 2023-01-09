//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.09 at 10:43:34 AM CET 
//


package generated.eu.cen.netex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for ParkingChargeBand complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingChargeBand"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumStay" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="prices"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TimeIntervalPrice" type="{http://www.netex.org.uk/netex}TimeIntervalPrice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingChargeBand", propOrder = {
    "maximumStay",
    "prices"
})
public class ParkingChargeBand {

    @XmlElement(name = "MaximumStay")
    protected Duration maximumStay;
    @XmlElement(required = true)
    protected ParkingChargeBand.Prices prices;

    /**
     * Gets the value of the maximumStay property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumStay() {
        return maximumStay;
    }

    /**
     * Sets the value of the maximumStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumStay(Duration value) {
        this.maximumStay = value;
    }

    /**
     * Gets the value of the prices property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingChargeBand.Prices }
     *     
     */
    public ParkingChargeBand.Prices getPrices() {
        return prices;
    }

    /**
     * Sets the value of the prices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingChargeBand.Prices }
     *     
     */
    public void setPrices(ParkingChargeBand.Prices value) {
        this.prices = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TimeIntervalPrice" type="{http://www.netex.org.uk/netex}TimeIntervalPrice" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "timeIntervalPrice"
    })
    public static class Prices {

        @XmlElement(name = "TimeIntervalPrice")
        protected List<TimeIntervalPrice> timeIntervalPrice;

        /**
         * Gets the value of the timeIntervalPrice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timeIntervalPrice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimeIntervalPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TimeIntervalPrice }
         * 
         * 
         */
        public List<TimeIntervalPrice> getTimeIntervalPrice() {
            if (timeIntervalPrice == null) {
                timeIntervalPrice = new ArrayList<TimeIntervalPrice>();
            }
            return this.timeIntervalPrice;
        }

    }

}