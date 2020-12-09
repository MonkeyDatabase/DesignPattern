package io.github.monkeydatabase.strategy.duck.improved.fly;

public class BadFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("can't fly anymore");
    }
}
