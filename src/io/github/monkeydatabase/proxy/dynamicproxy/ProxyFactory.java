package io.github.monkeydatabase.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象，直接以Object来维护
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成一个代理对象
    public Object getProxyInstance(){

        //ClassLoader指定当前目标对象所使用的类加载器
        //Class<?>[] 目标对象实现的接口类型，使用泛型的方式确认类型
        //Invocationhandler 事件处理，执行目标对象方法时，会触发事件处理器的方法，会把当前执行的目标对象的方法作为参数传入
        //第三个参数以匿名对象的方式传入
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk proxy started");
                        System.out.println("jdk proxy started");
                        System.out.println("jdk proxy cleared the blackboard");
                        System.out.println("jdk proxy is checking wether the  identity of the teacher is Mr.Wang or not(for safety)");
                        System.out.println("jdk proxy invited Mr.Wang to the classroom");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        System.out.println("jdk proxy clapped his hands");
                        System.out.println("jdk proxy finished");
                        return returnVal;
                    }
                });
    }
}
