package com.example.app.controllers;


import com.example.app.dto.DiscountDto;
import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "discounts")
@RestController
@RequestMapping(value = "discounts", produces = "application/json")
public class DiscountsController {

    @GetMapping
    public ResponseEntity<?> getAll() {
        return null;
    }

    @PutMapping("{discountId}/apply")
    public ResponseEntity<?> applyDiscount(@PathVariable String discountId) {
        return null;
    }

    @PutMapping
    public ResponseEntity<?> editDetails(@RequestBody DiscountDto discountDto) {
        return null;
    }
    
}
