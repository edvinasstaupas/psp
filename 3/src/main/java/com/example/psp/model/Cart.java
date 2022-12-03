package com.example.psp.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private OffsetDateTime dateCreated;

    private OffsetDateTime lastAccessed;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

}
