package io.github.monkeydatabase.mediator.home.machine;

import io.github.monkeydatabase.mediator.home.mediator.Mediator;

public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void startCoffee(){
        System.out.println("CoffeeMachine has started");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
