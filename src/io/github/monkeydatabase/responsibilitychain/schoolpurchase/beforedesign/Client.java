package io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign;

import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.AssociateDean;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.Counselor;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.Dean;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.approver.Headmaster;
import io.github.monkeydatabase.responsibilitychain.schoolpurchase.beforedesign.handler.PurchaseHandler;

public class Client {
    public static void main(String[] args) {
        PurchaseHandler handler=new PurchaseHandler(new Counselor(),new AssociateDean(),new Dean(),new Headmaster());
        handler.handle(55);
        handler.handle(2333);
        handler.handle(6666);
        handler.handle(19999999);

    }
}
