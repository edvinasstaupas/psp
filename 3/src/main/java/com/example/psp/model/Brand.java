package com.example.psp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "brand")
    private List<DiscountBrand> brands;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

}
