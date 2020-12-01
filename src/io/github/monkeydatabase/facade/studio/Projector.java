package io.github.monkeydatabase.facade.studio;

public class Projector {
    private static Projector projector=new Projector();

    public static Projector getInstance(){
        return projector;
    }

    public void on(){
        System.out.println("Projector 已启动");
    }

    public void off(){
        System.out.println("Projector 已关机");
    }

    public void focus(){
        System.out.println("Projector focus on the screen");
    }
}
