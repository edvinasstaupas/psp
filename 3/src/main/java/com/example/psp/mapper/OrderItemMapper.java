package com.example.psp.mapper;

import com.example.psp.config.mapper.DefaultMapperConfig;
import com.example.psp.dto.BriefSalesReportDTO;
import com.example.psp.dto.BriefSalesReportItemDTO;
import com.example.psp.dto.OrderItemDTO;
import com.example.psp.model.Order;
import com.example.psp.model.OrderItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(config = DefaultMapperConfig.class)
public interface OrderItemMapper {
    @Mapping(source = "id",  target = "id")
    @Mapping(source = "name",  target = "name")
    @Mapping(source = "taxRate",  target = "tax")
    @Mapping(source = "discountRate",  target = "discount")
    @Mapping(source = "quantity",  target = "quantity")
    @Mapping(source = "total",  target = "totalPrice")
    BriefSalesReportItemDTO mapToReportItem(OrderItem orderItem);

    List<BriefSalesReportItemDTO> mapToReportItems(List<OrderItem> orderItems);

    OrderItemDTO map(OrderItem orderItem);

}
