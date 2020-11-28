package io.github.monkeydatabase.decorator.coffeestore.improve;

public class Decorator extends Drink{
    private Drink obj;
    @Override
    public float cost() {
        return super.getPrice()+obj.cost();
    }

    public Decorator(Drink obj) {
        this.obj = obj;
    }

    @Override
    public String getDes() {
        return super.getDes()+"\n"+obj.getDes();
    }
}
