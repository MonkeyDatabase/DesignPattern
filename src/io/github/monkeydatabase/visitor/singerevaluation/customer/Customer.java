package io.github.monkeydatabase.visitor.singerevaluation.customer;

import io.github.monkeydatabase.visitor.singerevaluation.action.Action;

public abstract class Customer {
    public abstract void accept(Action action);
}
