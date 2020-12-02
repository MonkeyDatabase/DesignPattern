package io.github.monkeydatabase.proxy.staticproxy;

public class TeacherDAO implements  ITeacherDAO{
    @Override
    public void teach() {
        System.out.println("Mr.Wang is teaching");
    }
}
