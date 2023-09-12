package com.greenfox.aze.reddit.exeptions;

import org.springframework.http.HttpStatus;

public class AppExeption extends RuntimeException{
    private HttpStatus httpStatus;

    public AppExeption(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getStatusCode() {
        return httpStatus;
    }

}
