package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.PaymentDTO;
import com.example.psp.model.Payment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(config = DefaultMapperConfig.class)
public interface PaymentMapper {
    @Mapping(source = "order.id", target = "orderId")
    PaymentDTO map(Payment source);
}

