package io.github.monkeydatabase.adapter.objectadapter;

public class VoltageAdapter implements IVoltage5V{
    private Voltage220V voltage220V=null;
    @Override
    public int output5V() {
        return process();
    }

    private int process(){
        int srcV=voltage220V.output220V();
        System.out.println("使用对象适配器模式进行适配中");
        int desV=srcV/44;
        return desV;
    }

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public void setVoltage220V(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }
}
