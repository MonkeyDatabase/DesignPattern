package io.github.monkeydatabase.builder.buildhouses.improve;

public class CommonHouseBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        System.out.println("给普通房子打地基:5m");
        house.setBase("5m");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙:10cm");
        house.setWalls("10cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("给普通房子盖屋顶:普通屋顶");
        house.setRoof("普通屋顶");
    }
}
