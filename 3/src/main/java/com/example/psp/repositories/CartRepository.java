package com.example.psp.repositories;

import com.example.psp.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartRepository extends JpaRepository<Cart, String> {

    Cart findCartById(String id);

    Cart findCartByCustomerId(Integer customerId);
}
