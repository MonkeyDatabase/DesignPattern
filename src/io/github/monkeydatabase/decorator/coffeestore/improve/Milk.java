package io.github.monkeydatabase.decorator.coffeestore.improve;

public class Milk extends Decorator{
    public Milk(Drink obj) {
        super(obj);
        setDes("Milk");
        setPrice(1);
    }
}
