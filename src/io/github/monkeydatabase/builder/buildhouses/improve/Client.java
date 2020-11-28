package io.github.monkeydatabase.builder.buildhouses.improve;

public class Client {
    public static void main(String[] args) {

        //盖普通房子
        CommonHouseBuilder commonHouseBuilder=new CommonHouseBuilder();

        //准备盖房子的指挥者
        HouseDirector houseDirector=new HouseDirector(new CommonHouseBuilder());

        //返回盖好的房子
        House house=houseDirector.constructHouse();

        //盖高楼
        HighBuildingBuilder highBuildingBuilder=new HighBuildingBuilder();

        houseDirector.setHouseBuilder(highBuildingBuilder);

        houseDirector.constructHouse();
    }
}
