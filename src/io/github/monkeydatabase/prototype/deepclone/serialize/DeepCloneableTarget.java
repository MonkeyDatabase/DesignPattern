package io.github.monkeydatabase.prototype.deepclone.serialize;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable {
    private String name;
    private String cloneClass;

    public DeepCloneableTarget(String name, String cloneClass) {
        this.name = name;
        this.cloneClass = cloneClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }
}

