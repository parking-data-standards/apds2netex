//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.06.16 at 01:18:17 PM CEST 
//


package generated.eu.cen.netex;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GeneralFrame_VersionStructure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralFrame_VersionStructure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeOfFrameRef" type="{http://www.netex.org.uk/netex}TypeOfFrameRefStructure"/&gt;
 *         &lt;element name="members"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Parking" type="{http://www.netex.org.uk/netex}Parking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ParkingTariff" type="{http://www.netex.org.uk/netex}ParkingTariff" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.netex.org.uk/netex}GeneralOrganisation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="ResponsibilitySet" type="{http://www.netex.org.uk/netex}ResponsibilitySet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.netex.org.uk/netex}DataManagedObjectAttributeGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralFrame_VersionStructure", propOrder = {
    "typeOfFrameRef",
    "members"
})
public class GeneralFrameVersionStructure {

    @XmlElement(name = "TypeOfFrameRef", required = true)
    protected TypeOfFrameRefStructure typeOfFrameRef;
    @XmlElement(required = true)
    protected GeneralFrameVersionStructure.Members members;
    @XmlAttribute(name = "nameOfClass")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "Name")
    protected String nameOfClass;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String id;
    @XmlAttribute(name = "dataSourceRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dataSourceRef;
    @XmlAttribute(name = "created")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar created;
    @XmlAttribute(name = "changed")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changed;
    @XmlAttribute(name = "modification")
    protected ModificationEnumeration modification;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String version;
    @XmlAttribute(name = "status")
    protected StatusEnumeration status;
    @XmlAttribute(name = "derivedFromVersionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String derivedFromVersionRef;
    @XmlAttribute(name = "compatibleWithVersionFrameVersionRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String compatibleWithVersionFrameVersionRef;
    @XmlAttribute(name = "derivedFromObjectRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String derivedFromObjectRef;
    @XmlAttribute(name = "responsibilitySetRef")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String responsibilitySetRef;

    /**
     * Gets the value of the typeOfFrameRef property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfFrameRefStructure }
     *     
     */
    public TypeOfFrameRefStructure getTypeOfFrameRef() {
        return typeOfFrameRef;
    }

    /**
     * Sets the value of the typeOfFrameRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfFrameRefStructure }
     *     
     */
    public void setTypeOfFrameRef(TypeOfFrameRefStructure value) {
        this.typeOfFrameRef = value;
    }

    /**
     * Gets the value of the members property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralFrameVersionStructure.Members }
     *     
     */
    public GeneralFrameVersionStructure.Members getMembers() {
        return members;
    }

    /**
     * Sets the value of the members property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralFrameVersionStructure.Members }
     *     
     */
    public void setMembers(GeneralFrameVersionStructure.Members value) {
        this.members = value;
    }

    /**
     * Gets the value of the nameOfClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfClass() {
        return nameOfClass;
    }

    /**
     * Sets the value of the nameOfClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfClass(String value) {
        this.nameOfClass = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the dataSourceRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSourceRef() {
        return dataSourceRef;
    }

    /**
     * Sets the value of the dataSourceRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSourceRef(String value) {
        this.dataSourceRef = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreated(XMLGregorianCalendar value) {
        this.created = value;
    }

    /**
     * Gets the value of the changed property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChanged() {
        return changed;
    }

    /**
     * Sets the value of the changed property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChanged(XMLGregorianCalendar value) {
        this.changed = value;
    }

    /**
     * Gets the value of the modification property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationEnumeration }
     *     
     */
    public ModificationEnumeration getModification() {
        if (modification == null) {
            return ModificationEnumeration.NEW;
        } else {
            return modification;
        }
    }

    /**
     * Sets the value of the modification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationEnumeration }
     *     
     */
    public void setModification(ModificationEnumeration value) {
        this.modification = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusEnumeration }
     *     
     */
    public StatusEnumeration getStatus() {
        if (status == null) {
            return StatusEnumeration.ACTIVE;
        } else {
            return status;
        }
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnumeration }
     *     
     */
    public void setStatus(StatusEnumeration value) {
        this.status = value;
    }

    /**
     * Gets the value of the derivedFromVersionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromVersionRef() {
        return derivedFromVersionRef;
    }

    /**
     * Sets the value of the derivedFromVersionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromVersionRef(String value) {
        this.derivedFromVersionRef = value;
    }

    /**
     * Gets the value of the compatibleWithVersionFrameVersionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleWithVersionFrameVersionRef() {
        return compatibleWithVersionFrameVersionRef;
    }

    /**
     * Sets the value of the compatibleWithVersionFrameVersionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleWithVersionFrameVersionRef(String value) {
        this.compatibleWithVersionFrameVersionRef = value;
    }

    /**
     * Gets the value of the derivedFromObjectRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDerivedFromObjectRef() {
        return derivedFromObjectRef;
    }

    /**
     * Sets the value of the derivedFromObjectRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDerivedFromObjectRef(String value) {
        this.derivedFromObjectRef = value;
    }

    /**
     * Gets the value of the responsibilitySetRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibilitySetRef() {
        return responsibilitySetRef;
    }

    /**
     * Sets the value of the responsibilitySetRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibilitySetRef(String value) {
        this.responsibilitySetRef = value;
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
     *         &lt;element name="Parking" type="{http://www.netex.org.uk/netex}Parking" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ParkingTariff" type="{http://www.netex.org.uk/netex}ParkingTariff" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.netex.org.uk/netex}GeneralOrganisation" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ResponsibilitySet" type="{http://www.netex.org.uk/netex}ResponsibilitySet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "parking",
        "parkingTariff",
        "generalOrganisation",
        "responsibilitySet"
    })
    public static class Members {

        @XmlElement(name = "Parking")
        protected List<Parking> parking;
        @XmlElement(name = "ParkingTariff")
        protected List<ParkingTariff> parkingTariff;
        @XmlElement(name = "GeneralOrganisation")
        protected List<GeneralOrganisation> generalOrganisation;
        @XmlElement(name = "ResponsibilitySet")
        protected List<ResponsibilitySet> responsibilitySet;

        /**
         * Gets the value of the parking property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parking property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParking().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Parking }
         * 
         * 
         */
        public List<Parking> getParking() {
            if (parking == null) {
                parking = new ArrayList<Parking>();
            }
            return this.parking;
        }

        /**
         * Gets the value of the parkingTariff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parkingTariff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParkingTariff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParkingTariff }
         * 
         * 
         */
        public List<ParkingTariff> getParkingTariff() {
            if (parkingTariff == null) {
                parkingTariff = new ArrayList<ParkingTariff>();
            }
            return this.parkingTariff;
        }

        /**
         * Gets the value of the generalOrganisation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the generalOrganisation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGeneralOrganisation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GeneralOrganisation }
         * 
         * 
         */
        public List<GeneralOrganisation> getGeneralOrganisation() {
            if (generalOrganisation == null) {
                generalOrganisation = new ArrayList<GeneralOrganisation>();
            }
            return this.generalOrganisation;
        }

        /**
         * Gets the value of the responsibilitySet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responsibilitySet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponsibilitySet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResponsibilitySet }
         * 
         * 
         */
        public List<ResponsibilitySet> getResponsibilitySet() {
            if (responsibilitySet == null) {
                responsibilitySet = new ArrayList<ResponsibilitySet>();
            }
            return this.responsibilitySet;
        }

    }

}
