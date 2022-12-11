package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ProductStatusDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ProductStatusDTO {
    @JsonProperty("productId")
    private Integer productId;

    @JsonProperty("availableQuantity")
    private Integer availableQuantity;

    @JsonProperty("isDisabled")
    private Boolean isDisabled;

    public ProductStatusDTO productId(Integer productId) {
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

    public ProductStatusDTO availableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
        return this;
    }

    /**
     * Get availableQuantity
     *
     * @return availableQuantity
     */
    @ApiModelProperty(value = "")


    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public ProductStatusDTO isDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
        return this;
    }

    /**
     * Get isDisabled
     *
     * @return isDisabled
     */
    @ApiModelProperty(value = "")


    public Boolean getIsDisabled() {
        return isDisabled;
    }

    public void setIsDisabled(Boolean isDisabled) {
        this.isDisabled = isDisabled;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductStatusDTO productStatusDTO = (ProductStatusDTO) o;
        return Objects.equals(this.productId, productStatusDTO.productId) &&
                Objects.equals(this.availableQuantity, productStatusDTO.availableQuantity) &&
                Objects.equals(this.isDisabled, productStatusDTO.isDisabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, availableQuantity, isDisabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductStatusDTO {\n");

        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
        sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
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

