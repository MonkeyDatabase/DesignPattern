package io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent;

import java.util.Iterator;

public interface College {
    String getName();

    void addDepartment(String name,String des);

    Iterator createIterator();
}
