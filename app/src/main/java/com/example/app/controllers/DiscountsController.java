package com.example.app.controllers;


import com.example.app.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "discounts", produces = "application/json")
public class DiscountsController {


    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping
    public ResponseEntity<?> createDiscount(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateDiscountDto discountDto) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @DeleteMapping
    public ResponseEntity<?> deleteDiscount(@PathVariable String discountId) {
        return null;
    }

    @PostMapping("login")
    public ResponseEntity<?> login(String email, String password) {
        return null;
    }

    @PostMapping("personal-information")
    public ResponseEntity<?> addPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        return null;
    }





    @PostMapping("card-info")
    public ResponseEntity<?> enterCardInfo(String cardInfo) {
        return null;
    }

    @GetMapping("{storeId}")
    public ResponseEntity<?> getTaxesForStore(@PathVariable String storeId) {
        return null;
    }

}
