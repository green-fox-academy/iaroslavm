package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> myGarden = new ArrayList<>();
    private int numFlowers = 0;
    private int numTrees = 0;

    Garden() {

    }

    void addFlowers() {
        this.numFlowers = 10 + (int) (Math.random() * 20);

        for (int i = 0; i < this.numFlowers; i++) {
            myGarden.add(new Flower());
        }
    }

    void addTrees() {
        this.numTrees = 1 + (int) (Math.random() * 5);

        for (int i = 0; i < this.numTrees; i++) {
            myGarden.add(new Tree());
        }
    }

    void addFlower(String color, int waterAmount) {
        myGarden.add(new Flower(color, waterAmount));
        this.numFlowers++;
    }

    void addTree(String color, int waterAmount) {
        myGarden.add(new Tree(color, waterAmount));
        this.numTrees++;
    }

    void info() {
        for (Plant each : myGarden) {
            if (each.needsWater()) {
                System.out.println("The " + each.getColor() + " " + each.getType() + " needs water.");
            } else {
                System.out.println("The " + each.getColor() + " " +  each.getType() + " does not need water.");
            }
        }
    }

    void gardenWatering(int addWater){
        System.out.println("\n" + "Watering with " + addWater);
        int count = 0;
        for (Plant each : myGarden) {
            if (each.needsWater()) {
                count++;
            }
        }
        int addWaterPerPlant = addWater / count;
        for (Plant each : myGarden) {
            if (each.needsWater()) {
                each.water(addWaterPerPlant);
            }
        }

    }

    List getMyGarden() {
        return myGarden;
    }

}


