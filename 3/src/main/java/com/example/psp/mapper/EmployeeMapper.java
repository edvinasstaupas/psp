package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.EmployeeDTO;
import com.example.psp.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(config = DefaultMapperConfig.class)
public interface EmployeeMapper {

    EmployeeDTO toDto(Employee employee);

    Employee toEntity(EmployeeDTO employeeDTO);
}