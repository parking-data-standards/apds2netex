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
import generated.org.apds.model.OverallPeriodDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlaceTimesDTO
 */
@JsonPropertyOrder({
  PlaceTimesDTO.JSON_PROPERTY_OPERATING_TIME
})
@JsonTypeName("Place_times")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class PlaceTimesDTO {
  public static final String JSON_PROPERTY_OPERATING_TIME = "operatingTime";
  private OverallPeriodDTO operatingTime;


  public PlaceTimesDTO operatingTime(OverallPeriodDTO operatingTime) {
    
    this.operatingTime = operatingTime;
    return this;
  }

   /**
   * Get operatingTime
   * @return operatingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OverallPeriodDTO getOperatingTime() {
    return operatingTime;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingTime(OverallPeriodDTO operatingTime) {
    this.operatingTime = operatingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceTimesDTO placeTimes = (PlaceTimesDTO) o;
    return Objects.equals(this.operatingTime, placeTimes.operatingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operatingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceTimesDTO {\n");
    sb.append("    operatingTime: ").append(toIndentedString(operatingTime)).append("\n");
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

