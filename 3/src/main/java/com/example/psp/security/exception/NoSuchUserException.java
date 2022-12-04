package com.example.psp.security.exception;

public class NoSuchUserException extends NoSuchEntityException {
    public NoSuchUserException(Long id) {
        super("user", id);
    }

    public NoSuchUserException(String userNumber) {
        super("user", "userNumber: " + userNumber);
    }
}
