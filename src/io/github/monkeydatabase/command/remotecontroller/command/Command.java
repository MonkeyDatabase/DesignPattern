package io.github.monkeydatabase.command.remotecontroller.command;

public interface Command {
    //do or redo命令
    void execute();

    //undo命令
    void undo();

}
