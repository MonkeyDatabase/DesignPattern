package io.github.monkeydatabase.prototype.sampleclonesheep.beforedesign;

/*
不适用原型模式
所有拷贝的行数都需要重复添加新的属性
 */
public class Client {
    public static void main(String[] args) {
        /*
        Sheep sheep=new Sheep("tom",1,"白色");
         */
        Sheep sheep=new Sheep("tom",1,"白色","beijing");

        /*
        传统clone羊办法
         */
        /*
        Sheep sheep1=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep2=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep3=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep4=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
        Sheep sheep5=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
         */

        /*
        新增属性之后
         */
        Sheep sheep1=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor(),sheep.getLocation());
        Sheep sheep2=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor(),sheep.getLocation());
        Sheep sheep3=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor(), sheep.getLocation());
        Sheep sheep4=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor(),sheep.getLocation());
        Sheep sheep5=new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor(),sheep.getLocation());

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
    }
}
