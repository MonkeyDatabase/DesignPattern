package io.github.monkeydatabase.flyweight.integersample;

import java.io.InputStream;

public class integersample {
    public static void main(String[] args) {
        Integer integer=100;
        Integer integer2=Integer.valueOf(100);
        System.out.println(integer.hashCode());
        System.out.println(integer2.hashCode());
    }
}
