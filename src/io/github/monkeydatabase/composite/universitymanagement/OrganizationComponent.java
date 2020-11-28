package io.github.monkeydatabase.composite.universitymanagement;

public abstract class OrganizationComponent {
    private String name;
    private String des;

    protected void add(OrganizationComponent organizationComponent){
        //默认实现，不采用抽象方法
        //如果采用抽象方法，所以继承自OrganizationComponent的类都需要重写add方法，但是所有叶子节点不需要该方法
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //叶子节点和非叶子节点都需要的方法
    public abstract void print();
}
