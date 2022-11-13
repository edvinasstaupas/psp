package com.example.app.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateDiscountDto {
    private Product product;
    private BigDecimal discountPercent;
    private BigDecimal discountFlat;
    private DiscountType discountType;
}