package io.github.monkeydatabase.strategy.duck.improved;

import io.github.monkeydatabase.strategy.duck.improved.duck.BeijingDuck;
import io.github.monkeydatabase.strategy.duck.improved.duck.Duck;
import io.github.monkeydatabase.strategy.duck.improved.duck.RubberDuck;
import io.github.monkeydatabase.strategy.duck.improved.fly.GoodFlyBehavior;

public class Client {
    public static void main(String[] args) {
        Duck duck=new BeijingDuck();
        duck.display();
        duck.fly();
        duck.quack();
        System.out.println("BeijingDuck is trained to fly");
        duck.setFlyBehavior(new GoodFlyBehavior());
        duck.fly();

        Duck duck1=new RubberDuck();
        duck1.display();
        duck1.fly();
        duck1.quack();
    }
}

