package com.wecp.progressive.controller;


import com.wecp.progressive.entity.CreditCard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CreditCardController{

    @Autowired
    
    
    public ResponseEntity<List<CreditCard>> getAllCreditCards() {
       // return new ResponseEntity<List<CreditCard>>();
       return null;
    }


    public ResponseEntity<CreditCard> getCreditCardById(Long id) {
        return null;
    }

    public ResponseEntity<CreditCard> createCreditCard(CreditCard creditCard) {
        return null;
    }

    public ResponseEntity<Void> updateCreditCard(Long id, CreditCard creditCard) {
        return null;
    }

    public ResponseEntity<Void> deleteCreditCard(Long id) {
        return null;
    }
}
