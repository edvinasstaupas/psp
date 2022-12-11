package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Objects;

/**
 * CartItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class CartItem {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("cartId")
    private Integer cartId;

    @JsonProperty("productId")
    private JsonNullable<Integer> productId = JsonNullable.undefined();

    @JsonProperty("bundleId")
    private JsonNullable<Integer> bundleId = JsonNullable.undefined();

    @JsonProperty("quantity")
    private Integer quantity;

    public CartItem id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Id of the cart item
     *
     * @return id
     */
    @ApiModelProperty(value = "Id of the cart item")


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CartItem cartId(Integer cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     * Id of the cart
     *
     * @return cartId
     */
    @ApiModelProperty(value = "Id of the cart")


    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public CartItem productId(Integer productId) {
        this.productId = JsonNullable.of(productId);
        return this;
    }

    /**
     * If item is product, id of that produuct.
     *
     * @return productId
     */
    @ApiModelProperty(value = "If item is product, id of that produuct.")


    public JsonNullable<Integer> getProductId() {
        return productId;
    }

    public void setProductId(JsonNullable<Integer> productId) {
        this.productId = productId;
    }

    public CartItem bundleId(Integer bundleId) {
        this.bundleId = JsonNullable.of(bundleId);
        return this;
    }

    /**
     * If item is a bundle, id of that bundle.
     *
     * @return bundleId
     */
    @ApiModelProperty(value = "If item is a bundle, id of that bundle.")


    public JsonNullable<Integer> getBundleId() {
        return bundleId;
    }

    public void setBundleId(JsonNullable<Integer> bundleId) {
        this.bundleId = bundleId;
    }

    public CartItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Quantity of the item.
     *
     * @return quantity
     */
    @ApiModelProperty(value = "Quantity of the item.")


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
        CartItem cartItem = (CartItem) o;
        return Objects.equals(this.id, cartItem.id) &&
                Objects.equals(this.cartId, cartItem.cartId) &&
                Objects.equals(this.productId, cartItem.productId) &&
                Objects.equals(this.bundleId, cartItem.bundleId) &&
                Objects.equals(this.quantity, cartItem.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cartId, productId, bundleId, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CartItem {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
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

