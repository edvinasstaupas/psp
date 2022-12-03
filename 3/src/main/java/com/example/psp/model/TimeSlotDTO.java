package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import javax.validation.Valid;

/**
 * TimeSlotDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class TimeSlotDTO   {
  @JsonProperty("serviceId")
  private Integer serviceId;

  @JsonProperty("locationId")
  private Integer locationId;

  @JsonProperty("employeeId")
  private Integer employeeId;

  @JsonProperty("startTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  @JsonProperty("endTime")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endTime;

  public TimeSlotDTO serviceId(Integer serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * ID of the service that is provided during the time slot
   * @return serviceId
  */
  @ApiModelProperty(value = "ID of the service that is provided during the time slot")


  public Integer getServiceId() {
    return serviceId;
  }

  public void setServiceId(Integer serviceId) {
    this.serviceId = serviceId;
  }

  public TimeSlotDTO locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * ID of the location where the service is provided
   * @return locationId
  */
  @ApiModelProperty(value = "ID of the location where the service is provided")


  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public TimeSlotDTO employeeId(Integer employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * ID of the employer which provides the service
   * @return employeeId
  */
  @ApiModelProperty(value = "ID of the employer which provides the service")


  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public TimeSlotDTO startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Time slot start time
   * @return startTime
  */
  @ApiModelProperty(value = "Time slot start time")

  @Valid

  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public TimeSlotDTO endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Time slot end time
   * @return endTime
  */
  @ApiModelProperty(value = "Time slot end time")

  @Valid

  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSlotDTO timeSlotDTO = (TimeSlotDTO) o;
    return Objects.equals(this.serviceId, timeSlotDTO.serviceId) &&
        Objects.equals(this.locationId, timeSlotDTO.locationId) &&
        Objects.equals(this.employeeId, timeSlotDTO.employeeId) &&
        Objects.equals(this.startTime, timeSlotDTO.startTime) &&
        Objects.equals(this.endTime, timeSlotDTO.endTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, locationId, employeeId, startTime, endTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSlotDTO {\n");
    
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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

