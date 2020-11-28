package io.github.monkeydatabase.singleton.Enum;

public class EnumType {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Singleton singleton=Singleton.INSTANCE;
                    singleton.getInfo();
                }
            }).start();
        }
    }
}

enum Singleton{
    INSTANCE;
    private int id=0;

    synchronized void getInfo(){
        this.id++;
        System.out.println(id+"被运行咯~");
    }
}
