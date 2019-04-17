public class Station {
    int gasAmount = 1000;

    Station(){
    }

    void refill(Car car){
        this.gasAmount = this.gasAmount - car.capacity;
        car.gasAmount = car.gasAmount + car.capacity;
    }
}
