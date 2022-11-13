package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import com.example.app.dto.StoreInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "system", produces = "application/json")
public class SystemController {

    @PostMapping("store-information")
    public ResponseEntity<?> editStoreInformation(@RequestBody StoreInformation storeInformation) {
        return null;
    }

}
