package com.wecp.progressive.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Entity
public class Transactions {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private int accountId;
    private Double amount;
    private Date transactionDate;
    private String transactionType;

    //child 
    // @ManyToOne
    // private Accounts account;

    public Transactions() {
    }
    
    

    public Transactions(int transactionId, int accountId, Double amount, Date transactionDate, String transactionType) {
        this.transactionId = transactionId;
        this.accountId = accountId;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.transactionType = transactionType;
    }



    public int getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
    public int getAccountId() {
        return accountId;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Date getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    // public Accounts getAccount() {
    //     return account;
    // }
    // public void setAccount(Accounts account) {
    //     this.account = account;
    // }
   

    
    

    
    
    

}