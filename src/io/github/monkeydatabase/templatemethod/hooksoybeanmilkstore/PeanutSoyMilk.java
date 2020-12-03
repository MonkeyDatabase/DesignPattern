package io.github.monkeydatabase.templatemethod.hooksoybeanmilkstore;

public class PeanutSoyMilk extends SoybeanMilk {
    @Override
    void addIngredients() {
        System.out.println("Adding tasty peanut into the container");
    }
}
