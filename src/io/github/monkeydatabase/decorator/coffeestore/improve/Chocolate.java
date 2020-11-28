package io.github.monkeydatabase.decorator.coffeestore.improve;

public class Chocolate extends Decorator{
    public Chocolate(Drink obj) {
        super(obj);
        setDes("Chocolate");
        setPrice(3);
    }
}
