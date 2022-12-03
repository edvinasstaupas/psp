package com.example.psp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;

/**
 * CartDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class CartDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("customerId")
  private JsonNullable<Integer> customerId = JsonNullable.undefined();

  @JsonProperty("dateCreated")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateCreated;

  @JsonProperty("lastAccessed")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastAccessed;

  @JsonProperty("items")
  @Valid
  private JsonNullable<List<CartItemDTO>> items = JsonNullable.undefined();

  public CartDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CartDTO customerId(Integer customerId) {
    this.customerId = JsonNullable.of(customerId);
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Integer> getCustomerId() {
    return customerId;
  }

  public void setCustomerId(JsonNullable<Integer> customerId) {
    this.customerId = customerId;
  }

  public CartDTO dateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }

  /**
   * Get dateCreated
   * @return dateCreated
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }

  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }

  public CartDTO lastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
    return this;
  }

  /**
   * Get lastAccessed
   * @return lastAccessed
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getLastAccessed() {
    return lastAccessed;
  }

  public void setLastAccessed(OffsetDateTime lastAccessed) {
    this.lastAccessed = lastAccessed;
  }

  public CartDTO items(List<CartItemDTO> items) {
    this.items = JsonNullable.of(items);
    return this;
  }

  public CartDTO addItemsItem(CartItemDTO itemsItem) {
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

  public JsonNullable<List<CartItemDTO>> getItems() {
    return items;
  }

  public void setItems(JsonNullable<List<CartItemDTO>> items) {
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
    CartDTO cartDTO = (CartDTO) o;
    return Objects.equals(this.id, cartDTO.id) &&
        Objects.equals(this.customerId, cartDTO.customerId) &&
        Objects.equals(this.dateCreated, cartDTO.dateCreated) &&
        Objects.equals(this.lastAccessed, cartDTO.lastAccessed) &&
        Objects.equals(this.items, cartDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, dateCreated, lastAccessed, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
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

