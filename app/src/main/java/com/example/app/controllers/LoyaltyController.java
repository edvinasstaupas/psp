package com.example.app.controllers;

import com.example.app.dto.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Loyalty")
@RestController
@RequestMapping(value = "loyalty", produces = "application/json")
public class LoyaltyController {

    @GetMapping("information")
    public ResponseEntity<?> getInformation() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createLoyaltyProgram(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateLoyaltyProgramDto loyaltyProgramDto) {
        return null;
    }

    @PostMapping("loyalty-information")
    public ResponseEntity<?> addLoyaltyInformation(@RequestBody LoyaltyInformation loyaltyInformation) {
        return null;
    }

}
