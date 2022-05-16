package com.festoffer.offertransaction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "applied_Offer")
public class OfferTransactionModel {
    @Id
    private String storeNumber;
    private String memberId;
    private String terminalNumber;
    private String transactionNumber;
}
