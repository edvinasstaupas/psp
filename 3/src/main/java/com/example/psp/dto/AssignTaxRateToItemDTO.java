package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Objects;

/**
 * AssignTaxRateToItemDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class AssignTaxRateToItemDTO {
    @JsonProperty("taxRateId")
    private Integer taxRateId;

    @JsonProperty("productId")
    private JsonNullable<Integer> productId = JsonNullable.undefined();

    @JsonProperty("serviceId")
    private JsonNullable<Integer> serviceId = JsonNullable.undefined();

    public AssignTaxRateToItemDTO taxRateId(Integer taxRateId) {
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

    public AssignTaxRateToItemDTO productId(Integer productId) {
        this.productId = JsonNullable.of(productId);
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     */
    @ApiModelProperty(value = "")


    public JsonNullable<Integer> getProductId() {
        return productId;
    }

    public void setProductId(JsonNullable<Integer> productId) {
        this.productId = productId;
    }

    public AssignTaxRateToItemDTO serviceId(Integer serviceId) {
        this.serviceId = JsonNullable.of(serviceId);
        return this;
    }

    /**
     * Get serviceId
     *
     * @return serviceId
     */
    @ApiModelProperty(value = "")


    public JsonNullable<Integer> getServiceId() {
        return serviceId;
    }

    public void setServiceId(JsonNullable<Integer> serviceId) {
        this.serviceId = serviceId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssignTaxRateToItemDTO assignTaxRateToItemDTO = (AssignTaxRateToItemDTO) o;
        return Objects.equals(this.taxRateId, assignTaxRateToItemDTO.taxRateId) &&
                Objects.equals(this.productId, assignTaxRateToItemDTO.productId) &&
                Objects.equals(this.serviceId, assignTaxRateToItemDTO.serviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxRateId, productId, serviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssignTaxRateToItemDTO {\n");

        sb.append("    taxRateId: ").append(toIndentedString(taxRateId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

