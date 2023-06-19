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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import generated.org.apds.model.SpecialDayTypeEnumDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PeriodRecurringSpecialDayDTO
 */
@JsonPropertyOrder({
  PeriodRecurringSpecialDayDTO.JSON_PROPERTY_SPECIAL_DAY_TYPE
})
@JsonTypeName("Period_recurringSpecialDay")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class PeriodRecurringSpecialDayDTO {
  public static final String JSON_PROPERTY_SPECIAL_DAY_TYPE = "specialDayType";
  private SpecialDayTypeEnumDTO specialDayType;


  public PeriodRecurringSpecialDayDTO specialDayType(SpecialDayTypeEnumDTO specialDayType) {
    
    this.specialDayType = specialDayType;
    return this;
  }

   /**
   * Get specialDayType
   * @return specialDayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPECIAL_DAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SpecialDayTypeEnumDTO getSpecialDayType() {
    return specialDayType;
  }


  @JsonProperty(JSON_PROPERTY_SPECIAL_DAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialDayType(SpecialDayTypeEnumDTO specialDayType) {
    this.specialDayType = specialDayType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodRecurringSpecialDayDTO periodRecurringSpecialDay = (PeriodRecurringSpecialDayDTO) o;
    return Objects.equals(this.specialDayType, periodRecurringSpecialDay.specialDayType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(specialDayType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodRecurringSpecialDayDTO {\n");
    sb.append("    specialDayType: ").append(toIndentedString(specialDayType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

