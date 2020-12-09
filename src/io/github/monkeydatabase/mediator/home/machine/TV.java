package io.github.monkeydatabase.mediator.home.machine;

import io.github.monkeydatabase.mediator.home.mediator.Mediator;

public class TV extends Colleague{
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void startTV(){
        System.out.println("TV has started");
    }

    public void shutdownTV(){
        System.out.println("TV has stoped");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
