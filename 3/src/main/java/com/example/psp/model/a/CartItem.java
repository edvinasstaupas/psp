package com.example.psp.model.a;

import com.example.psp.model.n.Bundle;
import com.example.psp.model.n.Cart;
import com.example.psp.model.n.Product;
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
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Cart cart;
    private Product product;
    private Bundle bundle;
    private Integer quantity;

}

