package io.github.monkeydatabase.mediator.home.mediator;

import io.github.monkeydatabase.mediator.home.machine.Colleague;

public abstract class Mediator {

    public abstract void register(String name, Colleague colleague);

    public abstract void getMessage(int stateChange,String name);

    public abstract void sendMessage();
}
