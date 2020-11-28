package io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        setName("希腊披萨");
        System.out.println("正在为希腊披萨准备材料");
    }
}
