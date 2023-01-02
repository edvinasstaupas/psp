package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.TaxRate;
import com.example.psp.dto.TaxRateDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface TaxRateMapper {

    List<TaxRate> mapTaxRates(List<com.example.psp.model.TaxRate> rates);

    @Mapping(source = "tenant.id", target = "tenantId")
    TaxRate map(com.example.psp.model.TaxRate rate);

    void update(TaxRateDto taxRateDto, @MappingTarget com.example.psp.model.TaxRate taxRate);
}
