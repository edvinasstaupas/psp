package com.example.psp.security.dto;

import com.example.psp.security.entities.Role;
import com.example.psp.security.entities.User;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class LoginResponse {
    private final String username;
    private final Set<String> roles;
    private final String fullUserName;

    public LoginResponse(User user) {
        this.username = user.getUsername();
        this.roles = user.getRoles().stream()
                .map(Role::getAuthority)
                .collect(Collectors.toSet());
        this.fullUserName = user.getFirstName() + " " + user.getLastName();
    }
}
