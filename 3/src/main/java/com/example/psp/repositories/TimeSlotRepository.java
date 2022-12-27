package com.example.psp.repositories;

import com.example.psp.model.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Integer> {
    TimeSlot findTimeSlotById(Integer id);
}
