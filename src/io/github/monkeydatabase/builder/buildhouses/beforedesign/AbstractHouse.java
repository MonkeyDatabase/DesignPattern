package io.github.monkeydatabase.builder.buildhouses.beforedesign;

public abstract class AbstractHouse {

    public void  buildHouse(){
        buildBasic();
        buildWalls();
        buildRoof();
    }

    //第一步，打地基
    public abstract void buildBasic();

    //第二步，砌墙
    public abstract void buildWalls();

    //第三步，封顶
    public abstract void buildRoof();

}
