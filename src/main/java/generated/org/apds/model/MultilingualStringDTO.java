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
 * MultilingualStringDTO
 */
@JsonPropertyOrder({
  MultilingualStringDTO.JSON_PROPERTY_LANGUAGE,
  MultilingualStringDTO.JSON_PROPERTY_STRING
})
@JsonTypeName("MultilingualString")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T14:26:16.713251+02:00[Europe/Berlin]")
public class MultilingualStringDTO {
  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_STRING = "string";
  private String string;


  public MultilingualStringDTO language(String language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public MultilingualStringDTO string(String string) {
    
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getString() {
    return string;
  }


  @JsonProperty(JSON_PROPERTY_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setString(String string) {
    this.string = string;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultilingualStringDTO multilingualString = (MultilingualStringDTO) o;
    return Objects.equals(this.language, multilingualString.language) &&
        Objects.equals(this.string, multilingualString.string);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language, string);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultilingualStringDTO {\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
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

