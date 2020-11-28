package io.github.monkeydatabase.adapter.classadapter;

public class Player {
    public static void main(String[] args) {
        Switch aSwitch=new Switch();
        System.out.println("-------------适配器模式-------------");
        aSwitch.charging(new VoltageAdapter());
    }
}
