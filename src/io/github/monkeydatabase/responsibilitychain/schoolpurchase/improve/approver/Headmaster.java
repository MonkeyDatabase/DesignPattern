package io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.request.PurchaseRequest;

public class Headmaster extends Approver{
    public Headmaster(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("id= "+request.getId()+" is processed by "+name);
    }
}
