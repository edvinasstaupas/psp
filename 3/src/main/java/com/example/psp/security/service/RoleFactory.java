package com.example.psp.security.service;

import com.example.psp.security.entities.Role;

public class RoleFactory {

    public static Role getUserRole() {
        return new Role(1L, "USER");
    }

    public static Role getLibrarianRole() {
        return new Role(3L, "LIBRARIAN");
    }

    public static Role getAdminRole() {
        return new Role(2L, "ADMIN");
    }
}
