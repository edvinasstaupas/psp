package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * BundleProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class BundleProductDTO {
    @JsonProperty("bundleId")
    private Integer bundleId;

    @JsonProperty("productId")
    private Integer productId;

    @JsonProperty("quantity")
    private Integer quantity;

    public BundleProductDTO bundleId(Integer bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * Get bundleId
     *
     * @return bundleId
     */
    @ApiModelProperty(value = "")


    public Integer getBundleId() {
        return bundleId;
    }

    public void setBundleId(Integer bundleId) {
        this.bundleId = bundleId;
    }

    public BundleProductDTO productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     */
    @ApiModelProperty(value = "")


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public BundleProductDTO quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     */
    @ApiModelProperty(value = "")


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
        BundleProductDTO bundleProductDTO = (BundleProductDTO) o;
        return Objects.equals(this.bundleId, bundleProductDTO.bundleId) &&
                Objects.equals(this.productId, bundleProductDTO.productId) &&
                Objects.equals(this.quantity, bundleProductDTO.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bundleId, productId, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundleProduct {\n");

        sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

