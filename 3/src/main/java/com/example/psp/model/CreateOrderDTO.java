package com.example.psp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;

/**
 * CreateOrderDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class CreateOrderDTO   {
  @JsonProperty("customerId")
  private JsonNullable<Integer> customerId = JsonNullable.undefined();

  @JsonProperty("employeeId")
  private JsonNullable<Integer> employeeId = JsonNullable.undefined();

  @JsonProperty("tipsAmmount")
  private Double tipsAmmount;

  @JsonProperty("items")
  @Valid
  private JsonNullable<List<CreateOrderItemDTO>> items = JsonNullable.undefined();

  public CreateOrderDTO customerId(Integer customerId) {
    this.customerId = JsonNullable.of(customerId);
    return this;
  }

  /**
   * Id of the customer
   * @return customerId
  */
  @ApiModelProperty(value = "Id of the customer")


  public JsonNullable<Integer> getCustomerId() {
    return customerId;
  }

  public void setCustomerId(JsonNullable<Integer> customerId) {
    this.customerId = customerId;
  }

  public CreateOrderDTO employeeId(Integer employeeId) {
    this.employeeId = JsonNullable.of(employeeId);
    return this;
  }

  /**
   * Id of the employee who completed the order in store.
   * @return employeeId
  */
  @ApiModelProperty(value = "Id of the employee who completed the order in store.")


  public JsonNullable<Integer> getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(JsonNullable<Integer> employeeId) {
    this.employeeId = employeeId;
  }

  public CreateOrderDTO tipsAmmount(Double tipsAmmount) {
    this.tipsAmmount = tipsAmmount;
    return this;
  }

  /**
   * Tips
   * @return tipsAmmount
  */
  @ApiModelProperty(value = "Tips")


  public Double getTipsAmmount() {
    return tipsAmmount;
  }

  public void setTipsAmmount(Double tipsAmmount) {
    this.tipsAmmount = tipsAmmount;
  }

  public CreateOrderDTO items(List<CreateOrderItemDTO> items) {
    this.items = JsonNullable.of(items);
    return this;
  }

  public CreateOrderDTO addItemsItem(CreateOrderItemDTO itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.of(new ArrayList<>());
    }
    this.items.get().add(itemsItem);
    return this;
  }

  /**
   * Order items
   * @return items
  */
  @ApiModelProperty(value = "Order items")

  @Valid

  public JsonNullable<List<CreateOrderItemDTO>> getItems() {
    return items;
  }

  public void setItems(JsonNullable<List<CreateOrderItemDTO>> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderDTO createOrderDTO = (CreateOrderDTO) o;
    return Objects.equals(this.customerId, createOrderDTO.customerId) &&
        Objects.equals(this.employeeId, createOrderDTO.employeeId) &&
        Objects.equals(this.tipsAmmount, createOrderDTO.tipsAmmount) &&
        Objects.equals(this.items, createOrderDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, employeeId, tipsAmmount, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderDTO {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    tipsAmmount: ").append(toIndentedString(tipsAmmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

