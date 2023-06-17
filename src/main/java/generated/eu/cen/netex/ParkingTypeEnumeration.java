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
 * <p>Java class for ParkingTypeEnumeration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParkingTypeEnumeration"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="parkAndRide"/&gt;
 *     &lt;enumeration value="liftShareParking"/&gt;
 *     &lt;enumeration value="urbanParking"/&gt;
 *     &lt;enumeration value="airportParking"/&gt;
 *     &lt;enumeration value="trainStationParking"/&gt;
 *     &lt;enumeration value="exhibitionCentreParking"/&gt;
 *     &lt;enumeration value="rentalCarParking"/&gt;
 *     &lt;enumeration value="shoppingCentreParking"/&gt;
 *     &lt;enumeration value="motorwayParking"/&gt;
 *     &lt;enumeration value="roadside"/&gt;
 *     &lt;enumeration value="parkingZone"/&gt;
 *     &lt;enumeration value="undefined"/&gt;
 *     &lt;enumeration value="cycleRental"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ParkingTypeEnumeration")
@XmlEnum
public enum ParkingTypeEnumeration {

    @XmlEnumValue("parkAndRide")
    PARK_AND_RIDE("parkAndRide"),
    @XmlEnumValue("liftShareParking")
    LIFT_SHARE_PARKING("liftShareParking"),
    @XmlEnumValue("urbanParking")
    URBAN_PARKING("urbanParking"),
    @XmlEnumValue("airportParking")
    AIRPORT_PARKING("airportParking"),
    @XmlEnumValue("trainStationParking")
    TRAIN_STATION_PARKING("trainStationParking"),
    @XmlEnumValue("exhibitionCentreParking")
    EXHIBITION_CENTRE_PARKING("exhibitionCentreParking"),
    @XmlEnumValue("rentalCarParking")
    RENTAL_CAR_PARKING("rentalCarParking"),
    @XmlEnumValue("shoppingCentreParking")
    SHOPPING_CENTRE_PARKING("shoppingCentreParking"),
    @XmlEnumValue("motorwayParking")
    MOTORWAY_PARKING("motorwayParking"),
    @XmlEnumValue("roadside")
    ROADSIDE("roadside"),
    @XmlEnumValue("parkingZone")
    PARKING_ZONE("parkingZone"),
    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("cycleRental")
    CYCLE_RENTAL("cycleRental"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ParkingTypeEnumeration(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ParkingTypeEnumeration fromValue(String v) {
        for (ParkingTypeEnumeration c: ParkingTypeEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
