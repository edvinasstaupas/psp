package com.example.psp.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DiscountProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal rate;

    @NotNull
    private OffsetDateTime validFrom;

    @NotNull
    private OffsetDateTime expiresAt;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}