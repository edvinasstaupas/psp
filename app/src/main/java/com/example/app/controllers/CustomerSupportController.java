package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "customer-support")
@RestController
@RequestMapping(value = "customer-support", produces = "application/json")
public class CustomerSupportController {

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

    @GetMapping("{storeId}")
    public ResponseEntity<?> getTaxesForStore(@PathVariable String storeId) {
        return null;
    }
}
