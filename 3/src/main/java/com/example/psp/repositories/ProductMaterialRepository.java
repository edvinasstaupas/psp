package com.example.psp.repositories;

import com.example.psp.model.ProductMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMaterialRepository extends JpaRepository<ProductMaterial, Integer> {

    List<ProductMaterial> findAllByProductId(Integer productId);
}
