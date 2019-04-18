public class PirateTest {
    public static void main(String [] args) {
        Pirate oldChap = new Pirate("Old Chap");
        Pirate oldJohn = new Pirate("Old Jon");

        System.out.println(oldChap.drinkSomeRum());
        System.out.println(oldChap.drinkSomeRum());
        System.out.println(oldChap.drinkSomeRum());
        System.out.println(oldChap.drinkSomeRum());
        System.out.println(oldChap.drinkSomeRum());
        System.out.println(oldChap.drinkSomeRum());
        System.out.println(oldChap.howsItGoingMate());
        System.out.println(oldChap.drinkSomeRum());

        System.out.println(oldChap.howsItGoingMate());
        System.out.println(oldChap.wakeUp());
        System.out.println(oldChap.wakeUp());

        System.out.println(oldChap.isAlive());
        System.out.println(oldJohn.isAlive());

        System.out.println(Pirate.areTheyBothAlive(oldChap,oldJohn));
        System.out.println(Pirate.isAnyPassedOut(oldChap,oldJohn));

        System.out.println(Pirate.brawl(oldChap,oldJohn));
        System.out.println(oldChap.isAlive());





    }
}
