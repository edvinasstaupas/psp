package com.example.psp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;

/**
 * DetailedSalesReportDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
public class DetailedSalesReportDTO   {
  @JsonProperty("items")
  @Valid
  private JsonNullable<List<OrderItemDTO>> items = JsonNullable.undefined();

  @JsonProperty("total")
  private Double total;

  public DetailedSalesReportDTO items(List<OrderItemDTO> items) {
    this.items = JsonNullable.of(items);
    return this;
  }

  public DetailedSalesReportDTO addItemsItem(OrderItemDTO itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.of(new ArrayList<>());
    }
    this.items.get().add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<OrderItemDTO>> getItems() {
    return items;
  }

  public void setItems(JsonNullable<List<OrderItemDTO>> items) {
    this.items = items;
  }

  public DetailedSalesReportDTO total(Double total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @ApiModelProperty(value = "")


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
    DetailedSalesReportDTO detailedSalesReportDTO = (DetailedSalesReportDTO) o;
    return Objects.equals(this.items, detailedSalesReportDTO.items) &&
        Objects.equals(this.total, detailedSalesReportDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSalesReportDTO {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

