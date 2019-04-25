package zoo;

public class Bird extends Animal{
    protected  String favFood;
    protected int wingSize;

    public Bird(String name){
        super.name = name;
    }

    public  void makeNest() {
        System.out.println("Makes nest");
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public String breed() {
        return "by laying eggs.";

    }

    @Override
    public  void eat() {

    }

    @Override
    public void drink() {

    }
}
