package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.EmployeeDTO;
import com.example.psp.model.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(config = DefaultMapperConfig.class)
public interface EmployeeMapper {

    @Mapping(source = "user.id",  target = "userId")
    EmployeeDTO toDto(Employee employee);

    Employee toEntity(EmployeeDTO employeeDTO);
}