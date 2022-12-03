package com.example.psp.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Service
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class Service   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("tenantId")
  private Integer tenantId;

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("durationMins")
  private Integer durationMins;

  @JsonProperty("isAvailable")
  private Boolean isAvailable;

  @JsonProperty("taxRateId")
  private Integer taxRateId;

  public Service id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Service tenantId(Integer tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Get tenantId
   * @return tenantId
  */
  @ApiModelProperty(value = "")


  public Integer getTenantId() {
    return tenantId;
  }

  public void setTenantId(Integer tenantId) {
    this.tenantId = tenantId;
  }

  public Service name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public Service durationMins(Integer durationMins) {
    this.durationMins = durationMins;
    return this;
  }

  /**
   * Get durationMins
   * @return durationMins
  */
  @ApiModelProperty(value = "")


  public Integer getDurationMins() {
    return durationMins;
  }

  public void setDurationMins(Integer durationMins) {
    this.durationMins = durationMins;
  }

  public Service isAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * Get isAvailable
   * @return isAvailable
  */
  @ApiModelProperty(value = "")


  public Boolean getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(Boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public Service taxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
    return this;
  }

  /**
   * Get taxRateId
   * @return taxRateId
  */
  @ApiModelProperty(value = "")


  public Integer getTaxRateId() {
    return taxRateId;
  }

  public void setTaxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.id, service.id) &&
        Objects.equals(this.tenantId, service.tenantId) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.durationMins, service.durationMins) &&
        Objects.equals(this.isAvailable, service.isAvailable) &&
        Objects.equals(this.taxRateId, service.taxRateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, name, durationMins, isAvailable, taxRateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    durationMins: ").append(toIndentedString(durationMins)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    taxRateId: ").append(toIndentedString(taxRateId)).append("\n");
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

