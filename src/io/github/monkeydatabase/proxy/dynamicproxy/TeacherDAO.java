package io.github.monkeydatabase.proxy.dynamicproxy;

public class TeacherDAO implements ITeacherDAO {
    @Override
    public void teach() {
        System.out.println("Mr.Wang is teaching");
    }
}
