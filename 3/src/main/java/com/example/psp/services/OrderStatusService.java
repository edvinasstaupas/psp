package com.example.psp.services;

import com.example.psp.dto.OrderStatusDTO;
import com.example.psp.dto.OrderStatusEnum;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

@Service
public class OrderStatusService {

    public void orderStatusOrderStatusIdDelete(Integer orderStatusId, User user) {
    }

    public OrderStatusDTO orderStatusOrderStatusIdGet(Integer orderStatusId, User user) {
        return null;
    }

    public void orderStatusOrderStatusIdPatch(Integer orderStatusId, OrderStatusEnum newOrderStatus, User user) {
    }

    public void orderStatusOrderStatusIdPut(Integer orderStatusId, OrderStatusDTO orderStatusDTO, User user) {
    }

    public void orderStatusPost(OrderStatusDTO orderStatusDTO, User user) {
    }
}

