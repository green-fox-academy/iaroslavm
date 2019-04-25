package zoo;

public class Reptile extends Animal{
    protected int tailLength;

    public Reptile(String name){
        super.name = name; // we can use it because name is protected in Animal but not private
    }


    public  void hybernate(){
        System.out.println("Hybernates");
    }


    @Override
    public  String getName() {
        return super.name; // we can use it because name is protected in Animal but not private
    }

    @Override
    public String breed() {
        return "laying eggs";

    }

    @Override
    public   void eat() {

    }

    @Override
    public void drink() {

    }
}
