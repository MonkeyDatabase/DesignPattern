package io.github.monkeydatabase.mediator.home.machine;

import io.github.monkeydatabase.mediator.home.mediator.Mediator;

public class Curtain extends Colleague{
    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    public void upCurtain(){
        System.out.println("Curtain is moving up");
    }

    public void downCurtain(){
        System.out.println("Curtain is moving down");
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }
}
