package io.github.monkeydatabase.composite.universitymanagement;

public class Department extends OrganizationComponent{
    //叶子节点，不需要聚合其它对象

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println(getDes());
    }
}
