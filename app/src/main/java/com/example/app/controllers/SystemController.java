package com.example.app.controllers;

import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "system", produces = "application/json")
public class SystemController {

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping("store-information")
    public ResponseEntity<?> editStoreInformation(@RequestBody StoreInformation storeInformation) {
        return null;
    }
}
