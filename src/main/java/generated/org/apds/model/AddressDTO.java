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
import generated.org.apds.model.AddressLineDTO;
import generated.org.apds.model.MultilingualStringDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A street oriented addressing structure supporting delivery
 */
@ApiModel(description = "A street oriented addressing structure supporting delivery")
@JsonPropertyOrder({
  AddressDTO.JSON_PROPERTY_ADDRESS_LINES,
  AddressDTO.JSON_PROPERTY_CITY,
  AddressDTO.JSON_PROPERTY_COUNTRY_CODE,
  AddressDTO.JSON_PROPERTY_POST_CODE
})
@JsonTypeName("Address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class AddressDTO {
  public static final String JSON_PROPERTY_ADDRESS_LINES = "addressLines";
  private List<AddressLineDTO> addressLines = null;

  public static final String JSON_PROPERTY_CITY = "city";
  private List<MultilingualStringDTO> city = null;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_POST_CODE = "postCode";
  private String postCode;


  public AddressDTO addressLines(List<AddressLineDTO> addressLines) {
    
    this.addressLines = addressLines;
    return this;
  }

  public AddressDTO addAddressLinesItem(AddressLineDTO addressLinesItem) {
    if (this.addressLines == null) {
      this.addressLines = new ArrayList<>();
    }
    this.addressLines.add(addressLinesItem);
    return this;
  }

   /**
   * Address lines
   * @return addressLines
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Address lines")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AddressLineDTO> getAddressLines() {
    return addressLines;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLines(List<AddressLineDTO> addressLines) {
    this.addressLines = addressLines;
  }


  public AddressDTO city(List<MultilingualStringDTO> city) {
    
    this.city = city;
    return this;
  }

  public AddressDTO addCityItem(MultilingualStringDTO cityItem) {
    if (this.city == null) {
      this.city = new ArrayList<>();
    }
    this.city.add(cityItem);
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultilingualStringDTO> getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(List<MultilingualStringDTO> city) {
    this.city = city;
  }


  public AddressDTO countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * EN ISO 3166-1 two-character country code.
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "es", value = "EN ISO 3166-1 two-character country code.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public AddressDTO postCode(String postCode) {
    
    this.postCode = postCode;
    return this;
  }

   /**
   * Postcode or postal code for the address.
   * @return postCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postcode or postal code for the address.")
  @JsonProperty(JSON_PROPERTY_POST_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostCode() {
    return postCode;
  }


  @JsonProperty(JSON_PROPERTY_POST_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDTO address = (AddressDTO) o;
    return Objects.equals(this.addressLines, address.addressLines) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.postCode, address.postCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLines, city, countryCode, postCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDTO {\n");
    sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
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

