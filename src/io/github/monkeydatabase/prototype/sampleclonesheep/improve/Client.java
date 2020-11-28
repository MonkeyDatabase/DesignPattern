package io.github.monkeydatabase.prototype.sampleclonesheep.improve;

/*
使用原型模式后，使用方只需要修改一行
 */
public class Client {

    public static void main(String[] args) {
        /*
        修改
        Sheep sheep=new Sheep("tom",1,"白色");
        */
        Sheep sheep=new Sheep("tom",1,"白色","beijing");

        Sheep sheep1=(Sheep)sheep.clone();
        Sheep sheep2=(Sheep)sheep.clone();
        Sheep sheep3=(Sheep)sheep.clone();
        Sheep sheep4=(Sheep)sheep.clone();

        System.out.println("sheep1:"+sheep1);
        System.out.println("sheep2:"+sheep2);
        System.out.println("sheep3:"+sheep3);
        System.out.println("sheep4:"+sheep4);
    }
}
