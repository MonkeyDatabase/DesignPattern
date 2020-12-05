package io.github.monkeydatabase.command.remotecontroller.command;

import io.github.monkeydatabase.command.remotecontroller.device.ComputerReceiver;

public class ComputerOnCommand implements Command{

    ComputerReceiver computer;

    public ComputerOnCommand(ComputerReceiver computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }

    @Override
    public void undo() {
        computer.off();
    }
}
