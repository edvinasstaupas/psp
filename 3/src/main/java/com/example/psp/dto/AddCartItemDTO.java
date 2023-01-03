package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Objects;

/**
 * AddCartItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class AddCartItemDTO {
    @JsonProperty("productId")
    private JsonNullable<Integer> productId = JsonNullable.undefined();


    @JsonProperty("bundleId")
    private JsonNullable<Integer> bundleId = JsonNullable.undefined();

    @JsonProperty("quantity")
    private Integer quantity;

    @JsonProperty("comments")
    private JsonNullable<String> comments = JsonNullable.undefined();

    public AddCartItemDTO productId(Integer productId) {
        this.productId = JsonNullable.of(productId);
        return this;
    }

    /**
     * If item is a product, id of that product
     *
     * @return productId
     */
    @ApiModelProperty(value = "If item is a product, id of that product")


    public JsonNullable<Integer> getProductId() {
        return productId;
    }

    public void setProductId(JsonNullable<Integer> productId) {
        this.productId = productId;
    }

    public AddCartItemDTO bundleId(Integer bundleId) {
        this.bundleId = JsonNullable.of(bundleId);
        return this;
    }

    /**
     * If item is a bundle, id of that bundle
     *
     * @return bundleId
     */
    @ApiModelProperty(value = "If item is a bundle, id of that bundle")


    public JsonNullable<Integer> getBundleId() {
        return bundleId;
    }

    public void setBundleId(JsonNullable<Integer> bundleId) {
        this.bundleId = bundleId;
    }

    public AddCartItemDTO quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Quantity of the item
     *
     * @return quantity
     */
    @ApiModelProperty(value = "Quantity of the item")


    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public AddCartItemDTO comments(String comments) {
        this.comments = JsonNullable.of(comments);
        return this;
    }

    /**
     * Additional comments for te item.
     *
     * @return comments
     */
    @ApiModelProperty(value = "Additional comments for te item.")


    public JsonNullable<String> getComments() {
        return comments;
    }

    public void setComments(JsonNullable<String> comments) {
        this.comments = comments;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddCartItemDTO addCartItemDTO = (AddCartItemDTO) o;
        return Objects.equals(this.productId, addCartItemDTO.productId) &&
                Objects.equals(this.bundleId, addCartItemDTO.bundleId) &&
                Objects.equals(this.quantity, addCartItemDTO.quantity) &&
                Objects.equals(this.comments, addCartItemDTO.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, bundleId, quantity, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddCartItemDTO {\n");

        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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

