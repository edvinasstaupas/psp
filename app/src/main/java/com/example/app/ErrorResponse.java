package com.example.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

    private long timestamp;
    private int status;
    private String error;
    private String exception;
    private String message;
    private String path;

}
