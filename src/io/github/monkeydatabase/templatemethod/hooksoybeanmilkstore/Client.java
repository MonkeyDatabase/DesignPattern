package io.github.monkeydatabase.templatemethod.hooksoybeanmilkstore;

public class Client {
    public static void main(String[] args) {
        System.out.println("Making red soybean milk");
        SoybeanMilk redSoybeanMilk=new RedSoybeanMilk();
        redSoybeanMilk.make();

        System.out.println("----------------------------");

        System.out.println("Making peanut soybean milk");
        SoybeanMilk peanutSoyMilk=new PeanutSoyMilk();
        peanutSoyMilk.make();

        System.out.println("----------------------------");

        System.out.println("Making pure soybean milk");
        SoybeanMilk pureSoyMilk=new PureSoyMilk();
        pureSoyMilk.make();
    }
}
