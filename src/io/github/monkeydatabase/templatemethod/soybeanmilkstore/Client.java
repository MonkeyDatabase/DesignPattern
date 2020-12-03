package io.github.monkeydatabase.templatemethod.soybeanmilkstore;

public class Client {
    public static void main(String[] args) {
        System.out.println("Making red soybean milk");
        SoybeanMilk redSoybeanMilk=new RedSoybeanMilk();
        redSoybeanMilk.make();

        System.out.println("----------------------------");

        System.out.println("Making peanut soybean milk");
        SoybeanMilk peanutSoyMilk=new PeanutSoyMilk();
        peanutSoyMilk.make();
    }
}
