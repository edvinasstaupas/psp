package com.example.psp.model;


import javax.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private OffsetDateTime dateCreated;

    private OffsetDateTime lastAccessed;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

}
