package io.github.monkeydatabase.command.remotecontroller;

import io.github.monkeydatabase.command.remotecontroller.command.Command;
import io.github.monkeydatabase.command.remotecontroller.command.NoCommand;

public class RemoteContorller {
    Command[] onCommands;
    Command[] offCommands;

    //缓存上一个命令，预留给执行撤销功能
    //此处如果是List，可以undo redo
    Command undoCommand;

    public RemoteContorller(){
        //分成五组，每组有一个开按钮和一个关按钮
        onCommands=new Command[5];
        offCommands=new Command[5];

        for (int i=0;i<5;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    //给特定的按钮绑定命令
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no]=onCommand;
        offCommands[no]=offCommand;
    }

    //按下开按钮
    public void onButtonPushed(int no){
        //找到开按钮的组，并执行对应方法
        onCommands[no].execute();
        //将这个命令记录下来，用于撤销
        undoCommand=onCommands[no];
    }

    //按下关按钮
    public void offButtonPushed(int no){
        //找到开按钮的组，并执行对应方法
        offCommands[no].execute();
        //将这个命令记录下来，用于撤销
        undoCommand=offCommands[no];
    }

    //按下撤销按钮
    public void undoButtonPushed(){
        undoCommand.undo();
    }
}
