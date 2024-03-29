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
import generated.org.apds.model.EligibilityDTO;
import generated.org.apds.model.VersionedReferenceDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RateEligibilityDTO
 */
@JsonPropertyOrder({
  RateEligibilityDTO.JSON_PROPERTY_ID,
  RateEligibilityDTO.JSON_PROPERTY_VERSION,
  RateEligibilityDTO.JSON_PROPERTY_RATE,
  RateEligibilityDTO.JSON_PROPERTY_ELIGIBILITY
})
@JsonTypeName("RateEligibility")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class RateEligibilityDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_RATE = "rate";
  private VersionedReferenceDTO rate;

  public static final String JSON_PROPERTY_ELIGIBILITY = "eligibility";
  private EligibilityDTO eligibility;


  public RateEligibilityDTO id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public RateEligibilityDTO version(Integer version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(Integer version) {
    this.version = version;
  }


  public RateEligibilityDTO rate(VersionedReferenceDTO rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VersionedReferenceDTO getRate() {
    return rate;
  }


  @JsonProperty(JSON_PROPERTY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRate(VersionedReferenceDTO rate) {
    this.rate = rate;
  }


  public RateEligibilityDTO eligibility(EligibilityDTO eligibility) {
    
    this.eligibility = eligibility;
    return this;
  }

   /**
   * Get eligibility
   * @return eligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EligibilityDTO getEligibility() {
    return eligibility;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEligibility(EligibilityDTO eligibility) {
    this.eligibility = eligibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateEligibilityDTO rateEligibility = (RateEligibilityDTO) o;
    return Objects.equals(this.id, rateEligibility.id) &&
        Objects.equals(this.version, rateEligibility.version) &&
        Objects.equals(this.rate, rateEligibility.rate) &&
        Objects.equals(this.eligibility, rateEligibility.eligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, rate, eligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateEligibilityDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    eligibility: ").append(toIndentedString(eligibility)).append("\n");
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

