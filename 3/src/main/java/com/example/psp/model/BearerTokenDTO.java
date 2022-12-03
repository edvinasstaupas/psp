package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * BearerTokenDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
public class BearerTokenDTO   {
  @JsonProperty("token")
  private JsonNullable<String> token = JsonNullable.undefined();

  public BearerTokenDTO token(String token) {
    this.token = JsonNullable.of(token);
    return this;
  }

  /**
   * Bearer token
   * @return token
  */
  @ApiModelProperty(value = "Bearer token")


  public JsonNullable<String> getToken() {
    return token;
  }

  public void setToken(JsonNullable<String> token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BearerTokenDTO bearerTokenDTO = (BearerTokenDTO) o;
    return Objects.equals(this.token, bearerTokenDTO.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BearerTokenDTO {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

