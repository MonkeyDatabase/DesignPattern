package io.github.monkeydatabase.factory.abstractfactory.pizzastore.order;

import io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
    private AbsFactory factory;

    public OrderPizza(){

    }
    public OrderPizza(AbsFactory factory){
        this.factory=factory;
    }

    public void setFactory(AbsFactory factory){
        this.factory=factory;
    }

    public Pizza getPizza(){
        String orderType;
        orderType=getType();
        Pizza pizza = factory.createPizza(orderType);
        if (pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else {
            System.out.println("Pizza订购失败");
        }
        return pizza;
    }

    public String getType(){
        try {
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入要订购的Pizza类型:");
            String str=strin.readLine();
            return str;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
