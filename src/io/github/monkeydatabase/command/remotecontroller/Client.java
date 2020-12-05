package io.github.monkeydatabase.command.remotecontroller;

import io.github.monkeydatabase.command.remotecontroller.command.ComputerOffCommand;
import io.github.monkeydatabase.command.remotecontroller.command.ComputerOnCommand;
import io.github.monkeydatabase.command.remotecontroller.command.LightOffCommand;
import io.github.monkeydatabase.command.remotecontroller.command.LightOnCommand;
import io.github.monkeydatabase.command.remotecontroller.device.ComputerReceiver;
import io.github.monkeydatabase.command.remotecontroller.device.LightReceiver;

public class Client {
    public static void main(String[] args) {
        //创建智能设备
        LightReceiver lightReceiver=new LightReceiver();
        ComputerReceiver computerReceiver=new ComputerReceiver();

        //创建具体命令
        LightOnCommand lightOnCommand=new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand=new LightOffCommand(lightReceiver);
        ComputerOnCommand computerOnCommand=new ComputerOnCommand(computerReceiver);
        ComputerOffCommand computerOffCommand=new ComputerOffCommand(computerReceiver);


        //初始化遥控器
        RemoteContorller remoteContorller=new RemoteContorller();
        remoteContorller.setCommand(0,lightOnCommand,lightOffCommand);
        remoteContorller.setCommand(1,computerOnCommand,computerOffCommand);

        System.out.println("Click the on button on the RemoteContorller for Group0");
        remoteContorller.onButtonPushed(0);

        System.out.println("Click the on button on the RemoteContorller for Group1");
        remoteContorller.onButtonPushed(1);

        System.out.println("Click the off button on the RemoteContorller for Group0");
        remoteContorller.offButtonPushed(0);

        System.out.println("Oh~~~ It's so dark , maybe keep the light on is a better choice");

        System.out.println("Click the cancel button on the RemoteContorller");
        remoteContorller.undoButtonPushed();

    }
}
