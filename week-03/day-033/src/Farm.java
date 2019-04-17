import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Farm {
    List<Animal> animanlFarm = new ArrayList<>();
    int slots;

    Farm() {
        this(10);
    }

    Farm(int slots) {
        this.slots = slots;
        for (int i = 0; i < slots/2; i++) {
            animanlFarm.add(i, new Animal());
        }
    }

    void breed(){
        if (slots > animanlFarm.size()){
            animanlFarm.add(new Animal());
        }
    }

    void slaughter(){
        HashMap<Integer,Integer> animalHunger = new HashMap<>(); // create HM key Hunger, value : index
        int [] animalArray = new int [animanlFarm.size()];
        for (int i = 0; i < animalArray.length; i++){ //create array with hungers
            animalArray[i] = animanlFarm.get(i).hunger;
        }
        Arrays.sort(animalArray); // sort array with hungers to find minimum hunger
        for (int i = 0; i < animanlFarm.size(); i++){ // create HM key Hunger, value : index, if there are similar hungers then the index of the last instance will remain a value
            animalHunger.put(animanlFarm.get(i).hunger,i);
        }
        for (int hunger : animalHunger.keySet()) {
            if (hunger == animalArray[0]){ // for all animals with different levels of hunger if hunger is minimal
                int i = animalHunger.get(hunger);
                animanlFarm.remove(i);
            }
        }
    }

}


