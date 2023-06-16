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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RateLineDTO
 */
@JsonPropertyOrder({
  RateLineDTO.JSON_PROPERTY_SEQUENCE,
  RateLineDTO.JSON_PROPERTY_DESCRIPTION,
  RateLineDTO.JSON_PROPERTY_RATE_LINE_TYPE,
  RateLineDTO.JSON_PROPERTY_VALUE,
  RateLineDTO.JSON_PROPERTY_DURATION_START,
  RateLineDTO.JSON_PROPERTY_DURATION_END,
  RateLineDTO.JSON_PROPERTY_INCREMENT_PERIOD
})
@JsonTypeName("RateLine")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:19:50.624355+02:00[Europe/Berlin]")
public class RateLineDTO {
  public static final String JSON_PROPERTY_SEQUENCE = "sequence";
  private Integer sequence;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private List<MultilingualStringDTO> description = null;

  public static final String JSON_PROPERTY_RATE_LINE_TYPE = "rateLineType";
  private String rateLineType;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_DURATION_START = "durationStart";
  private String durationStart;

  public static final String JSON_PROPERTY_DURATION_END = "durationEnd";
  private String durationEnd;

  public static final String JSON_PROPERTY_INCREMENT_PERIOD = "incrementPeriod";
  private String incrementPeriod;


  public RateLineDTO sequence(Integer sequence) {
    
    this.sequence = sequence;
    return this;
  }

   /**
   * Get sequence
   * @return sequence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSequence() {
    return sequence;
  }


  @JsonProperty(JSON_PROPERTY_SEQUENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }


  public RateLineDTO description(List<MultilingualStringDTO> description) {
    
    this.description = description;
    return this;
  }

  public RateLineDTO addDescriptionItem(MultilingualStringDTO descriptionItem) {
    if (this.description == null) {
      this.description = new ArrayList<>();
    }
    this.description.add(descriptionItem);
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultilingualStringDTO> getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(List<MultilingualStringDTO> description) {
    this.description = description;
  }


  public RateLineDTO rateLineType(String rateLineType) {
    
    this.rateLineType = rateLineType;
    return this;
  }

   /**
   * Get rateLineType
   * @return rateLineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRateLineType() {
    return rateLineType;
  }


  @JsonProperty(JSON_PROPERTY_RATE_LINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateLineType(String rateLineType) {
    this.rateLineType = rateLineType;
  }


  public RateLineDTO value(BigDecimal value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public RateLineDTO durationStart(String durationStart) {
    
    this.durationStart = durationStart;
    return this;
  }

   /**
   * Get durationStart
   * @return durationStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDurationStart() {
    return durationStart;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationStart(String durationStart) {
    this.durationStart = durationStart;
  }


  public RateLineDTO durationEnd(String durationEnd) {
    
    this.durationEnd = durationEnd;
    return this;
  }

   /**
   * Get durationEnd
   * @return durationEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDurationEnd() {
    return durationEnd;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationEnd(String durationEnd) {
    this.durationEnd = durationEnd;
  }


  public RateLineDTO incrementPeriod(String incrementPeriod) {
    
    this.incrementPeriod = incrementPeriod;
    return this;
  }

   /**
   * Get incrementPeriod
   * @return incrementPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INCREMENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIncrementPeriod() {
    return incrementPeriod;
  }


  @JsonProperty(JSON_PROPERTY_INCREMENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncrementPeriod(String incrementPeriod) {
    this.incrementPeriod = incrementPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateLineDTO rateLine = (RateLineDTO) o;
    return Objects.equals(this.sequence, rateLine.sequence) &&
        Objects.equals(this.description, rateLine.description) &&
        Objects.equals(this.rateLineType, rateLine.rateLineType) &&
        Objects.equals(this.value, rateLine.value) &&
        Objects.equals(this.durationStart, rateLine.durationStart) &&
        Objects.equals(this.durationEnd, rateLine.durationEnd) &&
        Objects.equals(this.incrementPeriod, rateLine.incrementPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, description, rateLineType, value, durationStart, durationEnd, incrementPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateLineDTO {\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rateLineType: ").append(toIndentedString(rateLineType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    durationStart: ").append(toIndentedString(durationStart)).append("\n");
    sb.append("    durationEnd: ").append(toIndentedString(durationEnd)).append("\n");
    sb.append("    incrementPeriod: ").append(toIndentedString(incrementPeriod)).append("\n");
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
