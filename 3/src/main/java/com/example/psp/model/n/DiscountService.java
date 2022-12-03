package com.example.psp.model.n;


import com.example.psp.model.a.Service;
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
public class DiscountService {

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
    @JoinColumn(name = "service_id")
    private Service service;

}