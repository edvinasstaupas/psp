package com.example.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "tax", produces = "application/json")
public class TaxController {

    @GetMapping("{storeId]")
    public ResponseEntity<?> getTaxesForStore(@PathVariable String storeId) {
        return null;
    }

}
