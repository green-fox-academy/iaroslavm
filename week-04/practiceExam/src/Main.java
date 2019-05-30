import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
       AnimalShelter newShelter = new AnimalShelter();
        newShelter.addAdopter("John");
        newShelter.addAdopter("Anna");
        newShelter.addAdopter("Frank");
        newShelter.addAdopter("Charlie");
        newShelter.addAdopter("Mac");
        newShelter.addAdopter("Dennis");

        newShelter.rescue();
        newShelter.rescue();
        newShelter.rescue();
        newShelter.rescue();
        newShelter.rescue();
        newShelter.rescue();
        newShelter.rescue();

        System.out.println(newShelter.toString());
        newShelter.heal();
        System.out.println(newShelter.toString());
        newShelter.heal();
        newShelter.heal();
        newShelter.heal();
        System.out.println(newShelter.toString());
        newShelter.findAdopter();
        System.out.println(newShelter.toString());

        newShelter.earnDonation(1000000);
        System.out.println(newShelter.toString());


//        Cat cat = new Cat();
//        System.out.println(cat.toString());


    }
}
