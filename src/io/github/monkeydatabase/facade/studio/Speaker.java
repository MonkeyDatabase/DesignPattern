package io.github.monkeydatabase.facade.studio;

public class Speaker {
    private static Speaker speaker=new Speaker();

    public static Speaker getInstance(){
        return speaker;
    }

    public void on(){
        System.out.println("Speaker 已启动");
    }

    public void off(){
        System.out.println("Speaker 已关机");
    }

    public void up(){
        System.out.println("Speaker louder");
    }

    public void down(){
        System.out.println("Speaker quieter");
    }
}
