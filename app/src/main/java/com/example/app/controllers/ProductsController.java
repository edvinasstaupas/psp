package com.example.app.controllers;

import com.example.app.dto.CreateProductDto;
import com.example.app.dto.EditProductDto;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "products", produces = "application/json")
public class ProductsController {

    @GetMapping("{productId}/tax")
    public ResponseEntity<?> getProductTaxes(@PathVariable String productId) {
        return null;
    }

    @GetMapping("available-products")
    public ResponseEntity<?> getAvailableProducts() {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateProductDto productDto) {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> editProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody EditProductDto productDto) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@PathVariable String productId) {
        return null;
    }

}

