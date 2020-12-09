package io.github.monkeydatabase.strategy.jdksample;

import java.util.Arrays;
import java.util.Comparator;

public class jdksample {
    public static void main(String[] args) {
        Integer[] data={9,5,7,8,2,4,6,3,1};
        Comparator<Integer> comparator=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2)
                    return 1;
                else
                    return -1;
            }
        };
        Arrays.sort(data,comparator);
        System.out.println(Arrays.toString(data));

        System.out.println("-------------------------");
        System.out.println("Choose another comparator");
        System.out.println("-------------------------");

        //lambda表达式
        Arrays.sort(data,(var1,var2)->{
            if (var1.compareTo(var2)<0)
                return 1;
            else
                return -1;
        });
        System.out.println(Arrays.toString(data));
    }
}
