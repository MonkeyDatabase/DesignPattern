package io.github.monkeydatabase.builder.buildhouses.beforedesign;

public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    public void buildRoof() {
        System.out.println("给普通房子封顶");
    }
}
