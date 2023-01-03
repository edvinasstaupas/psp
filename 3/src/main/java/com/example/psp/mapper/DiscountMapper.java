package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.DiscountDto;
import com.example.psp.model.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface DiscountMapper {

    List<com.example.psp.dto.Discount> mapDiscounts(List<Discount> discount);

    @Mapping(source = "tenant.id", target = "tenantId")
    com.example.psp.dto.Discount map(Discount discount);

    void update(DiscountDto discountDto, @MappingTarget Discount discount);
}
