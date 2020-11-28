package io.github.monkeydatabase.singleton.HungryMan1;

/*
饿汉式-静态属性
利用classLoader机制，在类加载时完成类的实例化，达到了线程安全的目的
可能造成内存浪费，即还没使用到该类就实例化出单例对象
 */
public class HungryManType1 {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton{
    //把构造方法私有化
    private Singleton(){}

    //静态变量
    public static final Singleton instance =new Singleton();

    //公开静态方法，用于获取单例对象
    public static Singleton getInstance(){
        return instance;
    }
}
