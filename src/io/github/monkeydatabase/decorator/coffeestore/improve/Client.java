package io.github.monkeydatabase.decorator.coffeestore.improve;

public class Client {
    public static void main(String[] args) {
        Drink drink=new Milk(new Chocolate(new Soy(new Espresso())));
        System.out.println(drink.getDes()+"\nTotal: "+drink.cost()+"yuan");

        System.out.println("------------------------------");

        Drink order=new LongBlack();
        order=new Soy(order);
        order=new Chocolate(order);
        System.out.println(order.getDes()+"\nTotal: "+order.cost()+"yuan");
    }
}
