package io.github.monkeydatabase.factory.simplefactory.pizzastore.pizza;

/*
新增了PepperPizza类，所以所有的OrderPizza、OrderPizza2、OrderPizza3.。。。都需要修改硬编码
 */
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("胡椒披萨");
        System.out.println("给胡椒披萨准备原材料");
    }
}
