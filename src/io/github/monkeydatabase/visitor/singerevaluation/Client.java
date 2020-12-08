package io.github.monkeydatabase.visitor.singerevaluation;

import io.github.monkeydatabase.visitor.singerevaluation.action.Bad;
import io.github.monkeydatabase.visitor.singerevaluation.action.Good;
import io.github.monkeydatabase.visitor.singerevaluation.customer.Man;
import io.github.monkeydatabase.visitor.singerevaluation.customer.Woman;

public class Client {
    public static void main(String[] args) {
        Customers customers=new Customers();

        customers.attach(new Man());
        customers.attach(new Man());
        customers.attach(new Woman());
        customers.attach(new Woman());
        customers.attach(new Man());
        customers.attach(new Man());


        Good good=new Good();
        customers.display(good);

        System.out.println("-------------------------");

        Bad bad=new Bad();
        customers.display(bad);
    }
}
