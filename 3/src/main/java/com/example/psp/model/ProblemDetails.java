package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;

import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ProblemDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class ProblemDetails extends HashMap<String, Object>  {
  @JsonProperty("type")
  private JsonNullable<String> type = JsonNullable.undefined();

  @JsonProperty("title")
  private JsonNullable<String> title = JsonNullable.undefined();

  @JsonProperty("status")
  private JsonNullable<Integer> status = JsonNullable.undefined();

  @JsonProperty("detail")
  private JsonNullable<String> detail = JsonNullable.undefined();

  @JsonProperty("instance")
  private JsonNullable<String> instance = JsonNullable.undefined();

  public ProblemDetails type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  public ProblemDetails title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public ProblemDetails status(Integer status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public JsonNullable<Integer> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<Integer> status) {
    this.status = status;
  }

  public ProblemDetails detail(String detail) {
    this.detail = JsonNullable.of(detail);
    return this;
  }

  /**
   * Get detail
   * @return detail
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getDetail() {
    return detail;
  }

  public void setDetail(JsonNullable<String> detail) {
    this.detail = detail;
  }

  public ProblemDetails instance(String instance) {
    this.instance = JsonNullable.of(instance);
    return this;
  }

  /**
   * Get instance
   * @return instance
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getInstance() {
    return instance;
  }

  public void setInstance(JsonNullable<String> instance) {
    this.instance = instance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDetails problemDetails = (ProblemDetails) o;
    return Objects.equals(this.type, problemDetails.type) &&
        Objects.equals(this.title, problemDetails.title) &&
        Objects.equals(this.status, problemDetails.status) &&
        Objects.equals(this.detail, problemDetails.detail) &&
        Objects.equals(this.instance, problemDetails.instance) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDetails {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

