package com.festoffer.offertransaction.exception;

import com.festoffer.offertransaction.model.ErrorCode;
import lombok.Data;

@Data
public class OfferTransactionException extends RuntimeException {

    private ErrorCode errorCode;

    public  OfferTransactionException(ErrorCode errorCode){
        super();
        this.errorCode=errorCode;
    }

    public OfferTransactionException(ErrorCode errorCode,Exception exception) {
        super(exception);
        this.errorCode =errorCode;
    }
    public OfferTransactionException(String message, Exception exception){
        super(message,exception);
    }
    public OfferTransactionException(ErrorCode errorCode,String message,Exception exception){
        super(message,exception);
        this.errorCode=errorCode;
    }
}
