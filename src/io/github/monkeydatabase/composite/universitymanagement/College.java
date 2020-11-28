package io.github.monkeydatabase.composite.universitymanagement;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    //聚合Department
    List<OrganizationComponent> organizationComponents=new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void print() {
        System.out.println("-----"+getName()+"-----");
        for (OrganizationComponent organizationComponent:
             organizationComponents) {
            organizationComponent.print();
        }
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }
}
