package com.example.psp.model.a;

import com.example.psp.model.n.Tenant;
import jakarta.persistence.*;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenantId;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal rate;

    @NotNull
    private OffsetDateTime validFrom;

    private OffsetDateTime expiresAt;

}

