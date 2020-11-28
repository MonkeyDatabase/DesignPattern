package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan2;

public class Decaf extends Coffee{
    public Integer decafPrice=1200;

    public Decaf(Integer milk, Integer soy, Integer chocolate) {
        super(milk, soy, chocolate);
    }

    @Override
    public Integer cost() {
        int spicecost=super.cost();
        return spicecost+decafPrice;
    }

    @Override
    public String toString() {
        return "Decaf"+super.toString();
    }
}
