package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.CartItemDTO;
import com.example.psp.dto.OrderDTO;
import com.example.psp.dto.OrderItemDTO;
import com.example.psp.model.CartItem;
import com.example.psp.model.Order;
import com.example.psp.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface OrderMapper {
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "employee.id", target = "employeeId")
    @Mapping(source = "tipsAmount", target = "tipsAmmount")
    @Mapping(source = "orderItems", target = "items")
    OrderDTO map(Order source);

    List<OrderItemDTO> mapOrderItems(List<OrderItem> orderItems);

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "service.id", target = "serviceId")
    OrderItemDTO mapOrderItem(OrderItem orderItem);

}
