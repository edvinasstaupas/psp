package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.*;

/**
 * LoginDetailsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class LoginDetailsDTO   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("password")
  private String password;

  public LoginDetailsDTO email(String email) {
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

  public LoginDetailsDTO password(String password) {
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
    LoginDetailsDTO loginDetailsDTO = (LoginDetailsDTO) o;
    return Objects.equals(this.email, loginDetailsDTO.email) &&
        Objects.equals(this.password, loginDetailsDTO.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginDetailsDTO {\n");
    
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

