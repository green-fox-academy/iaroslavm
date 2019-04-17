public class CarTest {
    public static void main(String[] args){
    Car car = new Car();
    Station station = new Station();

        System.out.println("Car gas = " + car.gasAmount);
        System.out.println("Station gas = " + station.gasAmount);

        station.refill(car);

        System.out.println("Car gas = " + car.gasAmount);
        System.out.println("Station gas = " + station.gasAmount);

}
}
