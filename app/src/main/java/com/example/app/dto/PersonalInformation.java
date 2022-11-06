package com.example.app.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PersonalInformation {

    private String fullName;
    private String personalCode;
    private String address;

}
