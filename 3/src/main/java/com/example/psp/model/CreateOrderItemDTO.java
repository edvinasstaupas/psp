package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateOrderItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class CreateOrderItemDTO   {
  @JsonProperty("productId")
  private JsonNullable<Integer> productId = JsonNullable.undefined();

  @JsonProperty("serviceId")
  private JsonNullable<Integer> serviceId = JsonNullable.undefined();

  @JsonProperty("bundleId")
  private JsonNullable<Integer> bundleId = JsonNullable.undefined();

  @JsonProperty("notes")
  private JsonNullable<String> notes = JsonNullable.undefined();

  @JsonProperty("quantity")
  private Integer quantity;

  public CreateOrderItemDTO productId(Integer productId) {
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

  public CreateOrderItemDTO serviceId(Integer serviceId) {
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

  public CreateOrderItemDTO bundleId(Integer bundleId) {
    this.bundleId = JsonNullable.of(bundleId);
    return this;
  }

  /**
   * Get bundleId
   * @return bundleId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Integer> getBundleId() {
    return bundleId;
  }

  public void setBundleId(JsonNullable<Integer> bundleId) {
    this.bundleId = bundleId;
  }

  public CreateOrderItemDTO notes(String notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public CreateOrderItemDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderItemDTO createOrderItemDTO = (CreateOrderItemDTO) o;
    return Objects.equals(this.productId, createOrderItemDTO.productId) &&
        Objects.equals(this.serviceId, createOrderItemDTO.serviceId) &&
        Objects.equals(this.bundleId, createOrderItemDTO.bundleId) &&
        Objects.equals(this.notes, createOrderItemDTO.notes) &&
        Objects.equals(this.quantity, createOrderItemDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, serviceId, bundleId, notes, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderItemDTO {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

