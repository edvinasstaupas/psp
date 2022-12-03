package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * ApplyTaxRateToCategoryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ApplyTaxRateToCategoryDTO   {
  @JsonProperty("categoryId")
  private Integer categoryId;

  @JsonProperty("taxRateId")
  private Integer taxRateId;

  public ApplyTaxRateToCategoryDTO categoryId(Integer categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  @ApiModelProperty(value = "")


  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public ApplyTaxRateToCategoryDTO taxRateId(Integer taxRateId) {
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
    ApplyTaxRateToCategoryDTO applyTaxRateToCategoryDTO = (ApplyTaxRateToCategoryDTO) o;
    return Objects.equals(this.categoryId, applyTaxRateToCategoryDTO.categoryId) &&
        Objects.equals(this.taxRateId, applyTaxRateToCategoryDTO.taxRateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, taxRateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplyTaxRateToCategoryDTO {\n");
    
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

