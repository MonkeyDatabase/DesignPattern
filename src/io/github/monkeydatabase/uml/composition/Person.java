package io.github.monkeydatabase.uml.composition;

public class Person {
    //Aggregation
    IDCard idCard;

    //Composition
    Head head=new Head();
    Body body=new Body();
}

/*
人与身份证是一对一的，但是身份证丢了可以补办，所以是聚合
人与每个器官的是一对一的，且整体和部分是不可分割的，所以使用组合
 */
