package io.github.monkeydatabase.strategy.duck.improved.duck;

import io.github.monkeydatabase.strategy.duck.improved.fly.FlyBehavior;
import io.github.monkeydatabase.strategy.duck.improved.quack.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    public void quack(){
        if(quackBehavior!=null)
            quackBehavior.quack();
    }

    public void fly(){
        if (flyBehavior!=null)
            flyBehavior.fly();
    }
}
