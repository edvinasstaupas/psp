package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "system", produces = "application/json")
public class SystemController {

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

}
