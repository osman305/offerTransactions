package com.festoffer.offertransaction.service;

import com.festoffer.offertransaction.cleancode.CleanCode;
import com.festoffer.offertransaction.model.OfferTransactionModel;
import com.festoffer.offertransaction.offertransactionrequest.OfferTransactionRequest;
import com.festoffer.offertransaction.offertransactionresponse.OfferTransactionResponse;
import com.festoffer.offertransaction.repository.OffersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class OfferService {
    @Autowired
    private OffersRepository offersRepository;

    @Autowired
    private CleanCode cleanCode;

    public List<OfferTransactionModel> getAllOffers() {
        return offersRepository.findAll();
    }

    public OfferTransactionModel applyOffer(OfferTransactionRequest offerTransactionRequest) {
        log.debug("debug message Inside saveRequest method of OfferTransactionService");
        log.info("Inside saveRequest new method of OfferTransactionService");
        OfferTransactionModel otm = cleanCode.applyOffer(offerTransactionRequest);
        return otm;
    }
}


//old code with return type OfferTransactionRequest

 /*  public OfferTransactionRequest applyOffer(OfferTransactionRequest offerTransactionRequest) {
        //log level should be debug here
        log.debug("inside applyOffer method of OfferService");
        OfferTransactionRequest otr = offersRepository.save(offerTransactionRequest;
        return otr;
    }
*/