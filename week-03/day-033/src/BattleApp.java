public class BattleApp {
    public static void main(String[] args){
        Ship newShip = new Ship("New Ship");
        newShip.fillShip();
        Ship oldShip = new Ship("Old Sheep");
        oldShip.fillShip();

        newShip.battle(oldShip);






    }
}
