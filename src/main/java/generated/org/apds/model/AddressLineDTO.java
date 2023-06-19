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
import generated.org.apds.model.AddressLineTypeEnumDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A class defining information concerning one line of a postal address.
 */
@ApiModel(description = "A class defining information concerning one line of a postal address.")
@JsonPropertyOrder({
  AddressLineDTO.JSON_PROPERTY_ORDER,
  AddressLineDTO.JSON_PROPERTY_TEXT,
  AddressLineDTO.JSON_PROPERTY_TYPE
})
@JsonTypeName("AddressLine")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class AddressLineDTO {
  public static final String JSON_PROPERTY_ORDER = "order";
  private Integer order;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_TYPE = "type";
  private AddressLineTypeEnumDTO type;


  public AddressLineDTO order(Integer order) {
    
    this.order = order;
    return this;
  }

   /**
   * the sequence order that the address line element should be displayed in
   * minimum: 0
   * @return order
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "the sequence order that the address line element should be displayed in")
  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getOrder() {
    return order;
  }


  @JsonProperty(JSON_PROPERTY_ORDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrder(Integer order) {
    this.order = order;
  }


  public AddressLineDTO text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setText(String text) {
    this.text = text;
  }


  public AddressLineDTO type(AddressLineTypeEnumDTO type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AddressLineTypeEnumDTO getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(AddressLineTypeEnumDTO type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressLineDTO addressLine = (AddressLineDTO) o;
    return Objects.equals(this.order, addressLine.order) &&
        Objects.equals(this.text, addressLine.text) &&
        Objects.equals(this.type, addressLine.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressLineDTO {\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

