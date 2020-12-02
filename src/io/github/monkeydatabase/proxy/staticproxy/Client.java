package io.github.monkeydatabase.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
        TeacherDAOProxy proxy=new TeacherDAOProxy(new TeacherDAO());
        proxy.teach();
    }
}
