package io.github.monkeydatabase.prototype.deepclone.clone;

public class DeepPrototype implements Cloneable {

    private String name;
    private DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype(String name, DeepCloneableTarget deepCloneableTarget) {
        this.name = name;
        this.deepCloneableTarget = deepCloneableTarget;
    }

    //通过重写clone方法来实现深拷贝
    @Override
    protected Object clone(){
        DeepPrototype deep=null,deepPrototype=null;
        try{
            //完成浅拷贝
            deep=(DeepPrototype)super.clone();
            //单独处理需深拷贝成员变量
            deepPrototype = deep;
            deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepPrototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneableTarget getDeepCloneableTarget() {
        return deepCloneableTarget;
    }

    public void setDeepCloneableTarget(DeepCloneableTarget deepCloneableTarget) {
        this.deepCloneableTarget = deepCloneableTarget;
    }
}
