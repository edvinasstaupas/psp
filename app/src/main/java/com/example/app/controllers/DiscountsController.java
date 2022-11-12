package com.example.app.controllers;


import com.example.app.dto.DiscountDto;
import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "discounts", produces = "application/json")
public class DiscountsController {

    @PostMapping("login")
    public ResponseEntity<?> login(String email, String password) {
        return null;
    }

    @PostMapping("register")
    public ResponseEntity<?> register(String email, String password) {
        return null;
    }

    @PostMapping("personal-information")
    public ResponseEntity<?> addPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        return null;
    }

    @PostMapping("card-info")
    public ResponseEntity<?> enterCardInfo(String cardInfo) {
        return null;
    }

    @GetMapping("{storeId}")
    public ResponseEntity<?> getTaxesForStore(@PathVariable String storeId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<?> getAll() {
        return null;
    }

    @PutMapping("apply/{discountId}")
    public ResponseEntity<?> applyDiscount(@PathVariable String discountId) {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> editDetails(@RequestBody DiscountDto discountDto) {
        return null;
    }
}
