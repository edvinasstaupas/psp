package com.example.app.dto;

import java.math.BigDecimal;

public record DiscountDto(
        String productId,
        BigDecimal discountPercent,
        BigDecimal discountFlat,
        DiscountType discountType
) {
}
