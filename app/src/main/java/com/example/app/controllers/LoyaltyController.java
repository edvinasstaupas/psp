package com.example.app.controllers;

import com.example.app.dto.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Loyalty")
@RestController
@RequestMapping(value = "loyalty", produces = "application/json")
public class LoyaltyController {

    @GetMapping("information")
    public ResponseEntity<LoyaltyInformation> getInformation() {
        return null;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<String> createLoyaltyProgram(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateLoyaltyProgramDto loyaltyProgramDto) {
        return null;
    }

    @PostMapping("loyalty-information")
    public ResponseEntity<Void> addLoyaltyInformation(@RequestBody LoyaltyInformation loyaltyInformation) {
        return null;
    }

}
