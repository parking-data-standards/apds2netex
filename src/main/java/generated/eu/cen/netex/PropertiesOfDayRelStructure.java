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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertiesOfDay_RelStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertiesOfDay_RelStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyOfDay"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DaysOfWeek" type="{http://www.netex.org.uk/netex}DaysOfWeekListOfEnumerations" minOccurs="0"/&gt;
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
@XmlType(name = "propertiesOfDay_RelStructure", propOrder = {
    "propertyOfDay"
})
public class PropertiesOfDayRelStructure {

    @XmlElement(name = "PropertyOfDay", required = true)
    protected PropertiesOfDayRelStructure.PropertyOfDay propertyOfDay;

    /**
     * Gets the value of the propertyOfDay property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesOfDayRelStructure.PropertyOfDay }
     *     
     */
    public PropertiesOfDayRelStructure.PropertyOfDay getPropertyOfDay() {
        return propertyOfDay;
    }

    /**
     * Sets the value of the propertyOfDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesOfDayRelStructure.PropertyOfDay }
     *     
     */
    public void setPropertyOfDay(PropertiesOfDayRelStructure.PropertyOfDay value) {
        this.propertyOfDay = value;
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
     *         &lt;element name="DaysOfWeek" type="{http://www.netex.org.uk/netex}DaysOfWeekListOfEnumerations" minOccurs="0"/&gt;
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
        "daysOfWeek"
    })
    public static class PropertyOfDay {

        @XmlList
        @XmlElement(name = "DaysOfWeek")
        protected List<DayOfWeekEnumeration> daysOfWeek;

        /**
         * Gets the value of the daysOfWeek property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the daysOfWeek property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDaysOfWeek().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DayOfWeekEnumeration }
         * 
         * 
         */
        public List<DayOfWeekEnumeration> getDaysOfWeek() {
            if (daysOfWeek == null) {
                daysOfWeek = new ArrayList<DayOfWeekEnumeration>();
            }
            return this.daysOfWeek;
        }

    }

}
