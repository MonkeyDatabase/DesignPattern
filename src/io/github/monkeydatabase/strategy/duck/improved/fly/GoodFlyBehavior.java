package io.github.monkeydatabase.strategy.duck.improved.fly;

public class GoodFlyBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("flies highest");
    }
}
