package io.github.monkeydatabase.factory.simplefactory.pizzastore.order;

import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.CheesePizza;
import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.GreekPizza;
import io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
第一家店会订购所有品类的披萨
所以在推出胡椒披萨后，该类需要修改硬编码的if-else

本例改用了静态工厂
 */
public class OrderPizza1 {

    /*
    问题:违反了OCP原则，每个OrderPizza类中写死了Pizza种类，不同的店铺各自有不同的OrderPizza1、OrderPizza2的类，因为各个店铺的菜单不一样
        一旦制造方新开发一款Pizza，所有的OrderPizza、OrderPizza2、OrderPizza3.。。。都需要修改硬编码
     */
    public OrderPizza1(){
        Pizza pizza=null;
        String orderType;
        do {
            orderType=getType();
            /*
            if(orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("greekpizza");
            }else if (orderType.equals("cheese")){
                pizza=new CheesePizza();
                pizza.setName("cheesepizza");
            }

            //新增PepperPizza

            else if (orderType.equals("pepper")){
                pizza=new PepperPizza();
                pizza.setName("pepperpizza");
            }

            else {
                break;
            }
            */
            pizza = SimpleFactory.createPizza(orderType);
            if (pizza!=null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else
                System.out.println("Pizza订购失败");
        }while (true);
    }

    //为了保证Pizza订购的灵活性，设置一个获取客户希望订购的Pizza类型的函数
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


