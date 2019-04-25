package instruments;

public class Main {
    public static void main(String[] args) {
        ElectricGuitar newElectro = new ElectricGuitar();
        ElectricGuitar otherElectro = new ElectricGuitar(123);
        newElectro.play();
        otherElectro.play();


    }
}
