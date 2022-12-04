package com.example.psp.repositories;

import com.example.psp.model.BundleProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BundleProductRepository extends JpaRepository<BundleProduct, Integer> {

}

