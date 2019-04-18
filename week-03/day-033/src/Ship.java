import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int crewSize;
    private List<Pirate> crew = new ArrayList<>();
    private String name;
    private boolean notSunk = true;

    Ship(String name) {
        this.name = name;
        fillShip(); // so when the new Ship() is called it also creates ship
    }

    void fillShip() {
        Pirate captain = new Pirate("Captain");
//        List<Pirate> crew = new ArrayList<>();
        crew.add(captain);
        this.crewSize = (int) (20 + Math.random() * (31 - 20));
        for (int i = 0; i <= this.crewSize; i++) {
            crew.add(new Pirate("Crew Member"));
        }
    }

    void sink() {
        notSunk = false;
    }

    List<Pirate> getCrew() {
        return this.crew;
    }

    String getName(){
        return this.name;
    }

    int countAlive() {
        int countAlive=0;
        for(int i = 0; i < this.crew.size(); i++) {
            if (this.crew.get(i).isAlive()) {
                countAlive++;
            }
        }
        return countAlive;
    }

    boolean isUnSunk() {
        return this.notSunk;
    }

    String shipInfo() {
        return this.getName() + " information. " + "Captain's consumed Rum: " + this.crew.get(0).getIntoxication()
                + ". Captain is alive and awake: " + this.crew.get(0).isAlive() + " "
                + !this.crew.get(0).isPassedOute() + ". " + "Alive members: " + this.countAlive() + ".";
    }

    boolean battle(Ship otherShip) {
        int scoreThis = this.crew.size() - this.crew.get(0).getIntoxication();
        int scoreOther = otherShip.crew.size() - otherShip.crew.get(0).getIntoxication();
        int randomCasualties = (int) (3 + Math.random() * (10-3));
        int randomDrinks = 2 + (int) (Math.random() * 2);
        int thisCrewSize = this.crew.size() - 1;
        int otherCrewSize = otherShip.crew.size() - 1;

//        System.out.println(this.shipInfo());
//        System.out.println(otherShip.shipInfo());

        if (scoreThis < scoreOther) {
//            System.out.println(this.getName() + " looses. " + randomCasualties + " pirates die.");
            for (int i = thisCrewSize; i > (thisCrewSize - randomCasualties); i--) {
                this.crew.get(i).die();
            }
            for (int i = 0; i < otherCrewSize + 1; i++) {
                for (int j = 0; j <= randomDrinks; j++) {
                    otherShip.crew.get(i).drinkSomeRum();
                }
            }
//            System.out.println(this.shipInfo());
//            System.out.println(otherShip.shipInfo());
            return false;
        } else {
//            System.out.println(otherShip.getName() + " looses. " + randomCasualties + " pirates die.");
            for (int i = otherCrewSize; i > otherCrewSize - randomCasualties; i--) {
                otherShip.crew.get(i).die();
            }
            for (int i = 0; i < thisCrewSize + 1; i++) {
                for (int j = 0; j <= randomDrinks; j++) {
                    this.crew.get(i).drinkSomeRum();
                }
            }
//            System.out.println(this.shipInfo());
//            System.out.println(otherShip.shipInfo());
            return true;
        }
    }
}
