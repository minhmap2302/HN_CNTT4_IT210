package com.restaurant.bai5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InvalidOrderIdException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidOrderId(InvalidOrderIdException ex) {
        return ex.getMessage();
    }
}