package com.example.psp.repositories;

import com.example.psp.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

    List<Reservation> findAllByCustomerIdAndTimeSlotStartTimeGreaterThanEqualAndTimeSlotEndTimeLessThanEqual(Integer customerId, OffsetDateTime startTime, OffsetDateTime endTime);
}
