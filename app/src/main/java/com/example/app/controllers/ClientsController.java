package com.example.app.controllers;

import com.example.app.dto.StoreDto;
import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "clients", produces = "application/json")
public class ClientsController {

    @PostMapping
    public ResponseEntity<?> addStore(@RequestBody StoreDto storeDto) { return null; }

    @PutMapping("{storeId}")
    public ResponseEntity<?> editStore(@RequestBody StoreDto storeDto) { return null; }

    @DeleteMapping("{storeId}")
    public ResponseEntity<?> deleteStore() { return null; }
}
