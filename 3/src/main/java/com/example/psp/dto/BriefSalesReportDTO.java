package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BriefSalesReportDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class BriefSalesReportDTO {
    @JsonProperty("items")
    @Valid
    private JsonNullable<List<BriefSalesReportItemDTO>> items = JsonNullable.undefined();

    @JsonProperty("total")
    private Double total;

    public BriefSalesReportDTO items(List<BriefSalesReportItemDTO> items) {
        this.items = JsonNullable.of(items);
        return this;
    }

    public BriefSalesReportDTO addItemsItem(BriefSalesReportItemDTO itemsItem) {
        if (this.items == null || !this.items.isPresent()) {
            this.items = JsonNullable.of(new ArrayList<>());
        }
        this.items.get().add(itemsItem);
        return this;
    }

    /**
     * Get items
     *
     * @return items
     */
    @ApiModelProperty(value = "")

    @Valid

    public JsonNullable<List<BriefSalesReportItemDTO>> getItems() {
        return items;
    }

    public void setItems(JsonNullable<List<BriefSalesReportItemDTO>> items) {
        this.items = items;
    }

    public BriefSalesReportDTO total(Double total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     */
    @ApiModelProperty(value = "")


    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BriefSalesReportDTO briefSalesReportDTO = (BriefSalesReportDTO) o;
        return Objects.equals(this.items, briefSalesReportDTO.items) &&
                Objects.equals(this.total, briefSalesReportDTO.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BriefSalesReportDTO {\n");

        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

