package io.github.monkeydatabase.factory.factorymethod.pizzastore.pizza;

/*
新增了PepperPizza类，所以所有的OrderPizza、OrderPizza2、OrderPizza3.。。。都需要修改硬编码
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("给北京胡椒披萨准备原材料");
    }
}
