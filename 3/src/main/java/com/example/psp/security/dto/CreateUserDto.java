package com.example.psp.security.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateUserDto {

    private String firstName;

    private String lastName;

    private String password;

    private String password2;

    private String role;

}
