package io.github.monkeydatabase.factory.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzaStore {

    public static void main(String[] args) {
        /*
        //创建北京的Pizza
        new BJOrderPizza();

        //创建伦敦的Pizza
        new LDOrderPizza();
         */
        String loc="";
        do {
            loc=PizzaStore.getLocation();
            if (loc.equals("beijing")){
                new BJOrderPizza();
            }else if(loc.equals("london")){
                new LDOrderPizza();
            }
        }while (true);
    }

    //获取要订购Pizza的产地
    public static String getLocation(){
        String str="";
        try {
            BufferedReader strin=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入产地:");
            str=strin.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
