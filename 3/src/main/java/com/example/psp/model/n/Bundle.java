package com.example.psp.model.n;

import com.example.psp.model.a.BundleProduct;
import com.example.psp.model.a.CartItem;
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
public class Bundle {

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
    private BigDecimal price;

    @OneToMany(mappedBy = "bundle")
    private List<BundleProduct> BundleProducts;

    @OneToMany(mappedBy = "bundle")
    private List<CartItem> cartItems;

}
