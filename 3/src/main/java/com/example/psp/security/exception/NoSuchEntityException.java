package com.example.psp.security.exception;

public abstract class NoSuchEntityException extends RuntimeException {
    public NoSuchEntityException(String entity, String ex) {
        super("No " + entity + " with " + ex);
    }

    public NoSuchEntityException(String entity, Long id) {
        super("No " + entity + " with id: " + id);
    }
}
