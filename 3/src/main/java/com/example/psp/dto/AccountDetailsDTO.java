package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.Objects;

/**
 * AccountDetailsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class AccountDetailsDTO {
    @JsonProperty("name")
    private JsonNullable<String> name = JsonNullable.undefined();

    @JsonProperty("email")
    private JsonNullable<String> email = JsonNullable.undefined();

    public AccountDetailsDTO name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Name of the customer.
     *
     * @return name
     */
    @ApiModelProperty(value = "Name of the customer.")


    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public AccountDetailsDTO email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Email of the customer.
     *
     * @return email
     */
    @ApiModelProperty(value = "Email of the customer.")


    public JsonNullable<String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountDetailsDTO accountDetailsDTO = (AccountDetailsDTO) o;
        return Objects.equals(this.name, accountDetailsDTO.name) &&
                Objects.equals(this.email, accountDetailsDTO.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountDetailsDTO {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

