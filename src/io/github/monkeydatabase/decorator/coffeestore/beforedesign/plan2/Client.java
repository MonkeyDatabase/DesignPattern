package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan2;

public class Client {
    public static void main(String[] args) {
        Coffee coffee=new Espresso(1,1,1);
        System.out.println(coffee.toString()+" price: "+coffee.cost());

        Coffee coffee1=new ShortBlack(1,6,1);
        System.out.println(coffee1.toString()+" price: "+coffee1.cost());

        Coffee coffee2=new LongBlack(1,8,1);
        System.out.println(coffee2.toString()+" price: "+coffee2.cost());

        Coffee coffee3=new Decaf(1,9,1);
        System.out.println(coffee3.toString()+" price: "+coffee3.cost());
    }
}
