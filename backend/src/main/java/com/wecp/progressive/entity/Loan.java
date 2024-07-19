package com.wecp.progressive.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class Loan {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String loanType;
    private Double amount;
    
   
    public Loan() {
    }
    
    public Loan(int id, String loanType, Double amount) {
        this.id = id;
        this.loanType = loanType;
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    



}