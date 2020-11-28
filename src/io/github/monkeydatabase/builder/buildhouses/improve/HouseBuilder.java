package io.github.monkeydatabase.builder.buildhouses.improve;

//对应于抽象建造者
public abstract class HouseBuilder {

    protected House house=new House();

    //将建造流程规定好
    public abstract void buildBase();
    public abstract void buildWalls();
    public abstract void buildRoof();

    //将建造好的房子返回回去
    public House buildHouse(){
        return house;
    }
}
