package io.github.monkeydatabase.bridge.phone.improve;

public abstract class Phone {
    //聚合实现部分
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void  open(){
        brand.open();
    }

    protected void close(){
        brand.close();
    }

    protected void call(){
        brand.call();
    }
}
