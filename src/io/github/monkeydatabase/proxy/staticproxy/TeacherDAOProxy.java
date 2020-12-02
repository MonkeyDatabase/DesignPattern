package io.github.monkeydatabase.proxy.staticproxy;

public class TeacherDAOProxy implements ITeacherDAO{
    private ITeacherDAO target;

    public TeacherDAOProxy(ITeacherDAO target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy started");
        System.out.println("proxy cleared the blackboard");
        System.out.println("proxy is checking wether the  identity of the teacher is Mr.Wang or not(for safety)");
        System.out.println("proxy invited Mr.Wang to the classroom");
        target.teach();
        System.out.println("proxy clapped his hands");
        System.out.println("proxy finished");
    }

}
