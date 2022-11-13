package com.example.app.controllers;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
