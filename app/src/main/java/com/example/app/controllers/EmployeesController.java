package com.example.app.controllers;


import com.example.app.dto.CreateEmployeeDto;
import com.example.app.dto.EmployeeInformation;
import com.example.app.dto.OrderDto;
import com.example.app.dto.PersonalInformation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Employees")
@RestController
@RequestMapping(value = "employees", produces = "application/json")
public class EmployeesController {

    @GetMapping("{employeeId}/information")
    public ResponseEntity<EmployeeInformation> getEmployeeInformation(@PathVariable String employeeId) {
        return null;
    }

    @GetMapping("{employeeId}/orders")
    public ResponseEntity<List<OrderDto>> getEmployeeOrders(@PathVariable String employeeId) {
        return null;
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<String> createEmployeeAccount(@io.swagger.v3.oas.annotations.parameters.RequestBody(required = true) @RequestBody CreateEmployeeDto employeeDto) {
        return null;
    }
    @DeleteMapping("{employeeId}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable String employeeId) {
        return null;
    }

}
