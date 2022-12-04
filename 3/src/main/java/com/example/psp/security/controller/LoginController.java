package com.example.psp.security.controller;

import com.example.psp.security.dto.LoginResponse;
import com.example.psp.security.entities.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @PostMapping
    public LoginResponse login(@AuthenticationPrincipal User user) {
        return new LoginResponse(user);
    }
}
