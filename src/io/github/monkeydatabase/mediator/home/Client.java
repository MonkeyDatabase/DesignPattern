package io.github.monkeydatabase.mediator.home;

import io.github.monkeydatabase.mediator.home.machine.Alarm;
import io.github.monkeydatabase.mediator.home.machine.CoffeeMachine;
import io.github.monkeydatabase.mediator.home.machine.Curtain;
import io.github.monkeydatabase.mediator.home.machine.TV;
import io.github.monkeydatabase.mediator.home.mediator.ConcreteMediator;
import io.github.monkeydatabase.mediator.home.mediator.Mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        Alarm alarm=new Alarm(mediator,"small alarm");
        CoffeeMachine coffeeMachine=new CoffeeMachine(mediator,"coffee bingo");
        TV tv=new TV(mediator,"4K TV");
        Curtain curtain=new Curtain(mediator,"Perfect curtain");

        alarm.sendMessage(0);
        System.out.println("-------------------");
        alarm.sendMessage(1);
        System.out.println("-------------------");
        coffeeMachine.sendMessage(233);
    }
}
