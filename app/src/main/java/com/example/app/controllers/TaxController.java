package com.example.app.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Tag(name = "tax")
@RestController
@RequestMapping(value = "tax", produces = "application/json")
public class TaxController {

    @GetMapping("total")
    public ResponseEntity<BigDecimal> getTaxesTotalForStore() {
        return null;
    }

    @GetMapping("{productId}")
    public ResponseEntity<BigDecimal> getTaxesForProduct(@PathVariable String productId) {
        return null;
    }

}
