package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "loyalty", produces = "application/json")
public class LoyaltyController {

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

}
