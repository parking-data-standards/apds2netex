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
import generated.org.apds.model.RateEligibilityDTO;
import generated.org.apds.model.ValidityDTO;
import generated.org.apds.model.VersionedReferenceDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RightSpecificationDTO
 */
@JsonPropertyOrder({
  RightSpecificationDTO.JSON_PROPERTY_ID,
  RightSpecificationDTO.JSON_PROPERTY_VERSION,
  RightSpecificationDTO.JSON_PROPERTY_TYPE,
  RightSpecificationDTO.JSON_PROPERTY_DESCRIPTION,
  RightSpecificationDTO.JSON_PROPERTY_EXPIRY,
  RightSpecificationDTO.JSON_PROPERTY_RATE_ELIGIBILITY,
  RightSpecificationDTO.JSON_PROPERTY_HIERARCHY_ELEMENTS,
  RightSpecificationDTO.JSON_PROPERTY_VALIDITY
})
@JsonTypeName("RightSpecification")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:19:50.624355+02:00[Europe/Berlin]")
public class RightSpecificationDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private List<MultilingualStringDTO> description = null;

  public static final String JSON_PROPERTY_EXPIRY = "expiry";
  private OffsetDateTime expiry;

  public static final String JSON_PROPERTY_RATE_ELIGIBILITY = "rateEligibility";
  private List<RateEligibilityDTO> rateEligibility = null;

  public static final String JSON_PROPERTY_HIERARCHY_ELEMENTS = "hierarchyElements";
  private List<VersionedReferenceDTO> hierarchyElements = null;

  public static final String JSON_PROPERTY_VALIDITY = "validity";
  private ValidityDTO validity;


  public RightSpecificationDTO id(String id) {
    
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


  public RightSpecificationDTO version(Integer version) {
    
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


  public RightSpecificationDTO type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public RightSpecificationDTO description(List<MultilingualStringDTO> description) {
    
    this.description = description;
    return this;
  }

  public RightSpecificationDTO addDescriptionItem(MultilingualStringDTO descriptionItem) {
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


  public RightSpecificationDTO expiry(OffsetDateTime expiry) {
    
    this.expiry = expiry;
    return this;
  }

   /**
   * Get expiry
   * @return expiry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getExpiry() {
    return expiry;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiry(OffsetDateTime expiry) {
    this.expiry = expiry;
  }


  public RightSpecificationDTO rateEligibility(List<RateEligibilityDTO> rateEligibility) {
    
    this.rateEligibility = rateEligibility;
    return this;
  }

  public RightSpecificationDTO addRateEligibilityItem(RateEligibilityDTO rateEligibilityItem) {
    if (this.rateEligibility == null) {
      this.rateEligibility = new ArrayList<>();
    }
    this.rateEligibility.add(rateEligibilityItem);
    return this;
  }

   /**
   * Get rateEligibility
   * @return rateEligibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateEligibilityDTO> getRateEligibility() {
    return rateEligibility;
  }


  @JsonProperty(JSON_PROPERTY_RATE_ELIGIBILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateEligibility(List<RateEligibilityDTO> rateEligibility) {
    this.rateEligibility = rateEligibility;
  }


  public RightSpecificationDTO hierarchyElements(List<VersionedReferenceDTO> hierarchyElements) {
    
    this.hierarchyElements = hierarchyElements;
    return this;
  }

  public RightSpecificationDTO addHierarchyElementsItem(VersionedReferenceDTO hierarchyElementsItem) {
    if (this.hierarchyElements == null) {
      this.hierarchyElements = new ArrayList<>();
    }
    this.hierarchyElements.add(hierarchyElementsItem);
    return this;
  }

   /**
   * Get hierarchyElements
   * @return hierarchyElements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIERARCHY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<VersionedReferenceDTO> getHierarchyElements() {
    return hierarchyElements;
  }


  @JsonProperty(JSON_PROPERTY_HIERARCHY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHierarchyElements(List<VersionedReferenceDTO> hierarchyElements) {
    this.hierarchyElements = hierarchyElements;
  }


  public RightSpecificationDTO validity(ValidityDTO validity) {
    
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidityDTO getValidity() {
    return validity;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidity(ValidityDTO validity) {
    this.validity = validity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RightSpecificationDTO rightSpecification = (RightSpecificationDTO) o;
    return Objects.equals(this.id, rightSpecification.id) &&
        Objects.equals(this.version, rightSpecification.version) &&
        Objects.equals(this.type, rightSpecification.type) &&
        Objects.equals(this.description, rightSpecification.description) &&
        Objects.equals(this.expiry, rightSpecification.expiry) &&
        Objects.equals(this.rateEligibility, rightSpecification.rateEligibility) &&
        Objects.equals(this.hierarchyElements, rightSpecification.hierarchyElements) &&
        Objects.equals(this.validity, rightSpecification.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, type, description, expiry, rateEligibility, hierarchyElements, validity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RightSpecificationDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expiry: ").append(toIndentedString(expiry)).append("\n");
    sb.append("    rateEligibility: ").append(toIndentedString(rateEligibility)).append("\n");
    sb.append("    hierarchyElements: ").append(toIndentedString(hierarchyElements)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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
