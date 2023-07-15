package com.eryk.myapi.exceptions;

public class ObejectNotFoundException extends RuntimeException{
    private static final Long serialVersionUID = 1L;

    public ObejectNotFoundException(String message) {
        super(message);
    }

    public ObejectNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
