package io.github.monkeydatabase.composite.jdksample;

import java.util.HashMap;
import java.util.Map;

public class Composite {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<Integer, String>();
        //直接存放叶子节点
        hashMap.put(233,"Coffee");

        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(555,"Juice");
        map.put(666,"Milk");

        map.putAll(hashMap);

        System.out.println(hashMap);
    }
}
