import java.util.Arrays;

public class FarmTest {
    public static void main(String[] args){
        Farm smallFarm = new Farm(30);
//        System.out.println(smallFarm.animanlFarm.get(0).hunger);
        System.out.println("Number of animals " + smallFarm.animanlFarm.size());
        System.out.println("Total slots " + smallFarm.slots);

        smallFarm.breed();
        System.out.println("Number of animals after breeding " + smallFarm.animanlFarm.size());
        System.out.println("Total slots " + smallFarm.slots);

        for (int i = 0; i < 20; i++) {
            smallFarm.breed();
        }

        System.out.println("Number of animals after breeding " + smallFarm.animanlFarm.size());
        System.out.println("Total slots " + smallFarm.slots);

        int [] hungerArray = new int [smallFarm.animanlFarm.size()];
        for (int i = 0; i < smallFarm.animanlFarm.size(); i++) {
            hungerArray[i] = smallFarm.animanlFarm.get(i).hunger;
        }
        System.out.println(Arrays.toString(hungerArray));

        //Now I will feed with number 15 and 10

        for (int i = 0; i < 5; i++){
            smallFarm.animanlFarm.get(15).eat();
            smallFarm.animanlFarm.get(10).eat();
            smallFarm.animanlFarm.get(10).eat();
        }
        System.out.println(smallFarm.animanlFarm.get(15).hunger);
        System.out.println(smallFarm.animanlFarm.get(10).hunger);

        smallFarm.slaughter();
        System.out.println(smallFarm.animanlFarm.size());
//        System.out.println(smallFarm.animanlFarm.get(10).hunger);

        int [] nhungerArray = new int [smallFarm.animanlFarm.size()];
        for (int i = 0; i < smallFarm.animanlFarm.size(); i++) {
            nhungerArray[i] = smallFarm.animanlFarm.get(i).hunger;
        }
        System.out.println(Arrays.toString(nhungerArray));






    }
}
