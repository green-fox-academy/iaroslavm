public class Animal {
   private int hunger = 50;
   private int thirst = 50;

    public Animal() {

    }
    void eat() {
        hunger--;
    }
    void drink() {
        thirst--;

    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    void play() {
        hunger++;
        thirst++;
    }
}