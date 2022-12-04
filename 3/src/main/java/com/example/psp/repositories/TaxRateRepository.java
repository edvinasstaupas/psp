package com.example.psp.repositories;

import com.example.psp.model.TaxRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRateRepository extends JpaRepository<TaxRate, Integer> {

}
