package io.github.monkeydatabase.proxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDAO target=new TeacherDAO();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        TeacherDAO proxyInstance = (TeacherDAO) proxyFactory.getProxyInstance();
        proxyInstance.teach();

    }
}
