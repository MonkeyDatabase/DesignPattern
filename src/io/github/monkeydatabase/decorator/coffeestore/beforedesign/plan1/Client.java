package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan1;

public class Client {
    public static void main(String[] args) {
        Coffee coffee=new Espresso_Milk();
        System.out.println("the cost of Espresso with milk is "+coffee.getCost());

        Coffee coffee1=new Decaf();
        System.out.println("the cost of Decat is "+coffee1.getCost());
    }
}
