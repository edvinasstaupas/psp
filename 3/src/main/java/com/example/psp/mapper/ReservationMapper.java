package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.ReservationInformationDTO;
import com.example.psp.model.Reservation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface ReservationMapper {

    List<ReservationInformationDTO> mapReservations(List<Reservation> reservation);

    @Mapping(source = "id", target = "reservationId")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "timeSlot.id", target = "timeSlotId")
    @Mapping(source = "customer.name", target = "customerName")
    @Mapping(source = "timeSlot.employee.user.username", target = "serviceWorkerName")
    @Mapping(source = "timeSlot.service.name", target = "serviceName")
    @Mapping(source = "timeSlot.startTime", target = "starts")
    @Mapping(source = "timeSlot.endTime", target = "ends")
    ReservationInformationDTO map(Reservation reservation);
}