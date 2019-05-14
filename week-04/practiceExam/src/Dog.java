public class Dog extends Animal {
  Dog(){
    this.healCost = 1+ (int) (Math.random()*9);

  }

  Dog(String nameCat){
    this.animalName = nameCat;
    this.healCost = 1 + (int) (Math.random()*9);
//    super.animalName = nameCat; // in this case super sets name of animal to nameCat, this sets Cat name but the outcome is the same
  }

  public static void main(String[] args) {
    Animal myCat = new Cat("Chybby", "food"); // my Cat has only methods and vars set in Animal
    Cat cat = new Cat("Chybby", "food");
    Dog myDog = new Dog();
    System.out.println(myCat.getClass());// myCat does not have favToy var
    System.out.println(cat.favToy);
  }
}
