package com.example.psp.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;

    @NotNull
    private String name;

    private String notes;

    private BigDecimal unitPrice;

    private BigDecimal quantity;

    private BigDecimal taxRate;

    private BigDecimal discountRate;

    private BigDecimal total;

}
