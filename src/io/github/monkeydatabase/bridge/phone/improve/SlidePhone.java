package io.github.monkeydatabase.bridge.phone.improve;

public class SlidePhone extends Phone{

    public SlidePhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("目前使用的手机样式为滑盖手机");
    }

    public void close(){
        super.close();
        System.out.println("目前使用的手机样式为滑盖手机");
    }

    public void call(){
        super.call();
        System.out.println("目前使用的手机样式为滑盖手机");
    }
}
