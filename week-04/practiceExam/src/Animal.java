public abstract class Animal { //in shelter rescue methods needs instanciation of an animal but I can instantiate random Cat, Dog, Parrot
  protected String ownerName;
  protected boolean isHealthy;
  protected int healCost;
  protected String animalName = this.getClass().getName();

  Animal(){

  }

  Animal(String animalName){
    this.animalName = animalName;
  }

  public void heal(){
    this.isHealthy = true;
  }


  public boolean isAdoptable(){
    boolean status = false;
    if (this.isHealthy){
      status = true;
    }
    return status;
  }

  @Override
  public String toString(){
    String info = this.animalName
        + (!isHealthy ? " is not healthy (" + this.healCost + " Euros), and not adoptable \n"
        : " is healthy, and adoptable \n");
    return info;
  }

  public String getOwnerName() {
    return ownerName;
  }

  public void setOwnerName(String ownerName) {
    this.ownerName = ownerName;
  }

  public boolean isHealthy() {
    return isHealthy;
  }

  public void setHealthy(boolean healthy) {
    isHealthy = healthy;
  }

  public int getHealCost() {
    return healCost;
  }

  public void setHealCost(int healCost) {
    this.healCost = healCost;
  }

  public String getAnimalName() {
    return animalName;
  }

  public void setAnimalName(String animalName) {
    this.animalName = animalName;
  }

}
