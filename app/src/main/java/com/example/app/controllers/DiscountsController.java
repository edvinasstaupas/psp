package com.example.app.controllers;


import com.example.app.dto.DiscountDto;
import org.springframework.http.HttpStatus;

import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Discounts")
@RestController
@RequestMapping(value = "discounts", produces = "application/json")
public class DiscountsController {

    @GetMapping
    public List<DiscountDto> getAll() {
        return null;
    }

    @PutMapping("{discountId}/apply")
    public void applyDiscount(@PathVariable String discountId) {
    }

    @PutMapping
    public void editDetails(@RequestBody DiscountDto discountDto) {
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public String createDiscount(@RequestBody DiscountDto discountDto) {
        return null;
    }
    
}
