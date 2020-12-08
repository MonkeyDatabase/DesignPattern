package io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent;

import io.github.monkeydatabase.iterator.schoolmanagement.iterator.DryadCollegeIterator;
import io.github.monkeydatabase.iterator.schoolmanagement.iterator.NecromancerCollegeIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NecromancerCollege implements College{
    private String name;
    private List<Deparment> deparments;
    private int departmentCount=0;
    private DryadCollegeIterator dryadCollegeIterator;

    public NecromancerCollege(String name) {
        this.name = name;
        this.deparments = new LinkedList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addDepartment(String name, String des) {
        Deparment deparment=new Deparment(name,des);
        deparments.add(deparment);
        departmentCount+=1;
    }

    @Override
    public Iterator createIterator() {
        return new NecromancerCollegeIterator(deparments);
    }
}
