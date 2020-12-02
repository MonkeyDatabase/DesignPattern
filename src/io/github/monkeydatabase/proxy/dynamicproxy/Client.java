package io.github.monkeydatabase.proxy.dynamicproxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new TeacherDAO());

        //此处注意接收代理对象需要强制转换，否则无法使用Teacher的方法，访问不到
        ITeacherDAO proxyInstance=(ITeacherDAO)proxyFactory.getProxyInstance();
        proxyInstance.teach();

        System.out.println("----------------------------------------");
        //调用该语句时，同样会经历我们定义在调用目标方法之前的额外操作和调用目标方法后的额外操作，因为下面这条语句相当于通过proxyInstance调用target的toString方法
        System.out.println("proxyInstance:"+proxyInstance);
        //该语句打印
        System.out.println("proxyInstance:"+proxyInstance.getClass());
        System.out.println("TeacherDAO:"+new TeacherDAO());
        System.out.println("TeacherDAO:"+new TeacherDAO().getClass());
    }
}
