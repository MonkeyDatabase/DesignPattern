package io.github.monkeydatabase.factory.abstractfactory.pizzastore.order;

import io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza.Pizza;

public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("cheese")){
            pizza=new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new BJPepperPizza();
        }
        return pizza;
    }
}
