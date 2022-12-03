package com.example.psp.model.a;

import com.example.psp.model.n.Material;
import com.example.psp.model.n.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductMaterial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Product product;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Material material;

    private BigDecimal quantity;

}

