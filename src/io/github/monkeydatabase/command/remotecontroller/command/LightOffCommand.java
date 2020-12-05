package io.github.monkeydatabase.command.remotecontroller.command;

import io.github.monkeydatabase.command.remotecontroller.device.LightReceiver;

public class LightOffCommand implements Command{

    LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
