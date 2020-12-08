package io.github.monkeydatabase.visitor.singerevaluation.customer;

import io.github.monkeydatabase.visitor.singerevaluation.action.Action;

/*
1. 使用了双分派
   * 即首先在客户端程序中将具体状态作为参数传递到Woman
   * Woman类调用作为参数的“具体方法”中的方法，同时将自己作为参数传给了之前传过来的状态中的方法
 */
public class Woman extends Customer{
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
