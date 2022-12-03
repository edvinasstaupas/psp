package com.example.psp.model.a;

import com.example.psp.model.n.Tenant;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Tenant tenantId;
    private String name;
    private Integer durationMins;
    private Boolean isAvailable;
    private Integer taxRateId;

}