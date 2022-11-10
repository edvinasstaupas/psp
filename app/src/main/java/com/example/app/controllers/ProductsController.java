package com.example.app.controllers;

import com.example.app.dto.CreateProductDto;
import com.example.app.dto.EditProductDto;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "products", produces = "application/json")
@ApiResponses({
        @ApiResponse(responseCode = "200"),
        @ApiResponse(responseCode = "404"),
        @ApiResponse(responseCode = "401"),
        @ApiResponse(responseCode = "400"),
        @ApiResponse(responseCode = "500")
})
public class ProductsController {

    @GetMapping("{productId}/tax")
    public ResponseEntity<?> getProductTaxes(@PathVariable String productId) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @GetMapping("available-products")
    public ResponseEntity<?> getAvailableProducts() {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping
    public ResponseEntity<?> addProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateProductDto productDto) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PutMapping
    public ResponseEntity<?> editProduct(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody EditProductDto productDto) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @DeleteMapping
    public ResponseEntity<?> deleteProduct(@PathVariable String productId) {
        return null;
    }

}

