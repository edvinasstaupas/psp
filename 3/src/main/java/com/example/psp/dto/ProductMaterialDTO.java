package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ProductMaterial
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ProductMaterialDTO {
    @JsonProperty("productId")
    private Integer productId;

    @JsonProperty("materialId")
    private Integer materialId;

    @JsonProperty("quantity")
    private Integer quantity;

    public ProductMaterialDTO productId(Integer productId) {
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

    public ProductMaterialDTO materialId(Integer materialId) {
        this.materialId = materialId;
        return this;
    }

    /**
     * Get materialId
     *
     * @return materialId
     */
    @ApiModelProperty(value = "")


    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public ProductMaterialDTO quantity(Integer quantity) {
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
        ProductMaterialDTO productMaterialDTO = (ProductMaterialDTO) o;
        return Objects.equals(this.productId, productMaterialDTO.productId) &&
                Objects.equals(this.materialId, productMaterialDTO.materialId) &&
                Objects.equals(this.quantity, productMaterialDTO.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, materialId, quantity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductMaterial {\n");

        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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

