package io.github.monkeydatabase.visitor.singerevaluation.customer;

import io.github.monkeydatabase.visitor.singerevaluation.action.Action;

public class Man extends Customer{
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}
