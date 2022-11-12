package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Discount {
    private String id;
    private Product product;
    private Decimal discountPercent;
    private Decimal discountFlat;
    private DiscountType discountType;
}
