package com.example.psp.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;

/**
 * ReservationInformationDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:59:11.404204200+02:00[Europe/Vilnius]")
public class ReservationInformationDTO   {
  @JsonProperty("reservationId")
  private Integer reservationId;

  @JsonProperty("customerId")
  private Integer customerId;

  @JsonProperty("timeSlotId")
  private Integer timeSlotId;

  @JsonProperty("customerName")
  private JsonNullable<String> customerName = JsonNullable.undefined();

  @JsonProperty("serviceWorkerName")
  private JsonNullable<String> serviceWorkerName = JsonNullable.undefined();

  @JsonProperty("serviceName")
  private JsonNullable<String> serviceName = JsonNullable.undefined();

  @JsonProperty("starts")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime starts;

  @JsonProperty("ends")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime ends;

  public ReservationInformationDTO reservationId(Integer reservationId) {
    this.reservationId = reservationId;
    return this;
  }

  /**
   * Id of the reservation.
   * @return reservationId
  */
  @ApiModelProperty(value = "Id of the reservation.")


  public Integer getReservationId() {
    return reservationId;
  }

  public void setReservationId(Integer reservationId) {
    this.reservationId = reservationId;
  }

  public ReservationInformationDTO customerId(Integer customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Id of the customer.
   * @return customerId
  */
  @ApiModelProperty(value = "Id of the customer.")


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public ReservationInformationDTO timeSlotId(Integer timeSlotId) {
    this.timeSlotId = timeSlotId;
    return this;
  }

  /**
   * Id of the timeslot.
   * @return timeSlotId
  */
  @ApiModelProperty(value = "Id of the timeslot.")


  public Integer getTimeSlotId() {
    return timeSlotId;
  }

  public void setTimeSlotId(Integer timeSlotId) {
    this.timeSlotId = timeSlotId;
  }

  public ReservationInformationDTO customerName(String customerName) {
    this.customerName = JsonNullable.of(customerName);
    return this;
  }

  /**
   * Name of the customer.
   * @return customerName
  */
  @ApiModelProperty(value = "Name of the customer.")


  public JsonNullable<String> getCustomerName() {
    return customerName;
  }

  public void setCustomerName(JsonNullable<String> customerName) {
    this.customerName = customerName;
  }

  public ReservationInformationDTO serviceWorkerName(String serviceWorkerName) {
    this.serviceWorkerName = JsonNullable.of(serviceWorkerName);
    return this;
  }

  /**
   * Name of the assigned service provider.
   * @return serviceWorkerName
  */
  @ApiModelProperty(value = "Name of the assigned service provider.")


  public JsonNullable<String> getServiceWorkerName() {
    return serviceWorkerName;
  }

  public void setServiceWorkerName(JsonNullable<String> serviceWorkerName) {
    this.serviceWorkerName = serviceWorkerName;
  }

  public ReservationInformationDTO serviceName(String serviceName) {
    this.serviceName = JsonNullable.of(serviceName);
    return this;
  }

  /**
   * Name of the booked service.
   * @return serviceName
  */
  @ApiModelProperty(value = "Name of the booked service.")


  public JsonNullable<String> getServiceName() {
    return serviceName;
  }

  public void setServiceName(JsonNullable<String> serviceName) {
    this.serviceName = serviceName;
  }

  public ReservationInformationDTO starts(OffsetDateTime starts) {
    this.starts = starts;
    return this;
  }

  /**
   * When the reservation starts.
   * @return starts
  */
  @ApiModelProperty(value = "When the reservation starts.")

  @Valid

  public OffsetDateTime getStarts() {
    return starts;
  }

  public void setStarts(OffsetDateTime starts) {
    this.starts = starts;
  }

  public ReservationInformationDTO ends(OffsetDateTime ends) {
    this.ends = ends;
    return this;
  }

  /**
   * When the reservation ends.
   * @return ends
  */
  @ApiModelProperty(value = "When the reservation ends.")

  @Valid

  public OffsetDateTime getEnds() {
    return ends;
  }

  public void setEnds(OffsetDateTime ends) {
    this.ends = ends;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReservationInformationDTO reservationInformationDTO = (ReservationInformationDTO) o;
    return Objects.equals(this.reservationId, reservationInformationDTO.reservationId) &&
        Objects.equals(this.customerId, reservationInformationDTO.customerId) &&
        Objects.equals(this.timeSlotId, reservationInformationDTO.timeSlotId) &&
        Objects.equals(this.customerName, reservationInformationDTO.customerName) &&
        Objects.equals(this.serviceWorkerName, reservationInformationDTO.serviceWorkerName) &&
        Objects.equals(this.serviceName, reservationInformationDTO.serviceName) &&
        Objects.equals(this.starts, reservationInformationDTO.starts) &&
        Objects.equals(this.ends, reservationInformationDTO.ends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reservationId, customerId, timeSlotId, customerName, serviceWorkerName, serviceName, starts, ends);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReservationInformationDTO {\n");
    
    sb.append("    reservationId: ").append(toIndentedString(reservationId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    timeSlotId: ").append(toIndentedString(timeSlotId)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    serviceWorkerName: ").append(toIndentedString(serviceWorkerName)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    starts: ").append(toIndentedString(starts)).append("\n");
    sb.append("    ends: ").append(toIndentedString(ends)).append("\n");
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

