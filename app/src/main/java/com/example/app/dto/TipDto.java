package com.example.app.dto;

import java.math.BigDecimal;

public record TipDto(
        BigDecimal amount,
        String orderId
) {
}
