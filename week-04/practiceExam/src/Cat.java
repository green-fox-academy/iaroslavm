public class Cat extends Animal {
  String favToy;

  Cat(){
    this.healCost = (int) (Math.random()*7);

  }

  Cat(String nameCat, String toy){
    this.animalName = nameCat;
    this.healCost = (int) (Math.random()*7);
    this.favToy = toy;
//    super.animalName = nameCat; // in this case super sets name of animal to nameCat, this sets Cat name but the outcome is the same
  }

  public void anyAnimal(){
    System.out.println("Yes, any animal");
  }

  public static void main(String[] args) {
    Cat myCat = new Cat("Chubby", "food");
    Cat cat = new Cat();
    System.out.println(myCat.healCost);
    System.out.println(cat.healCost);
  }
}
