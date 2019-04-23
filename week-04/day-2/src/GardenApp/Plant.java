package GardenApp;

public class Plant {
    private String color;
    private int waterAmount;
    private String type;

    Plant(){
        this.color = "yellow";
        this.waterAmount = 10;
    }

    Plant(String color, int waterAmount){
        this.color = color;
        this.waterAmount = waterAmount;
    }

    boolean needsWater(){
        return this.waterAmount < 10;
    }

    void water(double addWater){
        this.waterAmount += addWater;
    }

    int getWaterAmount(){
        return this.waterAmount;
    }

    String getColor(){
        return this.color;
    }

    void setType(String type){
        this.type = type;
    }

    String getType(){
        return this.type;
    }



}
