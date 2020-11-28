package io.github.monkeydatabase.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(){
            @Override
            public void operation1() {
                System.out.println("使用了operation1方法");
            }
        };

        adapter.operation1();
    }
}
