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
import generated.org.apds.model.ContactEmailsDTO;
import generated.org.apds.model.ContactTypeEnumDTO;
import generated.org.apds.model.MultilingualStringDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContactDTO
 */
@JsonPropertyOrder({
  ContactDTO.JSON_PROPERTY_ORGANISATION_NAME,
  ContactDTO.JSON_PROPERTY_TYPE,
  ContactDTO.JSON_PROPERTY_EMAILS
})
@JsonTypeName("Contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class ContactDTO {
  public static final String JSON_PROPERTY_ORGANISATION_NAME = "organisationName";
  private List<MultilingualStringDTO> organisationName = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ContactTypeEnumDTO type;

  public static final String JSON_PROPERTY_EMAILS = "emails";
  private List<ContactEmailsDTO> emails = null;


  public ContactDTO organisationName(List<MultilingualStringDTO> organisationName) {
    
    this.organisationName = organisationName;
    return this;
  }

  public ContactDTO addOrganisationNameItem(MultilingualStringDTO organisationNameItem) {
    if (this.organisationName == null) {
      this.organisationName = new ArrayList<>();
    }
    this.organisationName.add(organisationNameItem);
    return this;
  }

   /**
   * Get organisationName
   * @return organisationName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ORGANISATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultilingualStringDTO> getOrganisationName() {
    return organisationName;
  }


  @JsonProperty(JSON_PROPERTY_ORGANISATION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrganisationName(List<MultilingualStringDTO> organisationName) {
    this.organisationName = organisationName;
  }


  public ContactDTO type(ContactTypeEnumDTO type) {
    
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


  public ContactDTO emails(List<ContactEmailsDTO> emails) {
    
    this.emails = emails;
    return this;
  }

  public ContactDTO addEmailsItem(ContactEmailsDTO emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

   /**
   * Get emails
   * @return emails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ContactEmailsDTO> getEmails() {
    return emails;
  }


  @JsonProperty(JSON_PROPERTY_EMAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmails(List<ContactEmailsDTO> emails) {
    this.emails = emails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactDTO contact = (ContactDTO) o;
    return Objects.equals(this.organisationName, contact.organisationName) &&
        Objects.equals(this.type, contact.type) &&
        Objects.equals(this.emails, contact.emails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organisationName, type, emails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactDTO {\n");
    sb.append("    organisationName: ").append(toIndentedString(organisationName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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

