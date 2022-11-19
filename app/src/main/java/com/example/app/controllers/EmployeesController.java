package com.example.app.controllers;


import com.example.app.dto.CreateEmployeeDto;
import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Employees")
@RestController
@RequestMapping(value = "employees", produces = "application/json")
public class EmployeesController {

    @PostMapping("login")
    public ResponseEntity<?> login(String email, String password) {
        return null;
    }

    @GetMapping("{employeeId}/information")
    public ResponseEntity<?> getEmployeeInformation(@PathVariable String employeeId) {
        return null;
    }

    @GetMapping("{employeeId}/activities")
    public ResponseEntity<?> getEmployeeActivities(@PathVariable String employeeId) {
        return null;
    }

    @PostMapping
    public ResponseEntity<?> createEmployeeAccount(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateEmployeeDto employeeDto) {
        return null;
    }
    @DeleteMapping("{employeeId}")
    public ResponseEntity<?> deleteEmployee(@PathVariable String employeeId) {
        return null;
    }

}
