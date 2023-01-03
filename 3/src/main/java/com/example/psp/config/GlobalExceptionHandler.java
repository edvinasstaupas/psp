package com.example.psp.config;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Void> handleValidationErrors(Exception ex) throws Exception {
        if (ex instanceof NoSuchElementException || ex instanceof EmptyResultDataAccessException)
            return ResponseEntity.notFound().build();
        if (ex instanceof IllegalArgumentException)
            return ResponseEntity.badRequest().build();
        throw ex;
    }

}