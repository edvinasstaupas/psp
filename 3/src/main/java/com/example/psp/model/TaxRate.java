package com.example.psp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PreRemove;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaxRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @NotNull
    private String name;

    private BigDecimal rate;

    @OneToMany(mappedBy = "taxRate")
    private List<Product> products;

    @OneToMany(mappedBy = "taxRate")
    private List<Service> services;

    @PreRemove
    private void preRemove() {
        services.forEach(service -> service.setTaxRate(null));
        products.forEach(product -> product.setTaxRate(null));
    }
}
