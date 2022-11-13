package com.example.app.controllers;

import com.example.app.dto.OrderDto;
import com.example.app.dto.OrderInformation;
import com.example.app.dto.PersonalInformation;
import com.example.app.dto.TipDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "orders", produces = "application/json")
public class OrdersController {

    @PostMapping("product/{productId}/{orderId}")
    public ResponseEntity<?> addProductToOrder(@PathVariable String productId, @PathVariable String orderId) {
        return null;
    }

    @DeleteMapping("product/{productId}/{orderId}")
    public ResponseEntity<?> deleteProductFromOrder(@PathVariable String productId, @PathVariable String orderId) {
        return null;
    }

    @PostMapping("save")
    public ResponseEntity<?> saveOrderInformationAsTemplate(@RequestBody OrderInformation orderInformation) {
        return null;
    }

    @GetMapping("previous/{userId}")
    public ResponseEntity<?> getPreviousOrders(@PathVariable String userId) {
        return null;
    }

    @GetMapping("user/{userId}")
    public ResponseEntity<?> getCurrentOrder(@PathVariable String userId) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createOrder(@RequestBody OrderDto orderDto) {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> updateOrder(@RequestBody OrderDto orderDto) {
        return null;
    }

    @PostMapping("tip")
    public ResponseEntity<?> addTipToOrder(@RequestBody TipDto tipDto) {
        return null;
    }

    @PutMapping("{orderId}/cancel")
    public ResponseEntity<?> cancelOrder(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("{orderId}/status")
    public ResponseEntity<?> getOrderStatus(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("{orderId}/remaining-time")
    public ResponseEntity<?> getRemainingTime(@PathVariable String orderId) {
        return null;
    }

    @PutMapping("{orderId}/confirm")
    public ResponseEntity<?> confirmOrder(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("completed")
    public ResponseEntity<?> getAllCompletedOrders() {
        return null;
    }

}
