package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CredentialsDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class CredentialsDto   {
  @JsonProperty("email")
  private JsonNullable<String> email = JsonNullable.undefined();

  @JsonProperty("name")
  private JsonNullable<String> name = JsonNullable.undefined();

  @JsonProperty("password")
  private JsonNullable<String> password = JsonNullable.undefined();

  public CredentialsDto email(String email) {
    this.email = JsonNullable.of(email);
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getEmail() {
    return email;
  }

  public void setEmail(JsonNullable<String> email) {
    this.email = email;
  }

  public CredentialsDto name(String name) {
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

  public CredentialsDto password(String password) {
    this.password = JsonNullable.of(password);
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getPassword() {
    return password;
  }

  public void setPassword(JsonNullable<String> password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialsDto credentialsDto = (CredentialsDto) o;
    return Objects.equals(this.email, credentialsDto.email) &&
        Objects.equals(this.name, credentialsDto.name) &&
        Objects.equals(this.password, credentialsDto.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialsDto {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

