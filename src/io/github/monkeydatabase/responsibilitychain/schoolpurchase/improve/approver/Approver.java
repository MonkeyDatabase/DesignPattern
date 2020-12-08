package io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.request.PurchaseRequest;

public abstract class Approver {
    public Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void processRequest(PurchaseRequest request);
}
