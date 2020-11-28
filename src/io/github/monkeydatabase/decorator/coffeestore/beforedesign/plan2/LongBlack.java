package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan2;

public class LongBlack extends Coffee{
    public Integer longBlackPrice=666;

    public LongBlack(Integer milk, Integer soy, Integer chocolate) {
        super(milk, soy, chocolate);
    }

    @Override
    public Integer cost() {
        int spicecost=super.cost();
        return spicecost+longBlackPrice;
    }

    @Override
    public String toString() {
        return "LongBlack"+super.toString();
    }
}
