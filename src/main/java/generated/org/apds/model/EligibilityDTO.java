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
import generated.org.apds.model.QualificationDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * EligibilityDTO
 */
@JsonPropertyOrder({
  EligibilityDTO.JSON_PROPERTY_ID,
  EligibilityDTO.JSON_PROPERTY_VERSION,
  EligibilityDTO.JSON_PROPERTY_QUALIFICATION
})
@JsonTypeName("Eligibility")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:19:50.624355+02:00[Europe/Berlin]")
public class EligibilityDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_QUALIFICATION = "qualification";
  private List<QualificationDTO> qualification = null;


  public EligibilityDTO id(String id) {
    
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


  public EligibilityDTO version(Integer version) {
    
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


  public EligibilityDTO qualification(List<QualificationDTO> qualification) {
    
    this.qualification = qualification;
    return this;
  }

  public EligibilityDTO addQualificationItem(QualificationDTO qualificationItem) {
    if (this.qualification == null) {
      this.qualification = new ArrayList<>();
    }
    this.qualification.add(qualificationItem);
    return this;
  }

   /**
   * Get qualification
   * @return qualification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUALIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<QualificationDTO> getQualification() {
    return qualification;
  }


  @JsonProperty(JSON_PROPERTY_QUALIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQualification(List<QualificationDTO> qualification) {
    this.qualification = qualification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EligibilityDTO eligibility = (EligibilityDTO) o;
    return Objects.equals(this.id, eligibility.id) &&
        Objects.equals(this.version, eligibility.version) &&
        Objects.equals(this.qualification, eligibility.qualification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, qualification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EligibilityDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
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

