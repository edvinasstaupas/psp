package com.example.psp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenantId;

    @NotNull
    private String name;

    private Integer durationMins;

    @NotNull
    @ColumnDefault("true")
    private Boolean isAvailable;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tax_rate")
    private TaxRate taxRate;

}