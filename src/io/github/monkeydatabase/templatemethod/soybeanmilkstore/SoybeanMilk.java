package io.github.monkeydatabase.templatemethod.soybeanmilkstore;

public abstract class SoybeanMilk {
    //模板方法通过final关键字来禁止子类重写
    final void make(){
        select();
        addIngredients();
        soak();
        breaker();
    }

    void select(){
        System.out.println("Choosing fresh soybean");
    }

    //由于不同口味的豆浆需要添加不同的配料，该步骤设为抽象方法，交由子类实现
    abstract void addIngredients();

    void soak(){
        System.out.println("Soaking fresh soybean and ingredients for 30 minutes");
    }

    void breaker(){
        System.out.println("Breaking these materials");
    }
}
