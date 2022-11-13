package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class User {
    private String id;
    private PersonalInformation personalInformation;
    private String email;
    private String password;
    private String cardInfo;
}
