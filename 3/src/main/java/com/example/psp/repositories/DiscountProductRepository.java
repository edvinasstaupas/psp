package com.example.psp.repositories;

import com.example.psp.model.DiscountProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountProductRepository extends JpaRepository<DiscountProduct, Integer>  {
}
