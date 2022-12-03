package com.example.psp.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;

/**
 * OrderStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class OrderStatus   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("orderId")
  private Integer orderId;

  @JsonProperty("status")
  private OrderStatusEnum status;

  public OrderStatus id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Order status ID
   * @return id
  */
  @ApiModelProperty(value = "Order status ID")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderStatus orderId(Integer orderId) {
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

  public OrderStatus status(OrderStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public OrderStatusEnum getStatus() {
    return status;
  }

  public void setStatus(OrderStatusEnum status) {
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
    OrderStatus orderStatus = (OrderStatus) o;
    return Objects.equals(this.id, orderStatus.id) &&
        Objects.equals(this.orderId, orderStatus.orderId) &&
        Objects.equals(this.status, orderStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

