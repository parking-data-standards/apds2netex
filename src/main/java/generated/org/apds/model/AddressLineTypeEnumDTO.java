/*
 * APDS message protocol
 * API specification for the \"NPP\" APDS model implementation
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: markus.schneider@plexx-digital.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package generated.org.apds.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A table of types of address lines   * &#x60;apartment&#x60;: Element indicating a discrete element of a building forming the address  * &#x60;building&#x60;: Element identifying the number or name and type of the edifice or construction relevant for the address [derived from ISO19160-4]  * &#x60;districtTerritory&#x60;: Element specifying the geographic or administrative area of the country for the address [Source: 19160-4]  * &#x60;floor&#x60;: Element indicating the floor or level on which a delivery point is located in a multi-storey building [Source:ISO19160-4]  * &#x60;poBox&#x60;: A postal delivery location identifier, not necessarily a physical location.  * &#x60;region&#x60;: Element indicating the name of the area within or adjacent to the town in which delivery address is.  * &#x60;street&#x60;: Element indicating road or street identifier or name   * &#x60;town&#x60;: Element indicating the name of the populated place in which a delivery point is located, or near to or via which the delivery point is accessed. [Source: ISO19160-4]  * &#x60;unit&#x60;: An element representing a section of a building or organisation.Free-text description of the condition that leads to a surcharge beingapplied
 */
public enum AddressLineTypeEnumDTO {
  
  APARTMENT("apartment"),
  
  BUILDING("building"),
  
  DISTRICTTERRITORY("districtTerritory"),
  
  FLOOR("floor"),
  
  POBOX("poBox"),
  
  REGION("region"),
  
  STREET("street"),
  
  TOWN("town"),
  
  UNIT("unit");

  private String value;

  AddressLineTypeEnumDTO(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AddressLineTypeEnumDTO fromValue(String value) {
    for (AddressLineTypeEnumDTO b : AddressLineTypeEnumDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
