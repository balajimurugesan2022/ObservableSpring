package com.example.springobservable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

@Service
public class ObservableService {

    private Map<String,PurchaseOrderServiceCustomerA> customerAMap;
    public Map<String,PurchaseOrderServiceCustomerB> customerBMap;

    @Autowired
    public ObservableService(SAPImplementation sapImplementation, OracleImplementation oracleImplementation, StockOneImplementation stockOneImplementation){
        customerAMap = new HashMap<>();
        customerBMap = new HashMap<>();
        customerAMap.put("SAPImplementationForCustomerA",sapImplementation);
        customerBMap.put("OracleImplementationForCustomerB",oracleImplementation);
        customerAMap.put("StockOneImplementationForCustomerC",stockOneImplementation);
    }

    public Stream<Object> findImplementations(String serviceName){

        Stream<Object>  myObject = null;
      if(customerAMap.get(serviceName) != null){
          return Stream.of(customerAMap.get(serviceName));
      }
      if(customerBMap.get(serviceName) != null){
            return Stream.of(customerBMap.get(serviceName));
      }

        return null;
    }

}
