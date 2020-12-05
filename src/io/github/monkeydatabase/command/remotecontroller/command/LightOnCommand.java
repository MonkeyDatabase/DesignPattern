package io.github.monkeydatabase.command.remotecontroller.command;

import io.github.monkeydatabase.command.remotecontroller.device.LightReceiver;

public class LightOnCommand implements Command{

    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
