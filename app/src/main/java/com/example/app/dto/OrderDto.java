package com.example.app.dto;

import java.time.LocalDateTime;

public record OrderDto(
        String userId,
        LocalDateTime startDate,
        LocalDateTime estimatedEndDate,
        LocalDateTime endDate,
        String moreInfo,
        OrderStatus orderStatus,
        String storeUserId
) {
}
