package com.example.psp.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;

/**
 * ProductDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class ProductDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("unit")
  private JsonNullable<String> unit = JsonNullable.undefined();

  @JsonProperty("price")
  private Integer price;

  @JsonProperty("brand_id")
  private Integer brandId;

  @JsonProperty("tax_rate_id")
  private Integer taxRateId;

  @JsonProperty("materials")
  @Valid
  private JsonNullable<List<ProductMaterial>> materials = JsonNullable.undefined();

  @JsonProperty("categories")
  @Valid
  private JsonNullable<List<ProductCategory>> categories = JsonNullable.undefined();

  public ProductDTO id(Integer id) {
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

  public ProductDTO name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public ProductDTO unit(String unit) {
    this.unit = JsonNullable.of(unit);
    return this;
  }

  /**
   * Get unit
   * @return unit
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getUnit() {
    return unit;
  }

  public void setUnit(JsonNullable<String> unit) {
    this.unit = unit;
  }

  public ProductDTO price(Integer price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  */
  @ApiModelProperty(value = "")


  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public ProductDTO brandId(Integer brandId) {
    this.brandId = brandId;
    return this;
  }

  /**
   * Get brandId
   * @return brandId
  */
  @ApiModelProperty(value = "")


  public Integer getBrandId() {
    return brandId;
  }

  public void setBrandId(Integer brandId) {
    this.brandId = brandId;
  }

  public ProductDTO taxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
    return this;
  }

  /**
   * Get taxRateId
   * @return taxRateId
  */
  @ApiModelProperty(value = "")


  public Integer getTaxRateId() {
    return taxRateId;
  }

  public void setTaxRateId(Integer taxRateId) {
    this.taxRateId = taxRateId;
  }

  public ProductDTO materials(List<ProductMaterial> materials) {
    this.materials = JsonNullable.of(materials);
    return this;
  }

  public ProductDTO addMaterialsItem(ProductMaterial materialsItem) {
    if (this.materials == null || !this.materials.isPresent()) {
      this.materials = JsonNullable.of(new ArrayList<>());
    }
    this.materials.get().add(materialsItem);
    return this;
  }

  /**
   * Get materials
   * @return materials
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ProductMaterial>> getMaterials() {
    return materials;
  }

  public void setMaterials(JsonNullable<List<ProductMaterial>> materials) {
    this.materials = materials;
  }

  public ProductDTO categories(List<ProductCategory> categories) {
    this.categories = JsonNullable.of(categories);
    return this;
  }

  public ProductDTO addCategoriesItem(ProductCategory categoriesItem) {
    if (this.categories == null || !this.categories.isPresent()) {
      this.categories = JsonNullable.of(new ArrayList<>());
    }
    this.categories.get().add(categoriesItem);
    return this;
  }

  /**
   * Get categories
   * @return categories
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<ProductCategory>> getCategories() {
    return categories;
  }

  public void setCategories(JsonNullable<List<ProductCategory>> categories) {
    this.categories = categories;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductDTO productDTO = (ProductDTO) o;
    return Objects.equals(this.id, productDTO.id) &&
        Objects.equals(this.name, productDTO.name) &&
        Objects.equals(this.unit, productDTO.unit) &&
        Objects.equals(this.price, productDTO.price) &&
        Objects.equals(this.brandId, productDTO.brandId) &&
        Objects.equals(this.taxRateId, productDTO.taxRateId) &&
        Objects.equals(this.materials, productDTO.materials) &&
        Objects.equals(this.categories, productDTO.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, unit, price, brandId, taxRateId, materials, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    brandId: ").append(toIndentedString(brandId)).append("\n");
    sb.append("    taxRateId: ").append(toIndentedString(taxRateId)).append("\n");
    sb.append("    materials: ").append(toIndentedString(materials)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

