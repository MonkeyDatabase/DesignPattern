package io.github.monkeydatabase.singleton.StaticInnerClass;

/*
静态内部类
与懒汉式、饿汉式不同
单例对象的引用不是单例对象所在的类中声明，而是在它的类的静态内部类中声明
这样在其他原因加载Singleton类时不会自动实例化单例对象
只有在使用该单例对象时，才会触发SingletonInstance类的类加载，依靠静态内部类的classLoader过程保证线程安全
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        for(int i =0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton=Singleton.getInstance();
                    System.out.println(singleton.hashCode());
                }
            }).start();
        }
    }
}

class Singleton{
    //私有化构造方法
    private Singleton(){}

    //静态内部类
    static class SingletonInstance{
        static Singleton instance=new Singleton();
    }

    //公开获取单例对象的方法
    public static Singleton getInstance() {
        return SingletonInstance.instance;
    }
}