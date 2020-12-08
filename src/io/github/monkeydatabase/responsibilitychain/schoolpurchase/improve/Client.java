package io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver.AssociateDean;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver.Counselor;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver.Dean;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.approver.Headmaster;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.improve.request.PurchaseRequest;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request=new PurchaseRequest(1,0,102323);
        Counselor counselor=new Counselor("Coun.Zhao");
        AssociateDean associateDean=new AssociateDean("AD.Qian");
        Dean dean=new Dean("D.Sun");
        Headmaster headmaster=new Headmaster("H.Li");
        counselor.setApprover(associateDean);
        associateDean.setApprover(dean);
        dean.setApprover(headmaster);

        for (int i=0;i<10;i++){
            counselor.processRequest(new PurchaseRequest(i,0, new Random().nextInt(15000)));
        }
    }
}
