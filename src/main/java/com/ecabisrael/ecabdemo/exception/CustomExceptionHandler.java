package com.ecabisrael.ecabdemo.exception;

import org.springframework.http.HttpStatus;

public interface CustomExceptionHandler {
    HttpStatus value(); // You can define additional attributes if needed
}
