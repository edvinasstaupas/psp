package com.example.psp.services;

import com.example.psp.dto.CreateOrderDTO;
import com.example.psp.dto.OrderDTO;
import com.example.psp.dto.PaymentDTO;
import com.example.psp.security.User;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    public OrderDTO orderOrderIdGet(Integer orderId, User user) {
        return null;
    }

    public PaymentDTO orderOrderIdPaymentPost(Integer orderId, PaymentDTO paymentDTO, User user) {
        return null;
    }

    public void orderOrderIdRefundPost(Integer orderId, User user) {
    }

    public OrderDTO orderPost(CreateOrderDTO createOrderDTO, User user) {
        return null;
    }
}
