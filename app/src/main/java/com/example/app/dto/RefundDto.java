package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RefundDto {
    String requestId;
    String userId;
    String orderId;
    String name;
    String description;
    String status;
    String supportUserId;
}

