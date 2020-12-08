package io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.request.PurchaseRequest;

public class Dean extends Approver{
    public Dean(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()<=10000){
            System.out.println("id= "+request.getId()+" is processed by "+name);
        }else {
            approver.processRequest(request);
        }
    }
}
