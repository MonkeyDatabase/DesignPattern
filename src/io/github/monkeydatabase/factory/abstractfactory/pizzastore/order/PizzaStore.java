package io.github.monkeydatabase.factory.abstractfactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {
    public static void main(String[] args) {
        String loc;
        OrderPizza orderPizza=new OrderPizza();
        LDFactory ldFactory=new LDFactory();
        BJFactory bjFactory=new BJFactory();

        do {
            loc=PizzaStore.getLocation();
            if (loc.equals("beijing")){
                orderPizza.setFactory(bjFactory);
            }else if (loc.equals("london")){
                orderPizza.setFactory(ldFactory);
            }
            orderPizza.getPizza();
        }while (true);
    }

    public static String getLocation(){
        try {
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入要订购的Pizza产地:");
            String str=strin.readLine();
            return str;

        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
