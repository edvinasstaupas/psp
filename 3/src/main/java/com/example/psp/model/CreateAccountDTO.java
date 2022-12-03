package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * CreateAccountDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class CreateAccountDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  public CreateAccountDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the customer.
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the customer.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateAccountDTO email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the customer.
   * @return email
  */
  @ApiModelProperty(required = true, value = "Email of the customer.")
  @NotNull


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CreateAccountDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the customer.
   * @return password
  */
  @ApiModelProperty(required = true, value = "Password of the customer.")
  @NotNull


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
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
    CreateAccountDTO createAccountDTO = (CreateAccountDTO) o;
    return Objects.equals(this.name, createAccountDTO.name) &&
        Objects.equals(this.email, createAccountDTO.email) &&
        Objects.equals(this.password, createAccountDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAccountDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

