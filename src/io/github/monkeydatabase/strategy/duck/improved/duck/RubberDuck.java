package io.github.monkeydatabase.strategy.duck.improved.duck;

import io.github.monkeydatabase.strategy.duck.improved.fly.BadFlyBehavior;
import io.github.monkeydatabase.strategy.duck.improved.quack.BadQuackBehavior;

public class RubberDuck extends Duck{
    public RubberDuck() {
        setFlyBehavior(new BadFlyBehavior());
        setQuackBehavior(new BadQuackBehavior());
    }

    @Override
    public void display() {
        System.out.println("This is a RubberDuck");
    }
}
