package io.github.monkeydatabase.facade.studio;

public class Popcorn {
    private static Popcorn popcorn=new Popcorn();

    public static Popcorn getInstance(){
        return popcorn;
    }

    public void on(){
        System.out.println("Popcorn on");
    }

    public void off(){
        System.out.println("Popcorn off");
    }

    public void pop(){
        System.out.println("Popcorn is poping");
    }
}
