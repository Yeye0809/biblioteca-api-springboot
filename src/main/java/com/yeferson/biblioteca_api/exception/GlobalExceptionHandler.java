package com.yeferson.biblioteca_api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LibroNoEncontrado.class)
    public ResponseEntity<String> manejarLibroNoEncontrado(LibroNoEncontrado ERROR){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ERROR.getMessage());
    }
}
