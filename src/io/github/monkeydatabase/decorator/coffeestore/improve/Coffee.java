package io.github.monkeydatabase.decorator.coffeestore.improve;

public class Coffee extends Drink {

    //对于单品不加调料的coffee,它的cost方法就是返回它本身的价格即price
    @Override
    public float cost() {
        return super.getPrice();
    }
}
