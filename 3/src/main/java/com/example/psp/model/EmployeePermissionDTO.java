package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * EmployeePermissionDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class EmployeePermissionDTO   {
  @JsonProperty("permissionId")
  private Integer permissionId;

  @JsonProperty("employeeId")
  private Integer employeeId;

  public EmployeePermissionDTO permissionId(Integer permissionId) {
    this.permissionId = permissionId;
    return this;
  }

  /**
   * Permission ID
   * @return permissionId
  */
  @ApiModelProperty(value = "Permission ID")


  public Integer getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(Integer permissionId) {
    this.permissionId = permissionId;
  }

  public EmployeePermissionDTO employeeId(Integer employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Employee ID to who the permission is granted to
   * @return employeeId
  */
  @ApiModelProperty(value = "Employee ID to who the permission is granted to")


  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePermissionDTO employeePermissionDTO = (EmployeePermissionDTO) o;
    return Objects.equals(this.permissionId, employeePermissionDTO.permissionId) &&
        Objects.equals(this.employeeId, employeePermissionDTO.employeeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionId, employeeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePermissionDTO {\n");
    
    sb.append("    permissionId: ").append(toIndentedString(permissionId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
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

