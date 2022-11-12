package com.example.app.dto;

import lombok.*;

import java.time.OffsetDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateLoyaltyProgramDto {
    private User user;
    private String number;
    private OffsetDateTime startDate;
    private OffsetDateTime expirationDate;
}