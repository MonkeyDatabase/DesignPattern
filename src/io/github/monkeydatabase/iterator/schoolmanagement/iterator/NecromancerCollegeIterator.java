package io.github.monkeydatabase.iterator.schoolmanagement.iterator;

import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.Deparment;

import java.util.Iterator;
import java.util.List;

/*
NecromancerCollege中Deparment使用List方式存放
 */
public class NecromancerCollegeIterator implements Iterator {

    List<Deparment> deparmentList;
    int index=-1;

    public NecromancerCollegeIterator(List<Deparment> deparmentList) {
        this.deparmentList = deparmentList;
    }

    @Override
    public boolean hasNext() {
        if (index>=deparmentList.size()-1)
            return false;
        else
            index+=1;
        return true;
    }

    @Override
    public Object next() {
        return deparmentList.get(index);
    }
}
