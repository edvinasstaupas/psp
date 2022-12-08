package com.example.psp.security.service;

import com.example.psp.security.entities.Role;

import java.util.Locale;

public class RoleFactory {

    public static Role getEmployeeRole() {
        return new Role(1L, "EMPLOYEE");
    }

    public static Role getCustomerRole() {
        return new Role(3L, "CUSTOMER");
    }

    public static Role getAdminRole() {
        return new Role(2L, "ADMIN");
    }

    public static Role getRolesByString(String role) {
        return switch (role.toUpperCase(Locale.ROOT)) {
            case "EMPLOYEE"-> getEmployeeRole();
            case "CUSTOMER"-> getCustomerRole();
            case "ADMIN" -> getAdminRole();
            default -> throw new RuntimeException(); // TODO: normal exception
        };
    }
}
