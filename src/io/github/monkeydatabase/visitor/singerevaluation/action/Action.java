package io.github.monkeydatabase.visitor.singerevaluation.action;

import io.github.monkeydatabase.visitor.singerevaluation.customer.Man;
import io.github.monkeydatabase.visitor.singerevaluation.customer.Woman;

public abstract class Action {

    public abstract void getManResult(Man man);

    public abstract void getWomanResult(Woman woman);
}
