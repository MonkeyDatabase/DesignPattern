package io.github.monkeydatabase.singleton.LazyManDoubleCheck;

/*
懒汉式-双重检查
将synchronized关键字作用的范围缩小，只有第一次检查单例对象为null才会进行排队，而且排队结束后再次检查单例对象是否为空，避免多个线程第一次检查为空都进行排队造成线程不安全
将要排队的代码块大小和要排队的线程数减少，性能得到提高
 */
public class LazyManType2 {
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
    //静态变量
    private static volatile Singleton instance;
    //公开获取单例对象的方法
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null)
                    instance=new Singleton();
            }
        }
        return instance;
    }

}
