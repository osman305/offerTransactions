package com.festoffer.offertransaction.offertransactionresponse;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OfferTransactionResponse {

    private String storeNumber;
    private String memberId;
    private String terminalNumber;
    private String transactionNumber;
}
