package io.github.monkeydatabase.decorator.coffeestore.beforedesign.plan2;

public abstract class Coffee {
    private Integer milk;
    private Integer soy;
    private Integer chocolate;

    public Coffee(Integer milk, Integer soy, Integer chocolate) {
        this.milk = milk;
        this.soy = soy;
        this.chocolate = chocolate;
    }

    public Integer cost(){
        return milk*10+soy*20+chocolate*30;
    };

    public Integer getMilk() {
        return milk;
    }

    public void setMilk(Integer milk) {
        this.milk = milk;
    }

    public Integer getSoy() {
        return soy;
    }

    public void setSoy(Integer soy) {
        this.soy = soy;
    }

    public Integer getChocolate() {
        return chocolate;
    }

    public void setChocolate(Integer chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "milk=" + milk +
                ", soy=" + soy +
                ", chocolate=" + chocolate +
                '}';
    }
}
