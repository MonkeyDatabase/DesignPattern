package io.github.monkeydatabase.uml.aggregation;

public class Computer {
    private Monitor monitor;
    private Mouse mouse;

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}

/*
聚合关系表示的是整体和部分的关系，整体和部分可以分开
使用空心菱形,由部分指向整体
 */