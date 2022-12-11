package com.example.psp.security;

import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

public class RoleFactory {

    public static Role getCustomerRole() {
        return new Role(1, "CUSTOMER");
    }

    public static Role getEmployeeRole() {
        return new Role(2, "EMPLOYEE");
    }

    public static Role getAdminRole() {
        return new Role(3, "ADMIN");
    }


    public static List<Role> getAuthorities(String[] roles) {
        List<Role> authorities = new ArrayList<>(roles.length);
        for (String role : roles) {
            Assert.isTrue(!role.startsWith("ROLE_"),
                    () -> role + " cannot start with ROLE_ (it is automatically added)");
            var r = switch (role) {
                case "CUSTOMER" -> RoleFactory.getCustomerRole();
                case "ADMIN" -> RoleFactory.getAdminRole();
                case "EMPLOYEE" -> RoleFactory.getEmployeeRole();
                default -> throw new RuntimeException();
            };
            authorities.add(r);
        }
        return authorities;
    }
}

