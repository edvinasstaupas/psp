package com.example.app.controllers;

import com.example.app.dto.OrderDto;
import com.example.app.dto.OrderStatus;
import com.example.app.dto.OrderTemplateDto;
import com.example.app.dto.TipDto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping(value = "orders", produces = "application/json")
public class OrdersController {

    @PostMapping("product/{productId}/{orderId}")
    public void addProductToOrder(@PathVariable String productId, @PathVariable String orderId) {
    }

    @DeleteMapping("product/{productId}/{orderId}")
    public void deleteProductFromOrder(@PathVariable String productId, @PathVariable String orderId) {
    }

    @PostMapping("save")
    public OrderTemplateDto saveOrderInformationAsTemplate(@RequestBody OrderTemplateDto orderInformation) {
        return null;
    }

    @GetMapping("previous/{userId}")
    public List<OrderDto> getPreviousOrders(@PathVariable String userId) {
        return null;
    }

    @GetMapping("user/{userId}")
    public OrderDto getCurrentOrder(@PathVariable String userId) {
        return null;
    }

    @PostMapping
    public String createOrder(@RequestBody OrderDto orderDto) {
        return null;
    }

    @PutMapping
    public void updateOrder(@RequestBody OrderDto orderDto) {
    }

    @PostMapping("tip")
    public void addTipToOrder(@RequestBody TipDto tipDto) {
    }

    @PutMapping("{orderId}/cancel")
    public void cancelOrder(@PathVariable String orderId) {
    }

    @GetMapping("{orderId}/status")
    public OrderStatus getOrderStatus(@PathVariable String orderId) {
        return null;
    }

    @GetMapping("{orderId}/remaining-time")
    public Duration getRemainingTime(@PathVariable String orderId) {
        return null;
    }

    @PutMapping("{orderId}/confirm")
    public void confirmOrder(@PathVariable String orderId) {
    }

    @GetMapping("completed")
    public List<OrderDto> getAllCompletedOrders() {
        return null;
    }

}
