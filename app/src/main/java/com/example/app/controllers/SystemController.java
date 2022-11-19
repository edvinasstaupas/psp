package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import com.example.app.dto.StoreInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "System")
@RestController
@RequestMapping(value = "system", produces = "application/json")
public class SystemController {

    @PutMapping("store-information")
    public ResponseEntity<Void> editStoreInformation(@RequestBody StoreInformation storeInformation) {
        return null;
    }

}
