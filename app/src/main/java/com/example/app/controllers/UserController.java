package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "users", produces = "application/json")
@ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "400"),
        @ApiResponse(responseCode = "500")
})
public class UserController {

    @PostMapping("login")
    public ResponseEntity<?> login(String email, String password) {
        return null;
    }

    @PostMapping("register")
    public ResponseEntity<?> register(String email, String password) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping("personal-information")
    public ResponseEntity<?> addPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        return null;
    }

}
