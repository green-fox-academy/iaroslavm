package instruments;

public abstract class StringedInstrument extends Instrument{
    int numberOfStrings;

    StringedInstrument(int numberOfStrings, String name){
        super(name);
        this.numberOfStrings = numberOfStrings;
    }

    abstract void sound();

    @Override
    void play() {
        this.sound();
    }
}
