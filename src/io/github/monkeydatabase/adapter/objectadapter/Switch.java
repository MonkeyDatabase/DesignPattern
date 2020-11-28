package io.github.monkeydatabase.adapter.objectadapter;

public class Switch {
    public void charging(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V()==5){
            System.out.println("电压为5V，正在充电~~~");
        }else{
            System.out.println("电压不正确，禁止充电!");
        }
    }
}
