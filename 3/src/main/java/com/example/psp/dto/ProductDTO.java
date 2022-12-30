package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProductDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ProductDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private JsonNullable<String> name = JsonNullable.undefined();

    @JsonProperty("unit")
    private JsonNullable<String> unit = JsonNullable.undefined();

    @JsonProperty("price")
    private Integer price;

    @JsonProperty("brandId")
    private Integer brandId;

    @JsonProperty("taxRateId")
    private Integer taxRateId;

    @JsonProperty("materials")
    @Valid
    private JsonNullable<List<ProductMaterialDTO>> materials = JsonNullable.undefined();

    @JsonProperty("categories")
    @Valid
    private JsonNullable<List<ProductCategoryDTO>> categories = JsonNullable.undefined();

    public ProductDTO id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
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
     *
     * @return name
     */
    @ApiModelProperty(value = "")


    public String getName() {
        return name.orElse(null);
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
     *
     * @return unit
     */
    @ApiModelProperty(value = "")


    public String getUnit() {
        return unit.orElse(null);
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
     *
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
     *
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
     *
     * @return taxRateId
     */
    @ApiModelProperty(value = "")


    public Integer getTaxRateId() {
        return taxRateId;
    }

    public void setTaxRateId(Integer taxRateId) {
        this.taxRateId = taxRateId;
    }

    public ProductDTO materials(List<ProductMaterialDTO> materials) {
        this.materials = JsonNullable.of(materials);
        return this;
    }

    public ProductDTO addMaterialsItem(ProductMaterialDTO materialsItem) {
        if (this.materials == null || !this.materials.isPresent()) {
            this.materials = JsonNullable.of(new ArrayList<>());
        }
        this.materials.get().add(materialsItem);
        return this;
    }

    /**
     * Get materials
     *
     * @return materials
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductMaterialDTO> getMaterials() {
        return materials.orElse(null);
    }

    public void setMaterials(JsonNullable<List<ProductMaterialDTO>> materials) {
        this.materials = materials;
    }

    public ProductDTO categories(List<ProductCategoryDTO> categories) {
        this.categories = JsonNullable.of(categories);
        return this;
    }

    public ProductDTO addCategoriesItem(ProductCategoryDTO categoriesItem) {
        if (this.categories == null || !this.categories.isPresent()) {
            this.categories = JsonNullable.of(new ArrayList<>());
        }
        this.categories.get().add(categoriesItem);
        return this;
    }

    /**
     * Get categories
     *
     * @return categories
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductCategoryDTO> getCategories() {
        return categories.orElse(null);
    }

    public void setCategories(JsonNullable<List<ProductCategoryDTO>> categories) {
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

