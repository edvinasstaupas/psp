package com.example.app.dto;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmployeeInformation {
    private PersonalInformation personalInformation;
    private Store store;
    private Role role;
}
