package AircraftApp;

public class AircraftTest {
    public static void main(String[] args) {

        Aircraft F35 = new Aircraft("F35");
        Aircraft F16 = new Aircraft("F16");

        Carrier myCarrier = new Carrier(1000, 20000);
        Carrier otherCarrier = new Carrier(1000, 20000);
        myCarrier.add("F35");
        myCarrier.add("F35");
        myCarrier.add("F35");
        myCarrier.add("F35");
        myCarrier.add("F16");
        myCarrier.add("F16");
        myCarrier.add("F16");
        myCarrier.add("F16");
        myCarrier.add("F16");

        otherCarrier.add("F35");
        otherCarrier.add("F35");
        otherCarrier.add("F35");
        otherCarrier.add("F35");
        otherCarrier.add("F16");
        otherCarrier.add("F16");
        otherCarrier.add("F16");
        otherCarrier.add("F16");

        myCarrier.info();
        myCarrier.fill();
        otherCarrier.fill();
        myCarrier.info();

        myCarrier.fight(otherCarrier);
        myCarrier.info();
        otherCarrier.info();

    }

}
