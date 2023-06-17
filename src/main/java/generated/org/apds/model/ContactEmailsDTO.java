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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ContactEmailsDTO
 */
@JsonPropertyOrder({
  ContactEmailsDTO.JSON_PROPERTY_ADDRESS,
  ContactEmailsDTO.JSON_PROPERTY_TYPE_CODE
})
@JsonTypeName("Contact_emails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-17T07:55:46.551856+02:00[Europe/Berlin]")
public class ContactEmailsDTO {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_TYPE_CODE = "typeCode";
  private String typeCode;


  public ContactEmailsDTO address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public ContactEmailsDTO typeCode(String typeCode) {
    
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTypeCode() {
    return typeCode;
  }


  @JsonProperty(JSON_PROPERTY_TYPE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypeCode(String typeCode) {
    this.typeCode = typeCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactEmailsDTO contactEmails = (ContactEmailsDTO) o;
    return Objects.equals(this.address, contactEmails.address) &&
        Objects.equals(this.typeCode, contactEmails.typeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, typeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactEmailsDTO {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
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

