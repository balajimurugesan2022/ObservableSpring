package com.example.springobservable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PurchaseOrderController {

    @Autowired
    ObservableService observableService;

    @GetMapping("/purchaseorderbynumber")
    public String purchaseOrderByDocumentNumber(){
        String alias = "StockOneImplementationForCustomerC";
        PurchaseOrderServiceCustomerA purchaseOrderServiceCustomerAImplementation = (PurchaseOrderServiceCustomerA) observableService.findImplementations(alias).findFirst().orElse(null);
        return purchaseOrderServiceCustomerAImplementation.getPurchaseOrderByNumber("input");

    }
    @GetMapping("/purchaseorderbyrating")
    public String purchaseOrderByDate(){
        String alias = "OracleImplementationForCustomerB";
        PurchaseOrderServiceCustomerB purchaseOrderServiceCustomerBImplementation = (PurchaseOrderServiceCustomerB) observableService.findImplementations(alias).findFirst().orElse(null);
        return purchaseOrderServiceCustomerBImplementation.getPurchaseOrdersByRating(5);

    }
}
