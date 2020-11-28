package io.github.monkeydatabase.prototype.deepclone.clone;

import java.io.Serializable;

public class DeepCloneableTarget implements Cloneable {

    private static final long serialVersionUID=1L;
    private String cloneName;
    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClss) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClss;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
