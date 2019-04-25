package zoo;

public class Mammal extends Animal {
    protected int numLegs;
    protected boolean predator;

    public Mammal(String name){
        super.name = name;
    }

    public void rest(){
        System.out.println("Rests");
    }

    @Override
    public  String getName() {
        return super.name;
    }

    @Override
    public  String breed() {
        return "by giving birth.";

    }

    @Override
    public  void eat() {

    }

    @Override
    public  void drink() {

    }
}
