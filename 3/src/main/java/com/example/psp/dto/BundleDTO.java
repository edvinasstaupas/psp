package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BundleDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class BundleDTO {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private JsonNullable<String> name = JsonNullable.undefined();

    @JsonProperty("price")
    private Integer price;

    @JsonProperty("products")
    @Valid
    private JsonNullable<List<BundleProductDTO>> products = JsonNullable.undefined();

    public BundleDTO id(Integer id) {
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

    public BundleDTO name(String name) {
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

    public void setName(String name) {
        this.name = JsonNullable.of(name);
    }

    public BundleDTO price(Integer price) {
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

    public BundleDTO products(List<BundleProductDTO> products) {
        this.products = JsonNullable.of(products);
        return this;
    }

    public BundleDTO addProductsItem(BundleProductDTO productsItem) {
        if (this.products == null || !this.products.isPresent()) {
            this.products = JsonNullable.of(new ArrayList<>());
        }
        this.products.get().add(productsItem);
        return this;
    }

    /**
     * Get products
     *
     * @return products
     */
    @ApiModelProperty(value = "")

    @Valid

    public List<BundleProductDTO> getProducts() {
        return products.orElse(null);
    }

    public void setProducts(List<BundleProductDTO> products) {
        this.products = JsonNullable.of(products);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BundleDTO bundleDTO = (BundleDTO) o;
        return Objects.equals(this.id, bundleDTO.id) &&
                Objects.equals(this.name, bundleDTO.name) &&
                Objects.equals(this.price, bundleDTO.price) &&
                Objects.equals(this.products, bundleDTO.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, products);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundleDTO {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

