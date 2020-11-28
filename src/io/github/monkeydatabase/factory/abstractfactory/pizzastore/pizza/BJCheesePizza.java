package io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京芝士披萨");
        System.out.println("正在为北京芝士披萨准备材料");
    }
}
