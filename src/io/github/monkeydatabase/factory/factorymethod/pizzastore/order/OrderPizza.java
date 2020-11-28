package io.github.monkeydatabase.factory.factorymethod.pizzastore.order;

import io.github.monkeydatabase.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //构造器
    public OrderPizza(){
        Pizza pizza=null;
        String orderType="";
            orderType=getType();
            pizza=createPizza(orderType);//抽象方法，由工厂子类实现
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("Pizza订购失败");
            }
    }

    //抽象方法，createPizza，由子类进行实现
    abstract Pizza createPizza(String orderType);

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
