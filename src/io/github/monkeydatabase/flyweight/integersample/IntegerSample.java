package io.github.monkeydatabase.flyweight.integersample;

//如果把66改成233，则后四个判断均为false，因为IntegerCache中默认只有值为-128~127的对象
public class IntegerSample {
    public static void main(String[] args) {
        //valueOf如果IntegerCache(-128~127)中有，则返回IntegerCache中的，如果没有则new一个
        Integer x=Integer.valueOf(66);
        Integer y=new Integer(66);
        //仍然是从IntegerCache中获取
        Integer z=Integer.valueOf(66);
        Integer w=new Integer(66);

        //equals方法比较内容相同，返回true
        System.out.println(x.equals(y));

        //==运算符是比较内存地址，x和y并不是一个对象，返回false
        System.out.println(x==y);
        //x和z都是从valueOf获取，是同一个对象，返回true
        System.out.println(x==z);
        //x是从IntegerCache中获取，w是new出来的，所以返回false
        System.out.println(x==w);
        //y是new出来的，w是new出来的，new是申请新空间，所以二者内存地址不同，返回false
        System.out.println(y==w);

        ;
        System.out.println(x);
        System.out.println(z);

    }
}
