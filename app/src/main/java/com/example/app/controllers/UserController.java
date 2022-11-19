package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "users", produces = "application/json")
public class UserController {

    @PostMapping("login")
    public ResponseEntity<Void> login(String email, String password) {
        return null;
    }

    @PostMapping("register")
    public ResponseEntity<Void> register(String email, String password) {
        return null;
    }

    @PostMapping("personal-information")
    public ResponseEntity<Void> addPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        return null;
    }

}
