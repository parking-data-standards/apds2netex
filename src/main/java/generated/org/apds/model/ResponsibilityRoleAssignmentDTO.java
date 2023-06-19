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
import generated.org.apds.model.ContactTypeEnumDTO;
import generated.org.apds.model.OrganisationDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ResponsibilityRoleAssignmentDTO
 */
@JsonPropertyOrder({
  ResponsibilityRoleAssignmentDTO.JSON_PROPERTY_TYPE,
  ResponsibilityRoleAssignmentDTO.JSON_PROPERTY_ORGANISATION
})
@JsonTypeName("ResponsibilityRoleAssignment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class ResponsibilityRoleAssignmentDTO {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ContactTypeEnumDTO type;

  public static final String JSON_PROPERTY_ORGANISATION = "organisation";
  private OrganisationDTO organisation;


  public ResponsibilityRoleAssignmentDTO type(ContactTypeEnumDTO type) {
    
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

  public ContactTypeEnumDTO getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(ContactTypeEnumDTO type) {
    this.type = type;
  }


  public ResponsibilityRoleAssignmentDTO organisation(OrganisationDTO organisation) {
    
    this.organisation = organisation;
    return this;
  }

   /**
   * Get organisation
   * @return organisation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANISATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrganisationDTO getOrganisation() {
    return organisation;
  }


  @JsonProperty(JSON_PROPERTY_ORGANISATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganisation(OrganisationDTO organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsibilityRoleAssignmentDTO responsibilityRoleAssignment = (ResponsibilityRoleAssignmentDTO) o;
    return Objects.equals(this.type, responsibilityRoleAssignment.type) &&
        Objects.equals(this.organisation, responsibilityRoleAssignment.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, organisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsibilityRoleAssignmentDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
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

