package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateRefundDto {
    String userId;
    String orderId;
    String name;
    String description;
}
