package com.example.psp.repositories;

import com.example.psp.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    Reservation getReservationById(Integer id);
}
