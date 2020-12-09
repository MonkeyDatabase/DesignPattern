package io.github.monkeydatabase.strategy.duck.beforedesign;

public abstract class Duck {

    public Duck() {
    }

    //显示Duck的详情
    public abstract void display();

    public void quack(){
        System.out.println("Quack~ Quack~ Quack~");
    }

    public void swim(){
        System.out.println("Swimming~~~~~~");
    }

    public void fly(){
        System.out.println("Flying up up up");
    }
}
