package GardenApp;

public class GardenTest {
    public static void main(String[] args) {
        Garden myGarden = new Garden();
        myGarden.addFlower("yellow",1);
        myGarden.addFlower("blue",1);
        myGarden.addTree("purple",1);
        myGarden.addTree("orange",1);

        myGarden.info();

        myGarden.gardenWatering(40);
        myGarden.info();
        myGarden.gardenWatering(70);
        myGarden.info();

        System.out.println(myGarden.myGarden.get(3).getWaterAmount());

    }
}
