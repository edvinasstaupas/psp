package com.example.psp.repositories;

import com.example.psp.model.Bundle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BundleRepository extends JpaRepository<Bundle, Integer> {
    Bundle findBundleById(Integer id);
}
