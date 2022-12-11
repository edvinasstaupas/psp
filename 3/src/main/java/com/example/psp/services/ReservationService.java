package com.example.psp.services;

import com.example.psp.dto.CreateReservationDTO;
import com.example.psp.dto.ReservationInformationDTO;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    public ReservationInformationDTO reservationReservationIdGet(Integer reservationId, User user) {
        return null;
    }

    public void reservationReservationIdCancelPost(Integer reservationId, User user) {
    }

    public ReservationInformationDTO reservationPost(CreateReservationDTO createReservationDTO, User user) {
        return null;
    }
}
