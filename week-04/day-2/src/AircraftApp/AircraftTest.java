package AircraftApp;

public class AircraftTest {
    public static void main(String[] args) {

        Aircraft F35 = new Aircraft("F35",12,50);
        Aircraft F16 = new Aircraft("F16",8,30);
        System.out.println(F35.getStatus());
        System.out.println(F35.isPriority());
        System.out.println(F35.refill(100));
        System.out.println(F35.getStatus());
        System.out.println(F35.fight());
        System.out.println(F35.getType());
        System.out.println(F35.getStatus());

    }

}
