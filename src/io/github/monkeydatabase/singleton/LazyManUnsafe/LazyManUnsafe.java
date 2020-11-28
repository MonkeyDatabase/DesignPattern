package io.github.monkeydatabase.singleton.LazyManUnsafe;

/*
错误地懒汉式
没有对getInstance()方法进行同步控制，导致非线程安全
 */
public class LazyManUnsafe {
    public static void main(String[] args) {
        for(int i=0;i<30;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton= Singleton.getInstance();
                    System.out.println(singleton.hashCode());
                }
            }).start();
        }
    }
}
class Singleton{
    private Singleton(){}
    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}