package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreateLoyaltyProgramDto {
    private User user;
    private String number;
    private Datetime startDate;
    private Datetime expirationDate;
}