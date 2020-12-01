package io.github.monkeydatabase.facade.studio;

public class DVDPlayer {
    private static DVDPlayer instance=new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD 已启动");
    }

    public void off(){
        System.out.println("DVD 已关机");
    }

    public void play(){
        System.out.println("DVD 正在播放影片");
    }

    public void pause(){
        System.out.println("DVD 已暂停");
    }
}
