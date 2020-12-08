package io.github.monkeydatabase.composite.universitymanagement;

import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.College;
import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.Deparment;
import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.DryadCollege;
import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.NecromancerCollege;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ClientImproved {
    public static void main(String[] args) {
        College college1 = new DryadCollege("Dryad College");
        College college2 = new NecromancerCollege("Necromancer College");

        college1.addDepartment("CureDryad","Dryad cures everything");
        college1.addDepartment("BirdDryad","Dryad standing far away");
        college2.addDepartment("SummonNecromancer","Necromancer summon everything to help him/her");
        college2.addDepartment("PoisonNecromancer","Necromancer use poison to help him/her");

        List<College> colleges=new LinkedList<>();
        colleges.add(college1);
        colleges.add(college2);

        Iterator iterator=colleges.iterator();

        while(iterator.hasNext()){
            College college= (College) iterator.next();
            System.out.println(college.getName());
            Iterator departmentIterator=college.createIterator();
            while(departmentIterator.hasNext()){
                Deparment deparment= (Deparment) departmentIterator.next();
                System.out.println(deparment.getName());
            }
            System.out.println("-----------------------------");
        }


    }
}
