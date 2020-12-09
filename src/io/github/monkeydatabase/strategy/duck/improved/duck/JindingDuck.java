package io.github.monkeydatabase.strategy.duck.improved.duck;

import io.github.monkeydatabase.strategy.duck.improved.fly.GoodFlyBehavior;
import io.github.monkeydatabase.strategy.duck.improved.quack.GoodQuackBehavior;

public class JindingDuck extends Duck{
    public JindingDuck() {
        setFlyBehavior(new GoodFlyBehavior());
        setQuackBehavior(new GoodQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("This is JindingDuck");
    }
}
