package com.example.app.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private Integer quantity;
    private BigDecimal price;
    private String storeId;
}
