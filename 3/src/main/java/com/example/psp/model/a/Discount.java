package com.example.psp.model.a;

import com.example.psp.model.n.Tenant;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

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
    private Tenant tenantId;
    private String name;
    private Double rate;
    private OffsetDateTime validFrom;
    private OffsetDateTime expiresAt;

}

