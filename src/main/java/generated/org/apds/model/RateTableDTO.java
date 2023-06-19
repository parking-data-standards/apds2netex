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
import generated.org.apds.model.RateLineCollectionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RateTableDTO
 */
@JsonPropertyOrder({
  RateTableDTO.JSON_PROPERTY_ID,
  RateTableDTO.JSON_PROPERTY_VERSION,
  RateTableDTO.JSON_PROPERTY_RATE_TABLE_NAME,
  RateTableDTO.JSON_PROPERTY_RATE_LINE_COLLECTIONS,
  RateTableDTO.JSON_PROPERTY_AVAILABILITY,
  RateTableDTO.JSON_PROPERTY_RATE_RESPONSIBLE_PARTY
})
@JsonTypeName("RateTable")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-06-19T10:20:52.894914+02:00[Europe/Berlin]")
public class RateTableDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public static final String JSON_PROPERTY_RATE_TABLE_NAME = "rateTableName";
  private List<MultilingualStringDTO> rateTableName = null;

  public static final String JSON_PROPERTY_RATE_LINE_COLLECTIONS = "rateLineCollections";
  private List<RateLineCollectionDTO> rateLineCollections = null;

  public static final String JSON_PROPERTY_AVAILABILITY = "availability";
  private String availability;

  public static final String JSON_PROPERTY_RATE_RESPONSIBLE_PARTY = "rateResponsibleParty";
  private String rateResponsibleParty;


  public RateTableDTO id(String id) {
    
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


  public RateTableDTO version(Integer version) {
    
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


  public RateTableDTO rateTableName(List<MultilingualStringDTO> rateTableName) {
    
    this.rateTableName = rateTableName;
    return this;
  }

  public RateTableDTO addRateTableNameItem(MultilingualStringDTO rateTableNameItem) {
    if (this.rateTableName == null) {
      this.rateTableName = new ArrayList<>();
    }
    this.rateTableName.add(rateTableNameItem);
    return this;
  }

   /**
   * Get rateTableName
   * @return rateTableName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MultilingualStringDTO> getRateTableName() {
    return rateTableName;
  }


  @JsonProperty(JSON_PROPERTY_RATE_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateTableName(List<MultilingualStringDTO> rateTableName) {
    this.rateTableName = rateTableName;
  }


  public RateTableDTO rateLineCollections(List<RateLineCollectionDTO> rateLineCollections) {
    
    this.rateLineCollections = rateLineCollections;
    return this;
  }

  public RateTableDTO addRateLineCollectionsItem(RateLineCollectionDTO rateLineCollectionsItem) {
    if (this.rateLineCollections == null) {
      this.rateLineCollections = new ArrayList<>();
    }
    this.rateLineCollections.add(rateLineCollectionsItem);
    return this;
  }

   /**
   * Get rateLineCollections
   * @return rateLineCollections
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE_LINE_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RateLineCollectionDTO> getRateLineCollections() {
    return rateLineCollections;
  }


  @JsonProperty(JSON_PROPERTY_RATE_LINE_COLLECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateLineCollections(List<RateLineCollectionDTO> rateLineCollections) {
    this.rateLineCollections = rateLineCollections;
  }


  public RateTableDTO availability(String availability) {
    
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailability() {
    return availability;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailability(String availability) {
    this.availability = availability;
  }


  public RateTableDTO rateResponsibleParty(String rateResponsibleParty) {
    
    this.rateResponsibleParty = rateResponsibleParty;
    return this;
  }

   /**
   * Get rateResponsibleParty
   * @return rateResponsibleParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATE_RESPONSIBLE_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRateResponsibleParty() {
    return rateResponsibleParty;
  }


  @JsonProperty(JSON_PROPERTY_RATE_RESPONSIBLE_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateResponsibleParty(String rateResponsibleParty) {
    this.rateResponsibleParty = rateResponsibleParty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateTableDTO rateTable = (RateTableDTO) o;
    return Objects.equals(this.id, rateTable.id) &&
        Objects.equals(this.version, rateTable.version) &&
        Objects.equals(this.rateTableName, rateTable.rateTableName) &&
        Objects.equals(this.rateLineCollections, rateTable.rateLineCollections) &&
        Objects.equals(this.availability, rateTable.availability) &&
        Objects.equals(this.rateResponsibleParty, rateTable.rateResponsibleParty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, rateTableName, rateLineCollections, availability, rateResponsibleParty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateTableDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    rateTableName: ").append(toIndentedString(rateTableName)).append("\n");
    sb.append("    rateLineCollections: ").append(toIndentedString(rateLineCollections)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    rateResponsibleParty: ").append(toIndentedString(rateResponsibleParty)).append("\n");
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

