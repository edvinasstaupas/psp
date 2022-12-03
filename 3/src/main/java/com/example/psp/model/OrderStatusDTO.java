package com.example.psp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * OrderStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class OrderStatusDTO   {
  @JsonProperty("orderId")
  private Integer orderId;

  @JsonProperty("status")
  private OrderStatusTypes status;

  public OrderStatusDTO orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order ID
   * @return orderId
  */
  @ApiModelProperty(value = "Order ID")


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public OrderStatusDTO status(OrderStatusTypes status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderStatusTypes getStatus() {
    return status;
  }

  public void setStatus(OrderStatusTypes status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusDTO orderStatusDTO = (OrderStatusDTO) o;
    return Objects.equals(this.orderId, orderStatusDTO.orderId) &&
        Objects.equals(this.status, orderStatusDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusDTO {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

