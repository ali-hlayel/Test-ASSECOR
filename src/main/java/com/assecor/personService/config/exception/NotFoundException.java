package com.assecor.personService.config.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ServiceResponseException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getHttpStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
