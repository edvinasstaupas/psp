package com.example.psp.security.dto;

import com.example.psp.security.entities.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserDto {

    private Long id;

    private String userNumber;

    private String firstName;

    private String lastName;

    private Set<Role> roles;
}
