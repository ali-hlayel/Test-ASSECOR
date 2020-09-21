package com.assecor.personservice.config.exception;

import org.springframework.http.HttpStatus;

public class CreateErrorException extends ServiceResponseException {

    public CreateErrorException(String message) {
        super(message);
    }

    public CreateErrorException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getHttpStatusCode() {
        return HttpStatus.UNPROCESSABLE_ENTITY;
    }
}