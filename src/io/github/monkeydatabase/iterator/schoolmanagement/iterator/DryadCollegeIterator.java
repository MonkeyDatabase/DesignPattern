package io.github.monkeydatabase.iterator.schoolmanagement.iterator;

import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.Deparment;

import java.util.Iterator;

/*
DryadCollege中Department采用数组方式存放
 */
public class DryadCollegeIterator implements Iterator {
    Deparment[] deparments;
    int pos=0;

    public DryadCollegeIterator(Deparment[] deparment) {
        this.deparments = deparment;
    }

    @Override
    public boolean hasNext() {
        if (pos>=deparments.length||deparments[pos]==null)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        Deparment deparment= deparments[pos];
        pos+=1;
        return deparment;
    }
}
