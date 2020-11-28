package io.github.monkeydatabase.adapter.classadapter;

public class Switch {

    //充电方法
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V()==5){
            System.out.println("电压为5G，可以充电");
        }else{
            System.out.println("电压不正确，不允许充电!");
        }

    }
}
