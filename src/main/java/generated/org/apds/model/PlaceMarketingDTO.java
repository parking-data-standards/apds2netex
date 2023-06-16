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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PlaceMarketingDTO
 */
@JsonPropertyOrder({
  PlaceMarketingDTO.JSON_PROPERTY_WEB_U_R_LS
})
@JsonTypeName("Place_marketing")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-16T13:19:50.624355+02:00[Europe/Berlin]")
public class PlaceMarketingDTO {
  public static final String JSON_PROPERTY_WEB_U_R_LS = "webURLs";
  private List<String> webURLs = null;


  public PlaceMarketingDTO webURLs(List<String> webURLs) {
    
    this.webURLs = webURLs;
    return this;
  }

  public PlaceMarketingDTO addWebURLsItem(String webURLsItem) {
    if (this.webURLs == null) {
      this.webURLs = new ArrayList<>();
    }
    this.webURLs.add(webURLsItem);
    return this;
  }

   /**
   * Get webURLs
   * @return webURLs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_U_R_LS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getWebURLs() {
    return webURLs;
  }


  @JsonProperty(JSON_PROPERTY_WEB_U_R_LS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWebURLs(List<String> webURLs) {
    this.webURLs = webURLs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceMarketingDTO placeMarketing = (PlaceMarketingDTO) o;
    return Objects.equals(this.webURLs, placeMarketing.webURLs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webURLs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaceMarketingDTO {\n");
    sb.append("    webURLs: ").append(toIndentedString(webURLs)).append("\n");
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
