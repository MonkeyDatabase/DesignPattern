package io.github.monkeydatabase.prototype.shallowcopy;

public class Client {
    public static void main(String[] args) {
        Sheep friend=new Sheep("tom",1,"white",null);
        Sheep sheep=new Sheep("tom",1,"white",friend);

        Sheep sheep1=sheep.clone();
        Sheep sheep2=sheep.clone();
        Sheep sheep3=sheep.clone();
        Sheep sheep4=sheep.clone();

        System.out.println("sheep.hashcode:"+sheep.hashCode());
        System.out.println("sheep1.hashcode:"+sheep1.hashCode());
        System.out.println("sheep2.hashcode:"+sheep2.hashCode());
        System.out.println("sheep3.hashcode:"+sheep3.hashCode());
        System.out.println("sheep4.hashcode:"+sheep4.hashCode());

        System.out.println("-------------------------------------");

        System.out.println(sheep+" name.hashcode:"+ sheep.getName().hashCode()+" friend.hashcode:"+sheep.getFriend().hashCode());
        System.out.println(sheep1+" name.hashcode:"+ sheep1.getName().hashCode()+" friend.hashcode:"+sheep1.getFriend().hashCode());
        System.out.println(sheep2+" name.hashcode:"+ sheep2.getName().hashCode()+" friend.hashcode:"+sheep2.getFriend().hashCode());
        System.out.println(sheep3+" name.hashcode:"+ sheep3.getName().hashCode()+" friend.hashcode:"+sheep3.getFriend().hashCode());
        System.out.println(sheep4+" name.hashcode:"+ sheep4.getName().hashCode()+" friend.hashcode:"+sheep4.getFriend().hashCode());
    }

}
