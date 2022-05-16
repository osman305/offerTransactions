package com.festoffer.offertransaction.offertransactionrequest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "applied_Offer")
public class OfferTransactionRequest {

    @Id
    private String storeNumber;
    private String memberId;
    private String terminalNumber;
    private String transactionNumber;
}
