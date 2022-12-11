package com.example.psp.services;

import com.example.psp.dto.EmployeeDTO;
import com.example.psp.security.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
public class EmployeeService {

    public void employeeEmployeeIdDelete(Integer employeeId, User user) {
    }

    public EmployeeDTO employeeEmployeeIdGet(Integer employeeId, User user) {
        return null;
    }

    public void employeeEmployeeIdPatch(Integer employeeId, OffsetDateTime date, User user) {
    }

    public void employeeEmployeeIdPermissionIdPatch(Integer employeeId, Integer permissionId, User user) {
    }

    public void employeeEmployeeIdPut(Integer employeeId, EmployeeDTO employeeDTO, User user) {
    }

    public void employeePost(EmployeeDTO employeeDTO, User user) {
    }
}
