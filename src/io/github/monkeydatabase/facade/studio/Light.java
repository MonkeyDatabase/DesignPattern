package io.github.monkeydatabase.facade.studio;

public class Light {
    private static Light light=new Light();

    public static Light getInstance(){
        return light;
    }

    public void on(){
        System.out.println("Light 已启动");
    }

    public void off(){
        System.out.println("Light 已关机");
    }

    public void brighter(){
        System.out.println("Light brighter");
    }

    public void darker(){
        System.out.println("Light darker");
    }
}
