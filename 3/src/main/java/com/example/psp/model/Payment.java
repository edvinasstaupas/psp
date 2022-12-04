package com.example.psp.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    private PaymentType paymentType;
}
