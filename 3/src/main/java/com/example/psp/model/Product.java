package com.example.psp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @NotNull
    private String name;

    private String unit;
    private BigDecimal price;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tax_rate_Id")
    private TaxRate taxRate;

    private BigDecimal availableQuantity;

    private boolean isDisabled;

    @OneToMany(mappedBy = "product")
    private List<ProductMaterial> productMaterials;
    @OneToMany(mappedBy = "product")
    private List<DiscountProduct> discounts;

}
