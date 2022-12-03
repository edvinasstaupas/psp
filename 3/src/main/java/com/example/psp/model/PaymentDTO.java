package com.example.psp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;

/**
 * PaymentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class PaymentDTO   {
  @JsonProperty("orderId")
  private Integer orderId;

  @JsonProperty("paymentType")
  private PaymentType paymentType;

  @JsonProperty("ammount")
  private Double ammount;

  @JsonProperty("change")
  private JsonNullable<Double> change = JsonNullable.undefined();

  public PaymentDTO orderId(Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Order id
   * @return orderId
  */
  @ApiModelProperty(value = "Order id")


  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public PaymentDTO paymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
    return this;
  }

  /**
   * Get paymentType
   * @return paymentType
  */
  @ApiModelProperty(value = "")

  @Valid

  public PaymentType getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(PaymentType paymentType) {
    this.paymentType = paymentType;
  }

  public PaymentDTO ammount(Double ammount) {
    this.ammount = ammount;
    return this;
  }

  /**
   * Ammount paid
   * @return ammount
  */
  @ApiModelProperty(value = "Ammount paid")


  public Double getAmmount() {
    return ammount;
  }

  public void setAmmount(Double ammount) {
    this.ammount = ammount;
  }

  public PaymentDTO change(Double change) {
    this.change = JsonNullable.of(change);
    return this;
  }

  /**
   * If paid by cash, ammount of change given
   * @return change
  */
  @ApiModelProperty(value = "If paid by cash, ammount of change given")


  public JsonNullable<Double> getChange() {
    return change;
  }

  public void setChange(JsonNullable<Double> change) {
    this.change = change;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentDTO paymentDTO = (PaymentDTO) o;
    return Objects.equals(this.orderId, paymentDTO.orderId) &&
        Objects.equals(this.paymentType, paymentDTO.paymentType) &&
        Objects.equals(this.ammount, paymentDTO.ammount) &&
        Objects.equals(this.change, paymentDTO.change);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, paymentType, ammount, change);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentDTO {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
    sb.append("    ammount: ").append(toIndentedString(ammount)).append("\n");
    sb.append("    change: ").append(toIndentedString(change)).append("\n");
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

