package io.github.monkeydatabase.factory.factorymethod.pizzastore.pizza;

public abstract class Pizza {
    protected String name;

    //不同Pizza原材料不一样，所以作为抽象方法，其实现延迟到子类中
    public abstract void prepare();

    public void bake(){
        System.out.println("baking "+name);
    }

    public void cut(){
        System.out.println("cutting "+name);
    }

    public void box(){
        System.out.println("boxing "+name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
