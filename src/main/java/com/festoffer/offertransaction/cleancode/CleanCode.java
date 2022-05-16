package com.festoffer.offertransaction.cleancode;

import com.festoffer.offertransaction.model.OfferTransactionModel;
import com.festoffer.offertransaction.offertransactionrequest.OfferTransactionRequest;
import com.festoffer.offertransaction.offertransactionresponse.OfferTransactionResponse;
import com.festoffer.offertransaction.repository.OffersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CleanCode {
    @Autowired
    private OffersRepository offersRepository;

    public OfferTransactionModel applyOffer(OfferTransactionRequest offerTransactionRequest) {
        log.info("inside applyOffer method of CleanCode");
        OfferTransactionModel offerTransactionModel = new OfferTransactionModel();
        offerTransactionModel.setStoreNumber(offerTransactionRequest.getStoreNumber());
        offerTransactionModel.setMemberId(offerTransactionRequest.getMemberId());
        offerTransactionModel.setTransactionNumber(offerTransactionRequest.getTransactionNumber());
        offerTransactionModel.setTerminalNumber(offerTransactionRequest.getTerminalNumber());
        OfferTransactionModel otm = offersRepository.save(offerTransactionModel);
        return otm;
    }

    public OfferTransactionResponse convertRequestToResponse(OfferTransactionModel offerTransactionModel) {
        log.info("inside convertRequestToResponse method of CleanCode");
        OfferTransactionResponse response = new OfferTransactionResponse();
        response.setStoreNumber(offerTransactionModel.getStoreNumber());
        response.setTerminalNumber(offerTransactionModel.getTerminalNumber());
        response.setTransactionNumber(offerTransactionModel.getTransactionNumber());
        response.setMemberId(offerTransactionModel.getMemberId());
        return response;
    }
}
