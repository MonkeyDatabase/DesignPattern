package io.github.monkeydatabase.bridge.phone.improve;

public class AAA implements Brand{
    @Override
    public void open() {
        System.out.println("AAA牌手机开机");
    }

    @Override
    public void close() {
        System.out.println("AAA牌手机关机");
    }

    @Override
    public void call() {
        System.out.println("AAA牌手机打电话");
    }
}
