package com.example.app.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateProductDto {
    private String name;
    private String description;
    private Integer quantity;
    private BigDecimal price;
    private Store store;
}
