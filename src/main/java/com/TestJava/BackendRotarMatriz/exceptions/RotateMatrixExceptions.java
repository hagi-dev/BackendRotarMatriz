package com.TestJava.BackendRotarMatriz.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class RotateMatrixExceptions extends RuntimeException {
    private String message;
    private HttpStatus httpStatus;

    public RotateMatrixExceptions (String message, HttpStatus httpStatus){
        super(message);
        this.message = message;
        this.httpStatus = httpStatus;
    }
}
