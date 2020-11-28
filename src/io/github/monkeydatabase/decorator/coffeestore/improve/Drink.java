package io.github.monkeydatabase.decorator.coffeestore.improve;

public abstract class Drink {
    private String des;
    private float price=0.0f;

    public String getDes() {
        return des+" "+price+"yuan";
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //该方法由子类自行实现
    public abstract float cost();
}
