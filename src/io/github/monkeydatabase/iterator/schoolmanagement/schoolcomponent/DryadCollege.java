package io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent;

import io.github.monkeydatabase.iterator.schoolmanagement.iterator.DryadCollegeIterator;

import java.util.Iterator;

public class DryadCollege implements College{
    private String name;
    private Deparment[] deparments;
    private int departmentCount=0;
    private DryadCollegeIterator dryadCollegeIterator;

    public DryadCollege(String name) {
        this.name = name;
        this.deparments = new Deparment[5];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDepartment(String name, String des) {
        Deparment deparment=new Deparment(name,des);
        deparments[departmentCount]=deparment;
        departmentCount+=1;
    }

    @Override
    public Iterator createIterator() {
        return new DryadCollegeIterator(deparments);
    }
}
