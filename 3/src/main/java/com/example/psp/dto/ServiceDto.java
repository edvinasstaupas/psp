package com.example.psp.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ServiceDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ServiceDto   {
  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("durationMins")
  private Integer durationMins;

  @JsonProperty("isAvailable")
  private Boolean isAvailable;

  @JsonProperty("taxRateId")
  private Integer taxRateId;

  public ServiceDto name(String name) {
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

  public ServiceDto durationMins(Integer durationMins) {
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

  public ServiceDto isAvailable(Boolean isAvailable) {
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

  public ServiceDto taxRateId(Integer taxRateId) {
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
    ServiceDto serviceDto = (ServiceDto) o;
    return Objects.equals(this.name, serviceDto.name) &&
        Objects.equals(this.durationMins, serviceDto.durationMins) &&
        Objects.equals(this.isAvailable, serviceDto.isAvailable) &&
        Objects.equals(this.taxRateId, serviceDto.taxRateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, durationMins, isAvailable, taxRateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDto {\n");
    
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

