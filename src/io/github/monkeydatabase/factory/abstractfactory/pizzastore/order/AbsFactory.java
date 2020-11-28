package io.github.monkeydatabase.factory.abstractfactory.pizzastore.order;

import io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza.Pizza;

public interface AbsFactory {

    public  Pizza createPizza(String orderType);

}
