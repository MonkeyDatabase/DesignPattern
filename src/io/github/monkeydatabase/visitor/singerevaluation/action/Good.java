package io.github.monkeydatabase.visitor.singerevaluation.action;

import io.github.monkeydatabase.visitor.singerevaluation.customer.Man;
import io.github.monkeydatabase.visitor.singerevaluation.customer.Woman;

public class Good extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("This man thinks it's good");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("This woman thinks it's good");
    }
}
