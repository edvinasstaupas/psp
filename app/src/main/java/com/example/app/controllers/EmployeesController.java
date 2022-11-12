package com.example.app.controllers;


import com.example.app.dto.PersonalInformation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "employees", produces = "application/json")
public class EmployeesController {

    @PostMapping("login")
    public ResponseEntity<?> login(String email, String password) {
        return null;
    }

    @PostMapping("register")
    public ResponseEntity<?> register(String email, String password) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping("personal-information")
    public ResponseEntity<?> addPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        return null;
    }

    @GetMapping("{employeeId}/information")
    public ResponseEntity<?> getEmployeeInformation(@PathVariable employeeId) {
        return null;
    }

    @GetMapping("activities")
    public ResponseEntity<?> getEmployeeActivities(@PathVariable employeeId) {
        return null;
    }

    @ApiResponses({
            @ApiResponse(responseCode = "401")
    })
    @PostMapping
    public ResponseEntity<?> createEmployeeAccount(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateEmployeeDto employeeDto) {
        return null;
    }
    @DeleteMapping
    public ResponseEntity<?> deleteEmployee(@PathVariable String employeeId) {
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
