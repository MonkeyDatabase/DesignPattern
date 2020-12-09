package io.github.monkeydatabase.mediator.home.machine;

import io.github.monkeydatabase.mediator.home.mediator.Mediator;

public class Alarm extends Colleague{
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void alarm(){
        System.out.println("Ding~");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
