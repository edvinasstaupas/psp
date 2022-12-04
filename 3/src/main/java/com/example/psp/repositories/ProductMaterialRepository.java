package com.example.psp.repositories;

import com.example.psp.model.ProductMaterial;
import com.example.psp.services.ProductMaterialService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMaterialRepository extends JpaRepository<ProductMaterial, Integer> {

}
