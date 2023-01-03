package com.example.psp.repositories;

import com.example.psp.model.BundleProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BundleProductRepository extends JpaRepository<BundleProduct, Integer> {
    List<BundleProduct> findAllByProductId(Integer productId);
}

