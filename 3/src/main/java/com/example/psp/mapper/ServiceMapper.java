package com.example.psp.mapper;


import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.Service;
import com.example.psp.dto.ServiceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface ServiceMapper {

    List<Service> map(List<com.example.psp.model.Service> services);

    @Mapping(source = "tenant.id", target = "tenantId")
    @Mapping(source = "taxRate.id", target = "taxRateId")
    Service map(com.example.psp.model.Service service);

    void update(ServiceDto serviceDto, @MappingTarget com.example.psp.model.Service service);
}
