package com.festoffer.offertransaction.repository;

import com.festoffer.offertransaction.model.OfferTransactionModel;
import com.festoffer.offertransaction.offertransactionrequest.OfferTransactionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffersRepository extends JpaRepository<OfferTransactionModel,String> {
}
