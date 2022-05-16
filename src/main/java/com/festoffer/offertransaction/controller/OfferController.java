package com.festoffer.offertransaction.controller;


import com.festoffer.offertransaction.model.OfferTransactionModel;
import com.festoffer.offertransaction.offertransactionrequest.OfferTransactionRequest;
import com.festoffer.offertransaction.service.OfferService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/offer")
@Slf4j
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/allAppliedOffers")
    public List<OfferTransactionModel> getAllAppliedOffers(){
        log.info("Inside getAllAppliedOffers method of Controller");
        return offerService.getAllOffers();
    }

    @PostMapping("/applyoffer")
    public OfferTransactionModel applyOffer(@RequestBody OfferTransactionRequest offerTransactionRequest){
        log.debug("debug message Inside applyOffer method of Controller");
      OfferTransactionModel otm = offerService.applyOffer(offerTransactionRequest);
        return otm;
    }
}



                                //TO DO LIST
// 1. convert offer transaction request to offer transaction model
// 2. offerTransactionReposiTory should take offerTransactionModel instead of offerTransactionRequest
// 3. it should return offer transaction model
// 4. conver offer tansactionmodel to offertransactionresponse
// 5. should return offertransaction response




                    //old code with return type OfferTransactionRequest

//    @PostMapping("/postOffer")
//    public OfferTransactionRequest applyOffer1(@RequestBody OfferTransactionRequest offerTransactionRequest){
//        log.debug("debug message 2 Inside applyOfferRequest method of Controller");
//        return offerService.applyOffer(offerTransactionRequest);
//    }