package io.github.monkeydatabase.factory.simplefactory.pizzastore.order;

import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.GreekPizza;
import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
第二家店一开始只订购希腊披萨，不订购芝士披萨
在胡椒披萨推出后，该店将胡椒披萨加入订购候选

本类未改用静态工厂
 */
public class OrderPizza2 {

    /*
    问题:违反了OCP原则，每个OrderPizza类中硬编码了Pizza种类，不同的店铺各自有不同的OrderPizza1、OrderPizza2的类，因为各个店铺的菜单不一样
        一旦制造方新开发一款Pizza，所有的OrderPizza、OrderPizza2、OrderPizza3.。。。都需要修改硬编码
     */
    public OrderPizza2(){
        Pizza pizza=null;
        String orderType;
        do {
            orderType=getType();
            if(orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("greekpizza");
            }
            //新增PepperPizza
            /*
            else if (orderType.equals("pepper")){
                pizza=new PepperPizza();
                pizza.setName("pepperpizza");
            }*/

            else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入Pizza种类:");
            String str=strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
