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
import generated.org.apds.model.DayOfWeekEnumDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RecurringDayWeekMonthPeriodDTO
 */
@JsonPropertyOrder({
  RecurringDayWeekMonthPeriodDTO.JSON_PROPERTY_APPLICABLE_DAY
})
@JsonTypeName("RecurringDayWeekMonthPeriod")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-17T07:55:46.551856+02:00[Europe/Berlin]")
public class RecurringDayWeekMonthPeriodDTO {
  public static final String JSON_PROPERTY_APPLICABLE_DAY = "applicableDay";
  private List<DayOfWeekEnumDTO> applicableDay = null;


  public RecurringDayWeekMonthPeriodDTO applicableDay(List<DayOfWeekEnumDTO> applicableDay) {
    
    this.applicableDay = applicableDay;
    return this;
  }

  public RecurringDayWeekMonthPeriodDTO addApplicableDayItem(DayOfWeekEnumDTO applicableDayItem) {
    if (this.applicableDay == null) {
      this.applicableDay = new ArrayList<>();
    }
    this.applicableDay.add(applicableDayItem);
    return this;
  }

   /**
   * Get applicableDay
   * @return applicableDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICABLE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DayOfWeekEnumDTO> getApplicableDay() {
    return applicableDay;
  }


  @JsonProperty(JSON_PROPERTY_APPLICABLE_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicableDay(List<DayOfWeekEnumDTO> applicableDay) {
    this.applicableDay = applicableDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringDayWeekMonthPeriodDTO recurringDayWeekMonthPeriod = (RecurringDayWeekMonthPeriodDTO) o;
    return Objects.equals(this.applicableDay, recurringDayWeekMonthPeriod.applicableDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicableDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringDayWeekMonthPeriodDTO {\n");
    sb.append("    applicableDay: ").append(toIndentedString(applicableDay)).append("\n");
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

