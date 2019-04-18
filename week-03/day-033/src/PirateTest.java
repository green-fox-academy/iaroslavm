import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class PirateTest {
    public static void main(String [] args) {
        Pirate oldChap = new Pirate("Old Chap");
        Pirate oldJohn = new Pirate("Old Jon");

        Ship newShip = new Ship("New Ship");
        newShip.fillShip();
//        System.out.println(newShip.shipInfo());
        newShip.getCrew().get(0).drinkSomeRum();
        newShip.getCrew().get(0).drinkSomeRum();
        newShip.getCrew().get(0).drinkSomeRum();
        newShip.getCrew().get(0).drinkSomeRum();
        newShip.getCrew().get(0).drinkSomeRum();
        newShip.getCrew().get(0).drinkSomeRum();

        System.out.println(newShip.shipInfo());

        Ship oldShip = new Ship("Old Sheep");
        oldShip.fillShip();

        System.out.println(oldShip.shipInfo());

        System.out.println(newShip.battle(oldShip));

        System.out.println(newShip.shipInfo());
        System.out.println(oldShip.shipInfo());






    }
}
