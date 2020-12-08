package io.github.monkeydatabase.iterator.schoolmanagement;


import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.College;

import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.Deparment;
import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.DryadCollege;
import io.github.monkeydatabase.iterator.schoolmanagement.schoolcomponent.NecromancerCollege;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        College college1 = new DryadCollege("Dryad College");
        College college2 = new NecromancerCollege("Necromancer College");

        college1.addDepartment("CureDryad","Dryad cures everything");
        college1.addDepartment("BirdDryad","Dryad standing far away");

        System.out.println(college1.getName());
        Iterator iterator = college1.createIterator();
        while(iterator.hasNext()){
            Deparment deparment=(Deparment) iterator.next();
            System.out.println(deparment.getName());
        }

        System.out.println("--------------------------------------------");

        college2.addDepartment("SummonNecromancer","Necromancer summon everything to help him/her");
        college2.addDepartment("PoisonNecromancer","Necromancer use poison to help him/her");

        System.out.println(college2.getName());
        Iterator iterator1 = college2.createIterator();
        while (iterator1.hasNext()){
            Deparment deparment= (Deparment) iterator1.next();
            System.out.println(deparment.getName());
        }



    }
}
