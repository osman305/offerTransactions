package com.festoffer.offertransaction.validation;

import com.festoffer.offertransaction.exception.OfferTransactionException;
import com.festoffer.offertransaction.model.ErrorCode;
import com.festoffer.offertransaction.offertransactionrequest.OfferTransactionRequest;

public class OfferTransactionValidation {

    public static void validateOfferTransactionRequest(OfferTransactionRequest offerTransactionRequest) {

        if (offerTransactionRequest.getTerminalNumber().length() > 7) {
            ErrorCode errorCode = new ErrorCode();
            errorCode.setMessage("terminal number should not be greater than 7");
            OfferTransactionException offerTransactionException = new OfferTransactionException(errorCode);
            throw offerTransactionException;
        }
    }
}
