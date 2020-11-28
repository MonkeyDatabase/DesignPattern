package io.github.monkeydatabase.builder.buildhouses.improve;

public class HouseDirector {
    HouseBuilder houseBuilder=null;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的流程交给指挥者
    public House constructHouse(){
        //工序流程可以改变
        houseBuilder.buildBase();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();

        //将盖好的房子返回
        return houseBuilder.buildHouse();
    }
}
