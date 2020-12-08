package io.github.monkeydatabase.visitor.singerevaluation.action;

import io.github.monkeydatabase.visitor.singerevaluation.customer.Man;
import io.github.monkeydatabase.visitor.singerevaluation.customer.Woman;

public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("This man needs more time to think");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("This woman needs more time to think");
    }
}
