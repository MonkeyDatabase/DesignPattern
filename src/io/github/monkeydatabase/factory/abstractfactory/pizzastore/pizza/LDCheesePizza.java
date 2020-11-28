package io.github.monkeydatabase.factory.abstractfactory.pizzastore.pizza;

public class LDCheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦芝士披萨");
        System.out.println("正在为伦敦芝士披萨准备材料");
    }
}
