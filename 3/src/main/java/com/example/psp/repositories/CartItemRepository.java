package com.example.psp.repositories;

import com.example.psp.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {
    CartItem findCartItemById(Integer id);
}
