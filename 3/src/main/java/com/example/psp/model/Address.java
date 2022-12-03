package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class Address   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("line1")
  private JsonNullable<String> line1 = JsonNullable.undefined();

  @JsonProperty("line2")
  private JsonNullable<String> line2 = JsonNullable.undefined();

  @JsonProperty("city")
  private JsonNullable<String> city = JsonNullable.undefined();

  @JsonProperty("region")
  private JsonNullable<String> region = JsonNullable.undefined();

  @JsonProperty("country")
  private JsonNullable<String> country = JsonNullable.undefined();

  @JsonProperty("postalCode")
  private JsonNullable<String> postalCode = JsonNullable.undefined();

  public Address id(Integer id) {
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

  public Address line1(String line1) {
    this.line1 = JsonNullable.of(line1);
    return this;
  }

  /**
   * Get line1
   * @return line1
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getLine1() {
    return line1;
  }

  public void setLine1(JsonNullable<String> line1) {
    this.line1 = line1;
  }

  public Address line2(String line2) {
    this.line2 = JsonNullable.of(line2);
    return this;
  }

  /**
   * Get line2
   * @return line2
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getLine2() {
    return line2;
  }

  public void setLine2(JsonNullable<String> line2) {
    this.line2 = line2;
  }

  public Address city(String city) {
    this.city = JsonNullable.of(city);
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getCity() {
    return city;
  }

  public void setCity(JsonNullable<String> city) {
    this.city = city;
  }

  public Address region(String region) {
    this.region = JsonNullable.of(region);
    return this;
  }

  /**
   * Get region
   * @return region
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getRegion() {
    return region;
  }

  public void setRegion(JsonNullable<String> region) {
    this.region = region;
  }

  public Address country(String country) {
    this.country = JsonNullable.of(country);
    return this;
  }

  /**
   * Get country
   * @return country
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getCountry() {
    return country;
  }

  public void setCountry(JsonNullable<String> country) {
    this.country = country;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = JsonNullable.of(postalCode);
    return this;
  }

  /**
   * Get postalCode
   * @return postalCode
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(JsonNullable<String> postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.line1, address.line1) &&
        Objects.equals(this.line2, address.line2) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.region, address.region) &&
        Objects.equals(this.country, address.country) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, line1, line2, city, region, country, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    line1: ").append(toIndentedString(line1)).append("\n");
    sb.append("    line2: ").append(toIndentedString(line2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

