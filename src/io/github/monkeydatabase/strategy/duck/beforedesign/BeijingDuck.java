package io.github.monkeydatabase.strategy.duck.beforedesign;

public class BeijingDuck extends Duck{
    @Override
    public void display() {
        System.out.println("This is sansui duck");
    }

    //北京鸭不能飞，所以需要重写fly方法
    @Override
    public void fly() {
        System.out.println("What a pity! BeijingDuck can't fly");
    }
}
