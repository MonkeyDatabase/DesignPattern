package io.github.monkeydatabase.singleton.HungryMan2;

/*
饿汉式-静态代码块
利用classLoader机制，在类加载时完成类的实例化，达到了线程安全的目的
可能造成内存浪费，即还没使用到该类就实例化出单例对象
 */
public class HungryManType2 {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}

class Singleton{
    //私有化构造方法
    private Singleton(){}

    //私有变量
    private static Singleton instance;

    //静态代码块创建对象
    static {
        instance=new Singleton();
    }

    //公开获取单例对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}
