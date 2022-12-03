package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MaterialDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class MaterialDTO   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("unit")
  private JsonNullable<String> unit = JsonNullable.undefined();

  @JsonProperty("availableQuantity")
  private Integer availableQuantity;

  public MaterialDTO id(Integer id) {
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

  public MaterialDTO name(String name) {
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

  public MaterialDTO unit(String unit) {
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

  public MaterialDTO availableQuantity(Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
    return this;
  }

  /**
   * Get availableQuantity
   * @return availableQuantity
  */
  @ApiModelProperty(value = "")


  public Integer getAvailableQuantity() {
    return availableQuantity;
  }

  public void setAvailableQuantity(Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaterialDTO materialDTO = (MaterialDTO) o;
    return Objects.equals(this.id, materialDTO.id) &&
        Objects.equals(this.name, materialDTO.name) &&
        Objects.equals(this.unit, materialDTO.unit) &&
        Objects.equals(this.availableQuantity, materialDTO.availableQuantity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, unit, availableQuantity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaterialDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    availableQuantity: ").append(toIndentedString(availableQuantity)).append("\n");
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

