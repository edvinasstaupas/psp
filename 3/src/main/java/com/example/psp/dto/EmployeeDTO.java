package com.example.psp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * EmployeeDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class EmployeeDTO {
    @JsonProperty("firstName")
    private JsonNullable<String> firstName = JsonNullable.undefined();

    @JsonProperty("lastName")
    private JsonNullable<String> lastName = JsonNullable.undefined();

    @JsonProperty("userId")
    private JsonNullable<Integer> userId = JsonNullable.undefined();
    @JsonProperty("role")
    private JsonNullable<String> role = JsonNullable.undefined();



    @JsonProperty("dateHired")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateHired;

    @JsonProperty("dateDeleted")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dateDeleted;

    public EmployeeDTO userId(Integer userId) {
        this.userId = JsonNullable.of(userId);
        return this;
    }

    /**
     * User ID
     *
     * @return userId
     */
    @ApiModelProperty(value = "User ID")


    public JsonNullable<Integer> getUserId() {
        return userId;
    }

    public void setUserId(JsonNullable<Integer> userId) {
        this.userId = userId;
    }
    public EmployeeDTO firstName(String firstName) {
        this.firstName = JsonNullable.of(firstName);
        return this;
    }

    /**
     * First name of the employee
     *
     * @return firstName
     */
    @ApiModelProperty(value = "First name of the employee")


    public JsonNullable<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(JsonNullable<String> firstName) {
        this.firstName = firstName;
    }

    public EmployeeDTO lastName(String lastName) {
        this.lastName = JsonNullable.of(lastName);
        return this;
    }

    /**
     * Last name of the employee
     *
     * @return lastName
     */
    @ApiModelProperty(value = "Last name of the employee")


    public JsonNullable<String> getLastName() {
        return lastName;
    }

    public void setLastName(JsonNullable<String> lastName) {
        this.lastName = lastName;
    }

    public EmployeeDTO role(String role) {
        this.role = JsonNullable.of(role);
        return this;
    }

    /**
     * Role of the employee
     *
     * @return role
     */
    @ApiModelProperty(value = "Role of the employee")


    public JsonNullable<String> getRole() {
        return role;
    }

    public void setRole(JsonNullable<String> role) {
        this.role = role;
    }

    public EmployeeDTO dateHired(OffsetDateTime dateHired) {
        this.dateHired = dateHired;
        return this;
    }

    /**
     * Date when the employee was hired
     *
     * @return dateHired
     */
    @ApiModelProperty(value = "Date when the employee was hired")

    @Valid

    public OffsetDateTime getDateHired() {
        return dateHired;
    }

    public void setDateHired(OffsetDateTime dateHired) {
        this.dateHired = dateHired;
    }

    public EmployeeDTO dateDeleted(OffsetDateTime dateDeleted) {
        this.dateDeleted = dateDeleted;
        return this;
    }

    /**
     * Date when the employee has been deleted, aka hiden, from the system
     *
     * @return dateDeleted
     */
    @ApiModelProperty(value = "Date when the employee has been deleted, aka hiden, from the system")

    @Valid

    public OffsetDateTime getDateDeleted() {
        return dateDeleted;
    }

    public void setDateDeleted(OffsetDateTime dateDeleted) {
        this.dateDeleted = dateDeleted;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EmployeeDTO employeeDTO = (EmployeeDTO) o;
        return Objects.equals(this.firstName, employeeDTO.firstName) &&
                Objects.equals(this.lastName, employeeDTO.lastName) &&
                Objects.equals(this.role, employeeDTO.role) &&
                Objects.equals(this.dateHired, employeeDTO.dateHired) &&
                Objects.equals(this.dateDeleted, employeeDTO.dateDeleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, role, dateHired, dateDeleted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmployeeDTO {\n");

        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    dateHired: ").append(toIndentedString(dateHired)).append("\n");
        sb.append("    dateDeleted: ").append(toIndentedString(dateDeleted)).append("\n");
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

