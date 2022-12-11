package com.example.psp.api.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class RestUtils {

    public static ResponseEntity<Void> ok() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    public static <T> ResponseEntity<T> okOrNotFound(T entity) {
        if (entity == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entity);
    }
}
