package io.github.monkeydatabase.builder.buildhouses.improve;

public class HighBuildingBuilder extends HouseBuilder{
    @Override
    public void buildBase() {
        System.out.println("给高楼打地基:233m");
        house.setBase("233m");
    }

    @Override
    public void buildWalls() {
        System.out.println("给高楼砌墙:20cm");
        house.setWalls("20cm");
    }

    @Override
    public void buildRoof() {
        System.out.println("给高楼盖屋顶:透明屋顶");
        house.setRoof("透明屋顶");
    }
}
