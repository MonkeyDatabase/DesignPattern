package io.github.monkeydatabase.strategy.duck.improved.duck;

import io.github.monkeydatabase.strategy.duck.improved.fly.BadFlyBehavior;
import io.github.monkeydatabase.strategy.duck.improved.fly.FlyBehavior;
import io.github.monkeydatabase.strategy.duck.improved.quack.GoodQuackBehavior;
import io.github.monkeydatabase.strategy.duck.improved.quack.QuackBehavior;

public class BeijingDuck extends Duck{
    public BeijingDuck() {
        setFlyBehavior(new BadFlyBehavior());
        setQuackBehavior(new GoodQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("This is BeijingDuck");
    }
}
