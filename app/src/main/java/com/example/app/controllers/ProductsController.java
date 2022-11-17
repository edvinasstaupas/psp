package com.example.app.controllers;

import com.example.app.dto.CreateProductDto;
import com.example.app.dto.EditProductDto;
import com.example.app.dto.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping(value = "products", produces = "application/json")
public class ProductsController {

    @GetMapping("{productId}/tax")
    public ResponseEntity<BigDecimal> getProductTaxes(@PathVariable String productId) {
        return null;
    }

    @GetMapping("available-products")
    public ResponseEntity<List<Product>> getAvailableProducts() {
        return null;
    }

    @PostMapping
    public ResponseEntity<Void> addProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateProductDto productDto) {
        return null;
    }

    @PutMapping
    public ResponseEntity<Void> editProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody EditProductDto productDto) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteProduct(@PathVariable String productId) {
        return null;
    }

}

