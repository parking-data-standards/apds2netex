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
import generated.org.apds.model.ReferenceDTO;
import generated.org.apds.model.VersionedReferenceDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ReferencedCodeListEntryDTO
 */
@JsonPropertyOrder({
  ReferencedCodeListEntryDTO.JSON_PROPERTY_CODE_LIST_ENTRY_ID,
  ReferencedCodeListEntryDTO.JSON_PROPERTY_CODE_LIST_ID,
  ReferencedCodeListEntryDTO.JSON_PROPERTY_ENTRY_DEFINED_VALUE
})
@JsonTypeName("ReferencedCodeListEntry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-17T07:55:46.551856+02:00[Europe/Berlin]")
public class ReferencedCodeListEntryDTO {
  public static final String JSON_PROPERTY_CODE_LIST_ENTRY_ID = "codeListEntryId";
  private ReferenceDTO codeListEntryId;

  public static final String JSON_PROPERTY_CODE_LIST_ID = "codeListId";
  private VersionedReferenceDTO codeListId;

  public static final String JSON_PROPERTY_ENTRY_DEFINED_VALUE = "entryDefinedValue";
  private String entryDefinedValue;


  public ReferencedCodeListEntryDTO codeListEntryId(ReferenceDTO codeListEntryId) {
    
    this.codeListEntryId = codeListEntryId;
    return this;
  }

   /**
   * Get codeListEntryId
   * @return codeListEntryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE_LIST_ENTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReferenceDTO getCodeListEntryId() {
    return codeListEntryId;
  }


  @JsonProperty(JSON_PROPERTY_CODE_LIST_ENTRY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeListEntryId(ReferenceDTO codeListEntryId) {
    this.codeListEntryId = codeListEntryId;
  }


  public ReferencedCodeListEntryDTO codeListId(VersionedReferenceDTO codeListId) {
    
    this.codeListId = codeListId;
    return this;
  }

   /**
   * Get codeListId
   * @return codeListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VersionedReferenceDTO getCodeListId() {
    return codeListId;
  }


  @JsonProperty(JSON_PROPERTY_CODE_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCodeListId(VersionedReferenceDTO codeListId) {
    this.codeListId = codeListId;
  }


  public ReferencedCodeListEntryDTO entryDefinedValue(String entryDefinedValue) {
    
    this.entryDefinedValue = entryDefinedValue;
    return this;
  }

   /**
   * Get entryDefinedValue
   * @return entryDefinedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRY_DEFINED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntryDefinedValue() {
    return entryDefinedValue;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_DEFINED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntryDefinedValue(String entryDefinedValue) {
    this.entryDefinedValue = entryDefinedValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferencedCodeListEntryDTO referencedCodeListEntry = (ReferencedCodeListEntryDTO) o;
    return Objects.equals(this.codeListEntryId, referencedCodeListEntry.codeListEntryId) &&
        Objects.equals(this.codeListId, referencedCodeListEntry.codeListId) &&
        Objects.equals(this.entryDefinedValue, referencedCodeListEntry.entryDefinedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeListEntryId, codeListId, entryDefinedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferencedCodeListEntryDTO {\n");
    sb.append("    codeListEntryId: ").append(toIndentedString(codeListEntryId)).append("\n");
    sb.append("    codeListId: ").append(toIndentedString(codeListId)).append("\n");
    sb.append("    entryDefinedValue: ").append(toIndentedString(entryDefinedValue)).append("\n");
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

