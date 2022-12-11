package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrderDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class OrderDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("customerId")
    private JsonNullable<Integer> customerId = JsonNullable.undefined();

    @JsonProperty("employeeId")
    private JsonNullable<Integer> employeeId = JsonNullable.undefined();

    @JsonProperty("tipsAmmount")
    private Double tipsAmmount;

    @JsonProperty("items")
    @Valid
    private JsonNullable<List<OrderItemDTO>> items = JsonNullable.undefined();

    @JsonProperty("total")
    private Double total;

    @JsonProperty("status")
    private OrderStatus status;

    @JsonProperty("payment")
    private PaymentDTO payment;

    public OrderDTO id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Order id.
     *
     * @return id
     */
    @ApiModelProperty(value = "Order id.")


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OrderDTO customerId(Integer customerId) {
        this.customerId = JsonNullable.of(customerId);
        return this;
    }

    /**
     * Id of the customer.
     *
     * @return customerId
     */
    @ApiModelProperty(value = "Id of the customer.")


    public JsonNullable<Integer> getCustomerId() {
        return customerId;
    }

    public void setCustomerId(JsonNullable<Integer> customerId) {
        this.customerId = customerId;
    }

    public OrderDTO employeeId(Integer employeeId) {
        this.employeeId = JsonNullable.of(employeeId);
        return this;
    }

    /**
     * Id of the employee who completed the order.
     *
     * @return employeeId
     */
    @ApiModelProperty(value = "Id of the employee who completed the order.")


    public JsonNullable<Integer> getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(JsonNullable<Integer> employeeId) {
        this.employeeId = employeeId;
    }

    public OrderDTO tipsAmmount(Double tipsAmmount) {
        this.tipsAmmount = tipsAmmount;
        return this;
    }

    /**
     * Tips
     *
     * @return tipsAmmount
     */
    @ApiModelProperty(value = "Tips")


    public Double getTipsAmmount() {
        return tipsAmmount;
    }

    public void setTipsAmmount(Double tipsAmmount) {
        this.tipsAmmount = tipsAmmount;
    }

    public OrderDTO items(List<OrderItemDTO> items) {
        this.items = JsonNullable.of(items);
        return this;
    }

    public OrderDTO addItemsItem(OrderItemDTO itemsItem) {
        if (this.items == null || !this.items.isPresent()) {
            this.items = JsonNullable.of(new ArrayList<>());
        }
        this.items.get().add(itemsItem);
        return this;
    }

    /**
     * Ordered items.
     *
     * @return items
     */
    @ApiModelProperty(value = "Ordered items.")

    @Valid

    public JsonNullable<List<OrderItemDTO>> getItems() {
        return items;
    }

    public void setItems(JsonNullable<List<OrderItemDTO>> items) {
        this.items = items;
    }

    public OrderDTO total(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Amount to be paid for the order.
     *
     * @return total
     */
    @ApiModelProperty(value = "Amount to be paid for the order.")


    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public OrderDTO status(OrderStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @ApiModelProperty(value = "")

    @Valid

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderDTO payment(PaymentDTO payment) {
        this.payment = payment;
        return this;
    }

    /**
     * Get payment
     *
     * @return payment
     */
    @ApiModelProperty(value = "")

    @Valid

    public PaymentDTO getPayment() {
        return payment;
    }

    public void setPayment(PaymentDTO payment) {
        this.payment = payment;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderDTO orderDTO = (OrderDTO) o;
        return Objects.equals(this.id, orderDTO.id) &&
                Objects.equals(this.customerId, orderDTO.customerId) &&
                Objects.equals(this.employeeId, orderDTO.employeeId) &&
                Objects.equals(this.tipsAmmount, orderDTO.tipsAmmount) &&
                Objects.equals(this.items, orderDTO.items) &&
                Objects.equals(this.total, orderDTO.total) &&
                Objects.equals(this.status, orderDTO.status) &&
                Objects.equals(this.payment, orderDTO.payment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, employeeId, tipsAmmount, items, total, status, payment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
        sb.append("    tipsAmmount: ").append(toIndentedString(tipsAmmount)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

