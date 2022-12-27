package com.example.psp.repositories;

import com.example.psp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    Location findLocationById(Integer integer);
    @Override
    void deleteById(Integer integer);
}

