package com.example.psp.services;

import com.example.psp.dto.CreateOrderDTO;
import com.example.psp.dto.OrderDTO;
import com.example.psp.dto.OrderStatusEnum;
import com.example.psp.dto.PaymentDTO;
import com.example.psp.mapper.OrderMapper;
import com.example.psp.mapper.PaymentMapper;
import com.example.psp.model.*;
import com.example.psp.repositories.*;
import com.example.psp.security.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.math.BigDecimal;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;
    private final PaymentRepository paymentRepository;
    private final PaymentMapper paymentMapper;
    private final OrderStatusRepository orderStatusRepository;
    private final EmployeeRepository employeeRepository;
    private final CustomerRepository customerRepository;
    private final TenantRepository tenantRepository;

    public OrderService(OrderRepository orderRepository, OrderMapper orderMapper, PaymentRepository paymentRepository, PaymentMapper paymentMapper, OrderStatusRepository orderStatusRepository, EmployeeRepository employeeRepository, CustomerRepository customerRepository, TenantRepository tenantRepository) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
        this.paymentRepository = paymentRepository;
        this.paymentMapper = paymentMapper;
        this.orderStatusRepository = orderStatusRepository;
        this.employeeRepository = employeeRepository;
        this.customerRepository = customerRepository;
        this.tenantRepository = tenantRepository;
    }

    public OrderDTO orderOrderIdGet(Integer orderId, User user) {
        Order order = orderRepository.findOrderById(orderId);
        System.out.println(order.getOrderStatuses().size());
        return orderMapper.map(order);
    }

    public PaymentDTO orderOrderIdPaymentPost(Integer orderId, PaymentDTO paymentDTO, User user) {
        Order order = orderRepository.findOrderById(orderId);
        if(order == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        System.out.println(paymentDTO.getChange());
        if(!paymentDTO.getPaymentType().equals(com.example.psp.dto.PaymentType.CASH) && paymentDTO.getChange() != null) {
            throw new ResponseStatusException(
                   HttpStatus.BAD_REQUEST
            );
        }
        Payment payment = new Payment();
        payment.setPaymentType(PaymentType.values()[paymentDTO.getPaymentType().getValue()]);
        payment.setOrder(order);
        paymentRepository.save(payment);

        return paymentMapper.map(payment);
    }

    public void orderOrderIdRefundPost(Integer orderId, User user) {
        Order order = orderRepository.findOrderById(orderId);
        if(order == null) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND
            );
        }
        OrderStatus orderStatus = new OrderStatus();
        orderStatus.setOrder(order);
        orderStatus.setStatus(OrderStatusEnum.REFUNDED);
        orderStatusRepository.save(orderStatus);

    }

    public OrderDTO orderPost(CreateOrderDTO createOrderDTO, User user) {
        Integer customerId = createOrderDTO.getCustomerId().orElse(-1);
        Integer employeeId = createOrderDTO.getEmployeeId().orElse(-1);

        Customer customer = customerRepository.findCustomerById(customerId);
        Employee employee = employeeRepository.findEmployeeById(employeeId);
        Tenant tenant = tenantRepository.findTenantById(user.getTenantId());

        Order order = new Order();
        order.setCustomer(customer);
        order.setEmployee(employee);
        order.setTenant(tenant);
        order.setTotal(BigDecimal.valueOf(0));
        order.setTipsAmount(BigDecimal.valueOf(createOrderDTO.getTipsAmmount()));

        orderRepository.save(order);

        return orderMapper.map(order);
    }
}
