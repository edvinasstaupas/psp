package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "users", produces = "application/json")
public class UserController {

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

}
