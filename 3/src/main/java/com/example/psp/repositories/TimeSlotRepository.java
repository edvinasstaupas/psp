package com.example.psp.repositories;

import com.example.psp.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Integer> {

    TimeSlot findTimeSlotById(Integer id);

    List<TimeSlot> findAllByStartTimeGreaterThanEqualAndEndTimeLessThanEqual(OffsetDateTime startTime, OffsetDateTime endTime);

    List<TimeSlot> findAllByLocationId(Integer locationId);

    List<TimeSlot> findAllByServiceId(Integer serviceId);
}
