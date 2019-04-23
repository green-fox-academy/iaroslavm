package GardenApp;

public class Tree extends Plant {

    Tree() {
        super();
        setType("Tree");
    }

    Tree(String color, int waterAmount) {
        super(color, waterAmount);
        setType("Tree");
    }

    @Override
    boolean needsWater() {
        return this.getWaterAmount() < 10;
    }

    @Override
    void water (double addWater){
        super.water((addWater * 0.4));

    }
}

