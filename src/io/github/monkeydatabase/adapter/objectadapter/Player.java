package io.github.monkeydatabase.adapter.objectadapter;

public class Player {
    public static void main(String[] args) {
        IVoltage5V iVoltage5V=new VoltageAdapter(new Voltage220V());
        Switch aSwitch =new Switch();
        aSwitch.charging(iVoltage5V);
    }
}
