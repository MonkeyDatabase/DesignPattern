package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan2;

public class ShortBlack extends Coffee{
    public Integer shortblackPrice=233;

    public ShortBlack(Integer milk, Integer soy, Integer chocolate) {
        super(milk, soy, chocolate);
    }

    @Override
    public Integer cost() {
        int spicecost=super.cost();
        return spicecost+shortblackPrice;
    }

    @Override
    public String toString() {
        return "ShortBlack"+super.toString();
    }
}
