package com.example.app.controllers;

import com.example.app.dto.StoreDto;
import com.example.app.dto.PersonalInformation;
import org.springframework.http.HttpStatus;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Clients")
@RestController
@RequestMapping(value = "clients", produces = "application/json")
public class ClientsController {

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<String> addStore(@RequestBody StoreDto storeDto) { return null; }

    @PutMapping("{storeId}")
    public ResponseEntity<Void> editStore(@PathVariable String storeId, @RequestBody StoreDto storeDto) { return null; }

    @DeleteMapping("{storeId}")
    public ResponseEntity<Void> deleteStore(@PathVariable String storeId) { return null; }
}
