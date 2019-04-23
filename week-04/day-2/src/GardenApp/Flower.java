package GardenApp;

public class Flower extends Plant {

    Flower() {
        super();
        setType("Flower");

    }

    Flower(String color, int waterAmount) {
        super(color, waterAmount);
        setType("Flower");
    }

    @Override
    boolean needsWater() {
        return this.getWaterAmount() < 5;
    }

    @Override
    void water (double addWater){
        super.water((addWater * 0.75));
    }
}

