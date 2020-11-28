package io.github.monkeydatabase.factory.simplefactory.pizzastore.order;

import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.CheesePizza;
import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.GreekPizza;
import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.PepperPizza;
import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {

    public static Pizza createPizza(String orderType){
        System.out.println("使用静态工厂创建ing");
        Pizza pizza=null;
        if(orderType.equals("greek")){
            pizza=new GreekPizza();
        }else if (orderType.equals("cheese")){
            pizza=new CheesePizza();
        }else if (orderType.equals("pepper")){
            pizza=new PepperPizza();
        }
        return pizza;
    }
}
