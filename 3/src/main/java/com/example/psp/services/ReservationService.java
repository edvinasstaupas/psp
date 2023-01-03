package com.example.psp.services;

import com.example.psp.dto.CreateReservationDTO;
import com.example.psp.dto.ReservationInformationDTO;
import com.example.psp.model.Customer;
import com.example.psp.model.Reservation;
import com.example.psp.model.TimeSlot;
import com.example.psp.repositories.CustomerRepository;
import com.example.psp.repositories.ReservationRepository;
import com.example.psp.repositories.TimeSlotRepository;
import com.example.psp.security.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ReservationService {

    private final CustomerRepository customerRepository;
    private final ReservationRepository reservationRepository;
    private final TimeSlotRepository timeSlotRepository;

    public ReservationService(CustomerRepository customerRepository, ReservationRepository reservationRepository, TimeSlotRepository timeSlotRepository) {
        this.customerRepository = customerRepository;
        this.reservationRepository = reservationRepository;
        this.timeSlotRepository = timeSlotRepository;
    }

    public ReservationInformationDTO reservationReservationIdGet(Integer reservationId, User user) {
        Reservation reservation = reservationRepository.getReservationById(reservationId);
        if(reservation == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        Customer customer = reservation.getCustomer();
        TimeSlot timeSlot = reservation.getTimeSlot();
        com.example.psp.model.Service service = timeSlot.getService();
        ReservationInformationDTO reservationInformationDTO = new ReservationInformationDTO();
        reservationInformationDTO.setReservationId(reservation.getId());
        reservationInformationDTO.setEnds(timeSlot.getEndTime());

        reservationInformationDTO.setServiceName(service.getName());
        reservationInformationDTO.setCustomerId(customer.getId());
        reservationInformationDTO.setStarts(timeSlot.getStartTime());
        reservationInformationDTO.setCustomerName(reservationInformationDTO.getCustomerName());
        reservationInformationDTO.setTimeSlotId(timeSlot.getId());
        return reservationInformationDTO;
    }

    public void reservationReservationIdCancelPost(Integer reservationId, User user) {
        Reservation reservation = reservationRepository.getReservationById(reservationId);
        if(reservation == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        reservationRepository.delete(reservation);

    }

    public ReservationInformationDTO reservationPost(CreateReservationDTO createReservationDTO, User user) {
        Customer customer = customerRepository.findCustomerById(createReservationDTO.getCustomerId());
        TimeSlot timeSlot = timeSlotRepository.findTimeSlotById(createReservationDTO.getTimeSlotId());
        com.example.psp.model.Service service = timeSlot.getService();

        Reservation reservation = new Reservation();
        reservation.setCustomer(customer);
        reservation.setTimeSlot(timeSlot);
        reservation = reservationRepository.save(reservation);

        ReservationInformationDTO reservationInformationDTO = new ReservationInformationDTO();
        reservationInformationDTO.setReservationId(reservation.getId());
        reservationInformationDTO.setEnds(timeSlot.getEndTime());

        reservationInformationDTO.setServiceName(service.getName());
        reservationInformationDTO.setCustomerId(customer.getId());
        reservationInformationDTO.setStarts(timeSlot.getStartTime());
        reservationInformationDTO.setCustomerName(reservationInformationDTO.getCustomerName());
        reservationInformationDTO.setTimeSlotId(timeSlot.getId());

        return reservationInformationDTO;
    }
}
