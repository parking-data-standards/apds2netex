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
import generated.org.apds.model.MultilingualStringDTO;
import generated.org.apds.model.PeriodRecurringSpecialDayDTO;
import generated.org.apds.model.RecurringDayWeekMonthPeriodDTO;
import generated.org.apds.model.RecurringTimePeriodOfDayDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PeriodDTO
 */
@JsonPropertyOrder({
  PeriodDTO.JSON_PROPERTY_PERIOD_NAME,
  PeriodDTO.JSON_PROPERTY_START_OF_PERIOD,
  PeriodDTO.JSON_PROPERTY_END_OF_PERIOD,
  PeriodDTO.JSON_PROPERTY_RECURRING_TIME_PERIOD_OF_DAY,
  PeriodDTO.JSON_PROPERTY_RECURRING_DAY_WEEK_MONTH_PERIOD,
  PeriodDTO.JSON_PROPERTY_RECURRING_SPECIAL_DAY
})
@JsonTypeName("Period")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:19:50.624355+02:00[Europe/Berlin]")
public class PeriodDTO {
  public static final String JSON_PROPERTY_PERIOD_NAME = "periodName";
  private List<MultilingualStringDTO> periodName = null;

  public static final String JSON_PROPERTY_START_OF_PERIOD = "startOfPeriod";
  private OffsetDateTime startOfPeriod;

  public static final String JSON_PROPERTY_END_OF_PERIOD = "endOfPeriod";
  private OffsetDateTime endOfPeriod;

  public static final String JSON_PROPERTY_RECURRING_TIME_PERIOD_OF_DAY = "recurringTimePeriodOfDay";
  private RecurringTimePeriodOfDayDTO recurringTimePeriodOfDay;

  public static final String JSON_PROPERTY_RECURRING_DAY_WEEK_MONTH_PERIOD = "recurringDayWeekMonthPeriod";
  private RecurringDayWeekMonthPeriodDTO recurringDayWeekMonthPeriod;

  public static final String JSON_PROPERTY_RECURRING_SPECIAL_DAY = "recurringSpecialDay";
  private List<PeriodRecurringSpecialDayDTO> recurringSpecialDay = null;


  public PeriodDTO periodName(List<MultilingualStringDTO> periodName) {
    
    this.periodName = periodName;
    return this;
  }

  public PeriodDTO addPeriodNameItem(MultilingualStringDTO periodNameItem) {
    if (this.periodName == null) {
      this.periodName = new ArrayList<>();
    }
    this.periodName.add(periodNameItem);
    return this;
  }

   /**
   * Get periodName
   * @return periodName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIOD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultilingualStringDTO> getPeriodName() {
    return periodName;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodName(List<MultilingualStringDTO> periodName) {
    this.periodName = periodName;
  }


  public PeriodDTO startOfPeriod(OffsetDateTime startOfPeriod) {
    
    this.startOfPeriod = startOfPeriod;
    return this;
  }

   /**
   * Get startOfPeriod
   * @return startOfPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_OF_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartOfPeriod() {
    return startOfPeriod;
  }


  @JsonProperty(JSON_PROPERTY_START_OF_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartOfPeriod(OffsetDateTime startOfPeriod) {
    this.startOfPeriod = startOfPeriod;
  }


  public PeriodDTO endOfPeriod(OffsetDateTime endOfPeriod) {
    
    this.endOfPeriod = endOfPeriod;
    return this;
  }

   /**
   * Get endOfPeriod
   * @return endOfPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_OF_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndOfPeriod() {
    return endOfPeriod;
  }


  @JsonProperty(JSON_PROPERTY_END_OF_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndOfPeriod(OffsetDateTime endOfPeriod) {
    this.endOfPeriod = endOfPeriod;
  }


  public PeriodDTO recurringTimePeriodOfDay(RecurringTimePeriodOfDayDTO recurringTimePeriodOfDay) {
    
    this.recurringTimePeriodOfDay = recurringTimePeriodOfDay;
    return this;
  }

   /**
   * Get recurringTimePeriodOfDay
   * @return recurringTimePeriodOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_TIME_PERIOD_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringTimePeriodOfDayDTO getRecurringTimePeriodOfDay() {
    return recurringTimePeriodOfDay;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_TIME_PERIOD_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringTimePeriodOfDay(RecurringTimePeriodOfDayDTO recurringTimePeriodOfDay) {
    this.recurringTimePeriodOfDay = recurringTimePeriodOfDay;
  }


  public PeriodDTO recurringDayWeekMonthPeriod(RecurringDayWeekMonthPeriodDTO recurringDayWeekMonthPeriod) {
    
    this.recurringDayWeekMonthPeriod = recurringDayWeekMonthPeriod;
    return this;
  }

   /**
   * Get recurringDayWeekMonthPeriod
   * @return recurringDayWeekMonthPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_DAY_WEEK_MONTH_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RecurringDayWeekMonthPeriodDTO getRecurringDayWeekMonthPeriod() {
    return recurringDayWeekMonthPeriod;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DAY_WEEK_MONTH_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDayWeekMonthPeriod(RecurringDayWeekMonthPeriodDTO recurringDayWeekMonthPeriod) {
    this.recurringDayWeekMonthPeriod = recurringDayWeekMonthPeriod;
  }


  public PeriodDTO recurringSpecialDay(List<PeriodRecurringSpecialDayDTO> recurringSpecialDay) {
    
    this.recurringSpecialDay = recurringSpecialDay;
    return this;
  }

  public PeriodDTO addRecurringSpecialDayItem(PeriodRecurringSpecialDayDTO recurringSpecialDayItem) {
    if (this.recurringSpecialDay == null) {
      this.recurringSpecialDay = new ArrayList<>();
    }
    this.recurringSpecialDay.add(recurringSpecialDayItem);
    return this;
  }

   /**
   * Get recurringSpecialDay
   * @return recurringSpecialDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECURRING_SPECIAL_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PeriodRecurringSpecialDayDTO> getRecurringSpecialDay() {
    return recurringSpecialDay;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_SPECIAL_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringSpecialDay(List<PeriodRecurringSpecialDayDTO> recurringSpecialDay) {
    this.recurringSpecialDay = recurringSpecialDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeriodDTO period = (PeriodDTO) o;
    return Objects.equals(this.periodName, period.periodName) &&
        Objects.equals(this.startOfPeriod, period.startOfPeriod) &&
        Objects.equals(this.endOfPeriod, period.endOfPeriod) &&
        Objects.equals(this.recurringTimePeriodOfDay, period.recurringTimePeriodOfDay) &&
        Objects.equals(this.recurringDayWeekMonthPeriod, period.recurringDayWeekMonthPeriod) &&
        Objects.equals(this.recurringSpecialDay, period.recurringSpecialDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodName, startOfPeriod, endOfPeriod, recurringTimePeriodOfDay, recurringDayWeekMonthPeriod, recurringSpecialDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeriodDTO {\n");
    sb.append("    periodName: ").append(toIndentedString(periodName)).append("\n");
    sb.append("    startOfPeriod: ").append(toIndentedString(startOfPeriod)).append("\n");
    sb.append("    endOfPeriod: ").append(toIndentedString(endOfPeriod)).append("\n");
    sb.append("    recurringTimePeriodOfDay: ").append(toIndentedString(recurringTimePeriodOfDay)).append("\n");
    sb.append("    recurringDayWeekMonthPeriod: ").append(toIndentedString(recurringDayWeekMonthPeriod)).append("\n");
    sb.append("    recurringSpecialDay: ").append(toIndentedString(recurringSpecialDay)).append("\n");
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

