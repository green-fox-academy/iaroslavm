public class Car {
    int gasAmount;
    int capacity;

    Car() {
        this(0,100);
    }
    Car(int gasAmount,int capacity) {
        this.capacity = capacity;
        this.gasAmount = gasAmount;

    }
}
