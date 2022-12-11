package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Objects;

/**
 * ServiceFilterDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ServiceFilterDto {
    @JsonProperty("name")
    private JsonNullable<String> name = JsonNullable.undefined();

    @JsonProperty("minDurationMins")
    private JsonNullable<Integer> minDurationMins = JsonNullable.undefined();

    @JsonProperty("maxDurationMins")
    private JsonNullable<Integer> maxDurationMins = JsonNullable.undefined();

    @JsonProperty("isAvailable")
    private JsonNullable<Boolean> isAvailable = JsonNullable.undefined();

    public ServiceFilterDto name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @ApiModelProperty(value = "")


    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public ServiceFilterDto minDurationMins(Integer minDurationMins) {
        this.minDurationMins = JsonNullable.of(minDurationMins);
        return this;
    }

    /**
     * Get minDurationMins
     *
     * @return minDurationMins
     */
    @ApiModelProperty(value = "")


    public JsonNullable<Integer> getMinDurationMins() {
        return minDurationMins;
    }

    public void setMinDurationMins(JsonNullable<Integer> minDurationMins) {
        this.minDurationMins = minDurationMins;
    }

    public ServiceFilterDto maxDurationMins(Integer maxDurationMins) {
        this.maxDurationMins = JsonNullable.of(maxDurationMins);
        return this;
    }

    /**
     * Get maxDurationMins
     *
     * @return maxDurationMins
     */
    @ApiModelProperty(value = "")


    public JsonNullable<Integer> getMaxDurationMins() {
        return maxDurationMins;
    }

    public void setMaxDurationMins(JsonNullable<Integer> maxDurationMins) {
        this.maxDurationMins = maxDurationMins;
    }

    public ServiceFilterDto isAvailable(Boolean isAvailable) {
        this.isAvailable = JsonNullable.of(isAvailable);
        return this;
    }

    /**
     * Get isAvailable
     *
     * @return isAvailable
     */
    @ApiModelProperty(value = "")


    public JsonNullable<Boolean> getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(JsonNullable<Boolean> isAvailable) {
        this.isAvailable = isAvailable;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceFilterDto serviceFilterDto = (ServiceFilterDto) o;
        return Objects.equals(this.name, serviceFilterDto.name) &&
                Objects.equals(this.minDurationMins, serviceFilterDto.minDurationMins) &&
                Objects.equals(this.maxDurationMins, serviceFilterDto.maxDurationMins) &&
                Objects.equals(this.isAvailable, serviceFilterDto.isAvailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, minDurationMins, maxDurationMins, isAvailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceFilterDto {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    minDurationMins: ").append(toIndentedString(minDurationMins)).append("\n");
        sb.append("    maxDurationMins: ").append(toIndentedString(maxDurationMins)).append("\n");
        sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
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

