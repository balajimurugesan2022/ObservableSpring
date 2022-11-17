package com.example.springobservable;

import org.springframework.stereotype.Service;

@Service
public class StockOneImplementation implements PurchaseOrderServiceCustomerA {
    @Override
    public String getPurchaseOrderByNumber(String purchaseOrderNumber) {
        return "Im a stock one implementation";
    }
}
