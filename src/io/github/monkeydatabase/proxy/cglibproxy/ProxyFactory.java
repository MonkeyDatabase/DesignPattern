package io.github.monkeydatabase.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类,即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy started");
        System.out.println("cglib proxy cleared the blackboard");
        System.out.println("cglib proxy is checking wether the  identity of the teacher is Mr.Wang or not(for safety)");
        System.out.println("cglib proxy invited Mr.Wang to the classroom");
        Object returnVal=method.invoke(target,objects);
        System.out.println("cglib proxy clapped his hands");
        System.out.println("cglib proxy finished");
        return returnVal;
    }
}
