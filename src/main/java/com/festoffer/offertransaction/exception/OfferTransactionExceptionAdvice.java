package com.festoffer.offertransaction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OfferTransactionExceptionAdvice {

    @ExceptionHandler(OfferTransactionException.class)
    public ResponseEntity<Object> handleExceptions(OfferTransactionException offerTransactionException) {
        ResponseEntity responseEntity = new ResponseEntity(offerTransactionException.getErrorCode(), HttpStatus.BAD_REQUEST);
        return responseEntity;
    }
}