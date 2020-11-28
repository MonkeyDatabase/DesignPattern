package io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("芝士披萨");
        System.out.println("正在为芝士披萨准备材料");
    }
}
