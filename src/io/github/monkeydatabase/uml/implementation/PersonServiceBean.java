package io.github.monkeydatabase.uml.implementation;

public class PersonServiceBean implements PersonService{
    @Override
    public void delete(Integer id) {
        System.out.println("deleting..............");
    }
}

/*
实现关系是一种特殊的依赖关系
一个空心箭头，由类指向接口
 */