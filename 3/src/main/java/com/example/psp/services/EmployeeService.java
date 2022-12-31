package com.example.psp.services;

import com.example.psp.dto.EmployeeDTO;
import com.example.psp.mapper.EmployeeMapper;
import com.example.psp.model.Employee;
import com.example.psp.repositories.EmployeeRepository;
import com.example.psp.security.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.OffsetDateTime;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }


    public void employeeEmployeeIdDelete(Integer employeeId, User user) {
        if(employeeId <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
        if(employeeRepository.findEmployeeById(employeeId) == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        try {
            employeeRepository.deleteById(employeeId);
        } catch (Exception ex) {
            throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Employee cannot be deleted");
        }


    }

    public EmployeeDTO employeeEmployeeIdGet(Integer employeeId, User user) {
        if(employeeId <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
        Employee employee = employeeRepository.findEmployeeById(employeeId);

        return employeeMapper.toDto(employee);
    }

    public void employeeEmployeeIdPatch(Integer employeeId, OffsetDateTime date, User user) {
        if(employeeId <= 0) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST
            );
        }
        Employee employee = employeeRepository.findEmployeeById(employeeId);
        if(employee == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        employee.setDateHired(date);
        employeeRepository.save(employee);
    }

    public void employeeEmployeeIdPermissionIdPatch(Integer employeeId, Integer permissionId, User user) {
    }

    public void employeeEmployeeIdPut(Integer employeeId, EmployeeDTO employeeDTO, User user) {

        Employee employee = employeeMapper.toEntity(employeeDTO);
        employee.setId(employeeId);
        employeeRepository.save(employee);
    }

    @Deprecated
    public void employeePost(EmployeeDTO employeeDTO, User user) {
    }
}
