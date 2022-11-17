package com.example.springobservable;

import org.springframework.stereotype.Service;

@Service
public class OracleImplementation implements PurchaseOrderServiceCustomerB {
    @Override
    public String getPurchaseOrdersByRating(Integer ratingNumber) {
        return "I'm an Oracle implementation";
    }
}
