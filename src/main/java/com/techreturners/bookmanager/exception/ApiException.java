package com.techreturners.bookmanager.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {
    private final String message;
    private final HttpStatus httpstatus;
    private final ZonedDateTime timestamp;

    public ApiException(String message, HttpStatus httpstatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpstatus = httpstatus;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpstatus() {
        return httpstatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
