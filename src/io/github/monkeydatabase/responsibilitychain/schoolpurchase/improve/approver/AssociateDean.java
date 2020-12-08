package io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.request.PurchaseRequest;

public class AssociateDean extends Approver{
    public AssociateDean(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()<=3000){
            System.out.println("id= "+request.getId()+" is processed by "+name);
        }else {
            approver.processRequest(request);
        }
    }
}
