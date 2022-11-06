package com.example.app.controllers;

import com.example.app.dto.CreateProductDto;
import com.example.app.dto.EditProductDto;
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
    public ResponseEntity<?> addProduct(@RequestBody CreateProductDto productDto) {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> editProduct(@RequestBody EditProductDto productDto) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<?> editProduct(@PathVariable String productId) {
        return null;
    }

    @GetMapping("{storeId}")
    public ResponseEntity<?> getTaxesForStore(@PathVariable String storeId) {
        return null;
    }

}

