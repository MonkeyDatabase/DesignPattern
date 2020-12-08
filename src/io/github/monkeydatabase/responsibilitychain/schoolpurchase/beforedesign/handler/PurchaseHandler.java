package io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.handler;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.AssociateDean;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.Counselor;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.Dean;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.Headmaster;

public class PurchaseHandler {
    public Counselor counselor;
    public AssociateDean associateDean;
    public Dean dean;
    public Headmaster headmaster;

    public PurchaseHandler(Counselor counselor, AssociateDean associateDean, Dean dean, Headmaster headmaster) {
        this.counselor = counselor;
        this.associateDean = associateDean;
        this.dean = dean;
        this.headmaster = headmaster;
    }

    public void handle(int cost){
        if (cost>0&&cost<=1000){
            counselor.handle(cost);
        }else if (cost<=3000){
            associateDean.handle(cost);
        }else if (cost<=10000){
            dean.handle(cost);
        }else {
            headmaster.handle(cost);
        }
    }
}
