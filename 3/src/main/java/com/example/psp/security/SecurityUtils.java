package com.example.psp.security;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class SecurityUtils {

    private SecurityUtils() {
    }

    public static void checkTenantId(Integer id, User user) {
        if (!id.equals(user.getTenantId()))
            throw new ResponseStatusException(HttpStatus.FORBIDDEN);
    }
}
