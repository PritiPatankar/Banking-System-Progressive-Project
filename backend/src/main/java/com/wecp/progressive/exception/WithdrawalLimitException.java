package com.wecp.progressive.exception;

public class WithdrawalLimitException extends RuntimeException{
    public WithdrawalLimitException(String eMsg){
        super(eMsg);
    }
}