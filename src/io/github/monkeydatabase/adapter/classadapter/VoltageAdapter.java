package io.github.monkeydatabase.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        //获取到220V电压
        int srcV =output220V();
        return process(srcV);
    }

    //处理方法
    private int process(int srcV){
        System.out.println("使用类适配器适配中");
        int dstV=srcV/44;
        return dstV;
    }
}
