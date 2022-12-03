package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * AssignDiscountToItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
public class AssignDiscountToItemDTO   {
  @JsonProperty("discountId")
  private Integer discountId;

  @JsonProperty("productId")
  private JsonNullable<Integer> productId = JsonNullable.undefined();

  @JsonProperty("serviceId")
  private JsonNullable<Integer> serviceId = JsonNullable.undefined();

  public AssignDiscountToItemDTO discountId(Integer discountId) {
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

  public AssignDiscountToItemDTO productId(Integer productId) {
    this.productId = JsonNullable.of(productId);
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Integer> getProductId() {
    return productId;
  }

  public void setProductId(JsonNullable<Integer> productId) {
    this.productId = productId;
  }

  public AssignDiscountToItemDTO serviceId(Integer serviceId) {
    this.serviceId = JsonNullable.of(serviceId);
    return this;
  }

  /**
   * Get serviceId
   * @return serviceId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Integer> getServiceId() {
    return serviceId;
  }

  public void setServiceId(JsonNullable<Integer> serviceId) {
    this.serviceId = serviceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignDiscountToItemDTO assignDiscountToItemDTO = (AssignDiscountToItemDTO) o;
    return Objects.equals(this.discountId, assignDiscountToItemDTO.discountId) &&
        Objects.equals(this.productId, assignDiscountToItemDTO.productId) &&
        Objects.equals(this.serviceId, assignDiscountToItemDTO.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountId, productId, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignDiscountToItemDTO {\n");
    
    sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

