package com.example.springobservable;

import org.springframework.stereotype.Service;

@Service
public class SAPImplementation implements PurchaseOrderServiceCustomerA {
    @Override
    public String getPurchaseOrderByNumber(String purchaseOrderNumber) {
        return "I'm an SAP Implementation";
    }


}
