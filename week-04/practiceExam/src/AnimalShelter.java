import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
  private int budget = 50;
  private List<Animal> animalList = new ArrayList<>();
  private List<String> adoptersNameList = new ArrayList<>();

  public int rescue(){
    int random = (int) (Math.random()*3);
    if (random == 0) {
      animalList.add(new Cat());
    } else if (random == 1) {
      animalList.add(new Dog());
    } else {
      animalList.add(new Parrot());
    }
    return animalList.size();
  }

  public int heal(){ // I do not need to give inputs, heal() has access to animalList within the class
    int healedAnimals = 0;
    for (Animal each : animalList){
      if (!each.isHealthy) {
        if (this.budget > each.healCost) {
          this.budget -= each.healCost;
          each.heal();
          healedAnimals++;
          break;
        }
      }
    }
    return healedAnimals;
  }

  public void addAdopter(String adopterName){
    this.adoptersNameList.add(adopterName);
  }

  public void findAdopter(){
    int randomOwnerIndex;
    int randomAnimalIndex;
    boolean adopted = false;

    do {
      randomOwnerIndex = (int) (Math.random()*this.adoptersNameList.size());
      randomAnimalIndex = (int) (Math.random()*this.animalList.size());

      if (animalList.get(randomAnimalIndex).isAdoptable()) {
        this.animalList.remove(randomAnimalIndex);
        this.adoptersNameList.remove(randomOwnerIndex);
        adopted = true;
      }
    } while (!adopted);
  }

  public int earnDonation(int donation){
    this.budget +=donation;
    return budget;
  }

  @Override
  public String toString(){
    String info = "Budget: " + this.budget + " Euros,\n"
        + "There are " + animalList.size() + (animalList.size()==1 ? " animal" : " animals") +
        " and " + adoptersNameList.size() + " potential" + (adoptersNameList.size()==1 ? " adopter \n" : " adopters \n");
    for (Animal each : animalList) {
      info += each.toString();
    }
    return info;
  }
}


