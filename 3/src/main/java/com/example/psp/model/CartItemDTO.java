package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CartItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class CartItemDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("cartId")
  private Integer cartId;

  @JsonProperty("productId")
  private JsonNullable<Integer> productId = JsonNullable.undefined();

  @JsonProperty("bundleId")
  private JsonNullable<Integer> bundleId = JsonNullable.undefined();

  @JsonProperty("itemName")
  private JsonNullable<String> itemName = JsonNullable.undefined();

  @JsonProperty("itemPrice")
  private Double itemPrice;

  @JsonProperty("quantity")
  private Integer quantity;

  public CartItemDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Cart item id
   * @return id
  */
  @ApiModelProperty(value = "Cart item id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CartItemDTO cartId(Integer cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Cart id
   * @return cartId
  */
  @ApiModelProperty(value = "Cart id")


  public Integer getCartId() {
    return cartId;
  }

  public void setCartId(Integer cartId) {
    this.cartId = cartId;
  }

  public CartItemDTO productId(Integer productId) {
    this.productId = JsonNullable.of(productId);
    return this;
  }

  /**
   * If item is product, id of that produuct.
   * @return productId
  */
  @ApiModelProperty(value = "If item is product, id of that produuct.")


  public JsonNullable<Integer> getProductId() {
    return productId;
  }

  public void setProductId(JsonNullable<Integer> productId) {
    this.productId = productId;
  }

  public CartItemDTO bundleId(Integer bundleId) {
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

  public CartItemDTO itemName(String itemName) {
    this.itemName = JsonNullable.of(itemName);
    return this;
  }

  /**
   * Name of the cart item.
   * @return itemName
  */
  @ApiModelProperty(value = "Name of the cart item.")


  public JsonNullable<String> getItemName() {
    return itemName;
  }

  public void setItemName(JsonNullable<String> itemName) {
    this.itemName = itemName;
  }

  public CartItemDTO itemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  /**
   * Price of the cart item.
   * @return itemPrice
  */
  @ApiModelProperty(value = "Price of the cart item.")


  public Double getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(Double itemPrice) {
    this.itemPrice = itemPrice;
  }

  public CartItemDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the item in the cart.
   * @return quantity
  */
  @ApiModelProperty(value = "Quantity of the item in the cart.")


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
    CartItemDTO cartItemDTO = (CartItemDTO) o;
    return Objects.equals(this.id, cartItemDTO.id) &&
        Objects.equals(this.cartId, cartItemDTO.cartId) &&
        Objects.equals(this.productId, cartItemDTO.productId) &&
        Objects.equals(this.bundleId, cartItemDTO.bundleId) &&
        Objects.equals(this.itemName, cartItemDTO.itemName) &&
        Objects.equals(this.itemPrice, cartItemDTO.itemPrice) &&
        Objects.equals(this.quantity, cartItemDTO.quantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cartId, productId, bundleId, itemName, itemPrice, quantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartItemDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
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

