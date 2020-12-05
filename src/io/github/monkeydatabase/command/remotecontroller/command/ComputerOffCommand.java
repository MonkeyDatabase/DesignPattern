package io.github.monkeydatabase.command.remotecontroller.command;

import io.github.monkeydatabase.command.remotecontroller.device.ComputerReceiver;

public class ComputerOffCommand implements Command{

    ComputerReceiver computer;

    public ComputerOffCommand(ComputerReceiver computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.off();
    }

    @Override
    public void undo() {
        computer.on();
    }
}
