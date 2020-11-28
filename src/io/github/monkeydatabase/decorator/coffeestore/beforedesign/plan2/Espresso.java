package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan2;

public class Espresso extends Coffee{
    public Integer espressoPrice=555;

    public Espresso(Integer milk, Integer soy, Integer chocolate) {
        super(milk, soy, chocolate);
    }

    @Override
    public Integer cost() {
        int spicecost=super.cost();
        return spicecost+espressoPrice;
    }

    @Override
    public String toString() {
        return "Espresso"+super.toString();
    }
}
