package com.example.app.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "tax", produces = "application/json")
public class TaxController {

    @GetMapping("total")
    public ResponseEntity<BigDecimal> getTaxesTotalForStore() {
        return null;
    }

    @GetMapping()
    public ResponseEntity<List<?>> getTaxesForStore() {
        return null;
    }

}
