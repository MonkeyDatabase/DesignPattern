package io.github.monkeydatabase.prototype.sampleclonesheep.beforedesign;

/*
假如新增一个属性，看一看不使用原型模式需要修改多少东西
新增产地属性
 */
public class Sheep {


    private String name,color;
    private int age;

    //新增
    private String location;

    //新增
    public String getLocation() {
        return location;
    }

    //新增
    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    /*
    public Sheep(String name, int age,String color) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    */

    public Sheep(String name, int age,String color , String location) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    */

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
