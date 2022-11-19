package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Tag(name = "Users")
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

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("personal-information")
    public ResponseEntity<Void> addPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        return null;
    }

}
