package com.example.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolationException;
import java.nio.file.AccessDeniedException;
import java.rmi.AccessException;

@RestControllerAdvice
@Configuration("RestExceptionHandler")
public class RestExceptionHandler {

    @Autowired
    private HttpServletRequest request;

    private ResponseEntity<ErrorResponse> toResponse(Exception exception, HttpStatus status) {
        ErrorResponse entity = new ErrorResponse();
        entity.setTimestamp(System.currentTimeMillis());
        entity.setStatus(status.value());
        entity.setError(status.getReasonPhrase());
        entity.setMessage(exception.getMessage());
        entity.setPath(request.getRequestURI());
        return new ResponseEntity<>(entity, status);
    }

    // 400 bad request
    @ExceptionHandler({IllegalArgumentException.class, HttpRequestMethodNotSupportedException.class,
            MissingServletRequestParameterException.class, MethodArgumentTypeMismatchException.class,
            ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleBadRequest(Exception e) {
        return toResponse(e, HttpStatus.BAD_REQUEST);
    }

    // 403 forbidden
    @ExceptionHandler({AccessDeniedException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<ErrorResponse> handleForbinedRequest(Exception e) {
        return toResponse(e, HttpStatus.FORBIDDEN);
    }

    // 401 unauthorized
    @ExceptionHandler({AccessException.class})
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponseEntity<ErrorResponse> handleUnauthorized(Exception e) {
        return toResponse(e, HttpStatus.FORBIDDEN);
    }

    // 404 not found
    @ExceptionHandler({NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleNotFound(Exception e) {
        return toResponse(e, HttpStatus.NOT_FOUND);
    }

    // 500 internal server error
    @ExceptionHandler({RuntimeException.class, Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> handleFVManagementGenericException(Exception e) {
        return toResponse(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}