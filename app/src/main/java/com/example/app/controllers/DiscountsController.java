package com.example.app.controllers;


import com.example.app.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "discounts", produces = "application/json")
public class DiscountsController {

    @PostMapping
    public ResponseEntity<?> createDiscount(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateDiscountDto discountDto) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteDiscount(@PathVariable String discountId) {
        return null;
    }

}
