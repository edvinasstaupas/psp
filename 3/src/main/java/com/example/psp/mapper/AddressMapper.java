package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.AddressDto;
import com.example.psp.model.Address;
import org.mapstruct.Mapper;

@Mapper(config = DefaultMapperConfig.class)
public interface AddressMapper {
    Address toAddress(AddressDto addressDto);
}
