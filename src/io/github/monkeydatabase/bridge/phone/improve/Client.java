package io.github.monkeydatabase.bridge.phone.improve;

public class Client {
    public static void main(String[] args) {
        //AAA品牌
        Brand aaa=new AAA();
        //滑盖手机 且为AAA品牌
        Phone phone=new SlidePhone(aaa);

        phone.open();
        phone.call();
        phone.close();

        System.out.println("-------------------");

        //BBB品牌
        Brand bbb=new BBB();
        //滑盖手机 且为AAA品牌
        Phone phone1=new SlidePhone(bbb);

        phone1.open();
        phone1.call();
        phone1.close();

        System.out.println("-------------------");

        //BBB品牌
        Brand bbb1=new BBB();
        //滑盖手机 且为AAA品牌
        Phone phone2=new SlidePhone(bbb1);

        phone2.open();
        phone2.call();
        phone2.close();

    }
}
