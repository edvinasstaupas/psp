package com.example.psp.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * AssignDiscountToBrandDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class AssignDiscountToBrandDTO   {
  @JsonProperty("discountId")
  private Integer discountId;

  @JsonProperty("brandId")
  private Integer brandId;

  public AssignDiscountToBrandDTO discountId(Integer discountId) {
    this.discountId = discountId;
    return this;
  }

  /**
   * Get discountId
   * @return discountId
  */
  @ApiModelProperty(value = "")


  public Integer getDiscountId() {
    return discountId;
  }

  public void setDiscountId(Integer discountId) {
    this.discountId = discountId;
  }

  public AssignDiscountToBrandDTO brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  */
  @ApiModelProperty(value = "")


  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignDiscountToBrandDTO assignDiscountToBrandDTO = (AssignDiscountToBrandDTO) o;
    return Objects.equals(this.discountId, assignDiscountToBrandDTO.discountId) &&
        Objects.equals(this.brandId, assignDiscountToBrandDTO.brandId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountId, brandId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignDiscountToBrandDTO {\n");
    
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
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

