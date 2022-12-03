package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * OrderItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class OrderItemDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("productId")
  private JsonNullable<Integer> productId = JsonNullable.undefined();

  @JsonProperty("serviceId")
  private JsonNullable<Integer> serviceId = JsonNullable.undefined();

  @JsonProperty("bundleId")
  private JsonNullable<Integer> bundleId = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("notes")
  private JsonNullable<String> notes = JsonNullable.undefined();

  @JsonProperty("quantity")
  private Integer quantity;

  @JsonProperty("unitPrice")
  private Double unitPrice;

  @JsonProperty("discountRate")
  private Double discountRate;

  @JsonProperty("taxRate")
  private Double taxRate;

  @JsonProperty("total")
  private Double total;

  public OrderItemDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Order item id.
   * @return id
  */
  @ApiModelProperty(value = "Order item id.")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public OrderItemDTO productId(Integer productId) {
    this.productId = JsonNullable.of(productId);
    return this;
  }

  /**
   * If item is a product, id of that product.
   * @return productId
  */
  @ApiModelProperty(value = "If item is a product, id of that product.")


  public JsonNullable<Integer> getProductId() {
    return productId;
  }

  public void setProductId(JsonNullable<Integer> productId) {
    this.productId = productId;
  }

  public OrderItemDTO serviceId(Integer serviceId) {
    this.serviceId = JsonNullable.of(serviceId);
    return this;
  }

  /**
   * If item is a service, id of that service.
   * @return serviceId
  */
  @ApiModelProperty(value = "If item is a service, id of that service.")


  public JsonNullable<Integer> getServiceId() {
    return serviceId;
  }

  public void setServiceId(JsonNullable<Integer> serviceId) {
    this.serviceId = serviceId;
  }

  public OrderItemDTO bundleId(Integer bundleId) {
    this.bundleId = JsonNullable.of(bundleId);
    return this;
  }

  /**
   * If item is a bundle, id of that bundle.
   * @return bundleId
  */
  @ApiModelProperty(value = "If item is a bundle, id of that bundle.")


  public JsonNullable<Integer> getBundleId() {
    return bundleId;
  }

  public void setBundleId(JsonNullable<Integer> bundleId) {
    this.bundleId = bundleId;
  }

  public OrderItemDTO name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Name of the item.
   * @return name
  */
  @ApiModelProperty(value = "Name of the item.")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public OrderItemDTO notes(String notes) {
    this.notes = JsonNullable.of(notes);
    return this;
  }

  /**
   * Additional notes added to the item.
   * @return notes
  */
  @ApiModelProperty(value = "Additional notes added to the item.")


  public JsonNullable<String> getNotes() {
    return notes;
  }

  public void setNotes(JsonNullable<String> notes) {
    this.notes = notes;
  }

  public OrderItemDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the item.
   * @return quantity
  */
  @ApiModelProperty(value = "Quantity of the item.")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderItemDTO unitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
    return this;
  }

  /**
   * Unit price of the item.
   * @return unitPrice
  */
  @ApiModelProperty(value = "Unit price of the item.")


  public Double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public OrderItemDTO discountRate(Double discountRate) {
    this.discountRate = discountRate;
    return this;
  }

  /**
   * Discount applied to the item.
   * @return discountRate
  */
  @ApiModelProperty(value = "Discount applied to the item.")


  public Double getDiscountRate() {
    return discountRate;
  }

  public void setDiscountRate(Double discountRate) {
    this.discountRate = discountRate;
  }

  public OrderItemDTO taxRate(Double taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Tax rate applied to the item.
   * @return taxRate
  */
  @ApiModelProperty(value = "Tax rate applied to the item.")


  public Double getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Double taxRate) {
    this.taxRate = taxRate;
  }

  public OrderItemDTO total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Total amount that should be paid for the item.
   * @return total
  */
  @ApiModelProperty(value = "Total amount that should be paid for the item.")


  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItemDTO orderItemDTO = (OrderItemDTO) o;
    return Objects.equals(this.id, orderItemDTO.id) &&
        Objects.equals(this.productId, orderItemDTO.productId) &&
        Objects.equals(this.serviceId, orderItemDTO.serviceId) &&
        Objects.equals(this.bundleId, orderItemDTO.bundleId) &&
        Objects.equals(this.name, orderItemDTO.name) &&
        Objects.equals(this.notes, orderItemDTO.notes) &&
        Objects.equals(this.quantity, orderItemDTO.quantity) &&
        Objects.equals(this.unitPrice, orderItemDTO.unitPrice) &&
        Objects.equals(this.discountRate, orderItemDTO.discountRate) &&
        Objects.equals(this.taxRate, orderItemDTO.taxRate) &&
        Objects.equals(this.total, orderItemDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, productId, serviceId, bundleId, name, notes, quantity, unitPrice, discountRate, taxRate, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

