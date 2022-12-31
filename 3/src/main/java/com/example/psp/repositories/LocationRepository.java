package com.example.psp.repositories;

import com.example.psp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    Location findLocationById(Integer integer);

    @Query("select l from Location l")
    List<Location> findAllLocations();
}

