package com.example.psp.repositories;

import com.example.psp.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer>  {
}
