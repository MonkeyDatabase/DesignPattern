package io.github.monkeydatabase.bridge.phone.improve;

public class BBB implements Brand{
    @Override
    public void open() {
        System.out.println("BBB牌手机开机");
    }

    @Override
    public void close() {
        System.out.println("BBB牌手机关机");
    }

    @Override
    public void call() {
        System.out.println("BBB牌手机打电话");
    }
}
