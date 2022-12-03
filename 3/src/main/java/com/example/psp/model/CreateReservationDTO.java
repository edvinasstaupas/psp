package com.example.psp.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * CreateReservationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
public class CreateReservationDTO   {
  @JsonProperty("timeSlotId")
  private Integer timeSlotId;

  @JsonProperty("customerId")
  private Integer customerId;

  public CreateReservationDTO timeSlotId(Integer timeSlotId) {
    this.timeSlotId = timeSlotId;
    return this;
  }

  /**
   * Chosen timeslot.
   * @return timeSlotId
  */
  @ApiModelProperty(value = "Chosen timeslot.")


  public Integer getTimeSlotId() {
    return timeSlotId;
  }

  public void setTimeSlotId(Integer timeSlotId) {
    this.timeSlotId = timeSlotId;
  }

  public CreateReservationDTO customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Id of the customer that's making the reservation.
   * @return customerId
  */
  @ApiModelProperty(value = "Id of the customer that's making the reservation.")


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReservationDTO createReservationDTO = (CreateReservationDTO) o;
    return Objects.equals(this.timeSlotId, createReservationDTO.timeSlotId) &&
        Objects.equals(this.customerId, createReservationDTO.customerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeSlotId, customerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReservationDTO {\n");
    
    sb.append("    timeSlotId: ").append(toIndentedString(timeSlotId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

