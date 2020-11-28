package io.github.monkeydatabase.prototype.deepclone.serialize;

public class Client {
    public static void main(String[] args) {
        DeepCloneableTarget deepCloneableTarget=new DeepCloneableTarget("大牛","水泊梁山");
        DeepPrototype deepPrototype=new DeepPrototype("宋江",deepCloneableTarget);

        DeepPrototype deepPrototype1=(DeepPrototype) deepPrototype.deepClone();
        DeepPrototype deepPrototype2=(DeepPrototype) deepPrototype.deepClone();
        DeepPrototype deepPrototype3=(DeepPrototype) deepPrototype.deepClone();
        DeepPrototype deepPrototype4=(DeepPrototype) deepPrototype.deepClone();
        DeepPrototype deepPrototype5=(DeepPrototype) deepPrototype.deepClone();

        System.out.println(deepPrototype==deepPrototype1);

        System.out.println("deepPrototype name :"+deepPrototype.getName()+" deepCloneableTarget.hashcode:"+deepPrototype.getDeepCloneableTarget().hashCode());
        System.out.println("deepPrototype1 name :"+deepPrototype1.getName()+" deepCloneableTarget.hashcode:"+deepPrototype1.getDeepCloneableTarget().hashCode());
        System.out.println("deepPrototype2 name :"+deepPrototype2.getName()+" deepCloneableTarget.hashcode:"+deepPrototype2.getDeepCloneableTarget().hashCode());
        System.out.println("deepPrototype3 name :"+deepPrototype3.getName()+" deepCloneableTarget.hashcode:"+deepPrototype3.getDeepCloneableTarget().hashCode());
        System.out.println("deepPrototype4 name :"+deepPrototype4.getName()+" deepCloneableTarget.hashcode:"+deepPrototype4.getDeepCloneableTarget().hashCode());
        System.out.println("deepPrototype5 name :"+deepPrototype5.getName()+" deepCloneableTarget.hashcode:"+deepPrototype5.getDeepCloneableTarget().hashCode());


    }
}
