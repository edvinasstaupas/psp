package com.example.psp.repositories;

import com.example.psp.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    @Query("SELECT o FROM OrderItem o ORDER BY o.total DESC LIMIT 5")
    List<OrderItem> getBestOrderItems();
}