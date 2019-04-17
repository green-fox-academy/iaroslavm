public class Counter {
    int value;
    int startValue;


    Counter() {
        this(0); //this is a constructor with default
    }

    Counter(int value) {
        this.value = value; // this is constructor if we give value
        this.startValue = value;
    }

    void add() {
        value++;
    }
    void add(int number) {
        value += number;
    }
    int getValue(){
        return value;
    }
    void reset() {
        value = startValue;
    }
}
