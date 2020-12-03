package io.github.monkeydatabase.templatemethod.hooksoybeanmilkstore;

public class RedSoybeanMilk extends SoybeanMilk {
    @Override
    void addIngredients() {
        System.out.println("Adding tasty red bean into the container");
    }
}
