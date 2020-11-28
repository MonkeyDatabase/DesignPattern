package io.github.monkeydatabase.singleton.LazyManSlow;

/*
饿汉式-普通
对getInstance()整个方法加上Synchronized关键字，无论instance是否为空都需要排队等待其他对象离开临界区
进入函数执行后才判断单例对象是否为空，当非空时排队时间相当于白白浪费
性能较差
 */
public class LazyManType1 {
    public static void main(String[] args) {
        for(int i=0;i<30;i++){
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

    //静态属性
    private static Singleton instance;

    //公开获取单例对象的方法
    public synchronized static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
