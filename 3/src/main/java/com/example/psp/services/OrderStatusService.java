package com.example.psp.services;

import com.example.psp.dto.OrderStatusDTO;
import com.example.psp.dto.OrderStatusEnum;
import com.example.psp.mapper.OrderStatusMapper;
import com.example.psp.model.Order;
import com.example.psp.model.OrderStatus;
import com.example.psp.repositories.OrderRepository;
import com.example.psp.repositories.OrderStatusRepository;
import com.example.psp.security.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class OrderStatusService {
    private final OrderStatusRepository orderStatusRepository;
    private final OrderRepository orderRepository;
    private final OrderStatusMapper orderStatusMapper;

    public OrderStatusService(OrderStatusRepository orderStatusRepository, OrderRepository orderRepository, OrderStatusMapper orderStatusMapper) {
        this.orderStatusRepository = orderStatusRepository;
        this.orderRepository = orderRepository;
        this.orderStatusMapper = orderStatusMapper;
    }

    public void orderStatusOrderStatusIdDelete(Integer orderStatusId, User user) {
        OrderStatus orderStatus = orderStatusRepository.findOrderStatusById(orderStatusId);
        if(orderStatus == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        orderStatusRepository.deleteById(orderStatusId);
    }

    public OrderStatusDTO orderStatusOrderStatusIdGet(Integer orderStatusId, User user) {
        OrderStatus orderStatus = orderStatusRepository.findOrderStatusById(orderStatusId);
        if(orderStatus == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        return orderStatusMapper.map(orderStatus);
    }

    public void orderStatusOrderStatusIdPatch(Integer orderStatusId, OrderStatusEnum newOrderStatus, User user) {
        OrderStatus orderStatus = orderStatusRepository.findOrderStatusById(orderStatusId);
        if(orderStatus == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        orderStatus.setStatus(OrderStatusEnum.values()[newOrderStatus.getValue()]);
        orderStatusRepository.save(orderStatus);
    }

    public void orderStatusOrderStatusIdPut(Integer orderStatusId, OrderStatusDTO orderStatusDTO, User user) {
        OrderStatus orderStatus = orderStatusRepository.findOrderStatusById(orderStatusId);
        Order order = orderRepository.findOrderById(orderStatusDTO.getOrderId());
        if(orderStatus == null || order == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        orderStatus.setOrder(order);
        orderStatus.setStatus(OrderStatusEnum.values()[orderStatusDTO.getStatus().getValue()]);
        orderStatusRepository.save(orderStatus);
    }

    public void orderStatusPost(OrderStatusDTO orderStatusDTO, User user) {
        OrderStatus orderStatus = new OrderStatus();
        Order order = orderRepository.findOrderById(orderStatusDTO.getOrderId());
        if(order == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        orderStatus.setOrder(order);
        orderStatus.setStatus(OrderStatusEnum.values()[orderStatusDTO.getStatus().getValue()]);
        orderStatusRepository.save(orderStatus);
    }
}

