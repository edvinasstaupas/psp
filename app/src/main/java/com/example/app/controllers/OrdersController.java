package com.example.app.controllers;

import com.example.app.dto.OrderDto;
import com.example.app.dto.OrderInformation;
import com.example.app.dto.PersonalInformation;
import com.example.app.dto.TipDto;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ApiResponse(responseCode = "200")
@ApiResponse(responseCode = "400")
@ApiResponse(responseCode = "401")
@RequestMapping(value = "orders", produces = "application/json")
public class OrdersController {

    @GetMapping("login")
    public ResponseEntity<?> login(String email, String password) {
        return null;
    }

    @GetMapping("register")
    public ResponseEntity<?> register(@RequestBody PersonalInformation personalInformation) {
        return null;
    }

    @PostMapping("card-info")
    public ResponseEntity<?> enterCardInfo(String cardInfo) {
        return null;
    }

    @GetMapping("store/{storeId}")
    public ResponseEntity<?> getTaxesForStore(@PathVariable String storeId) {
        return null;
    }

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

    @PutMapping("tip")
    public ResponseEntity<?> addTipToOrder(@RequestBody TipDto tipDto) {
        return null;
    }

    @DeleteMapping("{orderId}")
    public ResponseEntity<?> cancelOrder(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("status/{orderId}")
    public ResponseEntity<?> getOrderStatus(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("remaining-time/{orderId}")
    public ResponseEntity<?> getRemainingTime(@PathVariable String orderId) {
        return null;
    }

    @PutMapping("confirm/{orderId}")
    public ResponseEntity<?> confirmOrder(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("completed")
    public ResponseEntity<?> getAllCompletedOrders() {
        return null;
    }

}
