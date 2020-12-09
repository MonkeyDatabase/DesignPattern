package io.github.monkeydatabase.strategy.duck.improved.quack;

public class BadQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can't quack");
    }
}
