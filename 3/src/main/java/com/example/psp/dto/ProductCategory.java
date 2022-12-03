package com.example.psp.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ProductCategory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ProductCategory   {
  @JsonProperty("productId")
  private Integer productId;

  @JsonProperty("categoryId")
  private JsonNullable<String> categoryId = JsonNullable.undefined();

  public ProductCategory productId(Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  @ApiModelProperty(value = "")


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public ProductCategory categoryId(String categoryId) {
    this.categoryId = JsonNullable.of(categoryId);
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(JsonNullable<String> categoryId) {
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
    ProductCategory productCategory = (ProductCategory) o;
    return Objects.equals(this.productId, productCategory.productId) &&
        Objects.equals(this.categoryId, productCategory.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCategory {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

