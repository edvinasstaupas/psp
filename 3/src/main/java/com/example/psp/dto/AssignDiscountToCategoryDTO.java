package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * AssignDiscountToCategoryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class AssignDiscountToCategoryDTO {
    @JsonProperty("discountId")
    private Integer discountId;

    @JsonProperty("categoryId")
    private Integer categoryId;

    public AssignDiscountToCategoryDTO discountId(Integer discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * Get discountId
     *
     * @return discountId
     */
    @ApiModelProperty(value = "")


    public Integer getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Integer discountId) {
        this.discountId = discountId;
    }

    public AssignDiscountToCategoryDTO categoryId(Integer brandId) {
        this.categoryId = brandId;
        return this;
    }

    /**
     * Get brandId
     *
     * @return brandId
     */
    @ApiModelProperty(value = "")


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignDiscountToCategoryDTO assignDiscountToCategoryDTO = (AssignDiscountToCategoryDTO) o;
        return Objects.equals(this.discountId, assignDiscountToCategoryDTO.discountId) &&
                Objects.equals(this.categoryId, assignDiscountToCategoryDTO.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, categoryId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignDiscountToCategoryDTO {\n");

        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

