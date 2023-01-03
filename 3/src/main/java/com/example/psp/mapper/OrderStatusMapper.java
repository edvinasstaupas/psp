package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.OrderStatusDTO;
import com.example.psp.model.OrderStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = DefaultMapperConfig.class)
public interface OrderStatusMapper {
    @Mapping(source = "order.id", target = "orderId")
    OrderStatusDTO map(OrderStatus source);
}

