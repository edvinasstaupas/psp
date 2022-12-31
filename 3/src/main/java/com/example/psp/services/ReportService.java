package com.example.psp.services;

import com.example.psp.dto.*;
import com.example.psp.mapper.OrderItemMapper;
import com.example.psp.model.Location;
import com.example.psp.model.OrderItem;
import com.example.psp.repositories.OrderItemRepository;
import com.example.psp.security.User;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {
    private final OrderItemRepository orderItemRepository;
    private final OrderItemMapper orderItemMapper;

    public ReportService(OrderItemRepository orderItemRepository, OrderItemMapper orderItemMapper) {
        this.orderItemRepository = orderItemRepository;
        this.orderItemMapper = orderItemMapper;
    }

    public DetailedSalesReportDTO reportDetailedSalesReportGet(User user) {

        List<OrderItem> orderItems = orderItemRepository.findAll();
        DetailedSalesReportDTO detailedSalesReportDTO = new DetailedSalesReportDTO();

        BigDecimal total = BigDecimal.valueOf(0.0);

        List<OrderItemDTO> list = new ArrayList<OrderItemDTO>( orderItems.size() );
        for(OrderItem orderItem : orderItems) {
            list.add(orderItemMapper.map(orderItem));
            total = total.add(orderItem.getTotal());
        }

        detailedSalesReportDTO.setItems(JsonNullable.of(list));
        detailedSalesReportDTO.setTotal(total.doubleValue());
        return detailedSalesReportDTO;
    }

    public BriefSalesReportDTO reportBriefSalesReportGet(User user) {
        List<OrderItem> orderItems = orderItemRepository.getBestOrderItems();
        BriefSalesReportDTO briefSalesReportDTO = new BriefSalesReportDTO();

        BigDecimal total = BigDecimal.valueOf(0.0);
        List<BriefSalesReportItemDTO> list = new ArrayList<BriefSalesReportItemDTO>( orderItems.size() );
        for(OrderItem orderItem : orderItems) {
            list.add(orderItemMapper.mapToReportItem(orderItem));
            total = total.add(orderItem.getTotal());
        }

        briefSalesReportDTO.setItems(JsonNullable.of(list));
        briefSalesReportDTO.setTotal(total.doubleValue());
        return briefSalesReportDTO;
    }
}
