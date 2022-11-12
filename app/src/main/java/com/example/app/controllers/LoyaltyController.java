package com.example.app.controllers;

import com.example.app.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "loyalty", produces = "application/json")
public class LoyaltyController {

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @GetMapping("information")
    public ResponseEntity<?> getInformation() {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping
    public ResponseEntity<?> createLoyaltyProgram(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateLoyaltyProgramDto loyaltyProgramDto) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping("loyalty-information")
    public ResponseEntity<?> addLoyaltyInformation(@RequestBody LoyaltyInformation loyaltyInformation) {
        return null;
    }

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
