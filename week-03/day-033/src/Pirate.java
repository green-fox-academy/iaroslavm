public class Pirate {
    private String name;
    private int intoxication = 0;
    private int intoxicationInnitial = 0; // this is used when the pirate pas
    private boolean alive = true;
    private boolean passedOut = false;

    Pirate(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }

    String drinkSomeRum(){
            if (alive == true && passedOut == false) {
                intoxication++;
                return this.name + " drinks";
            } else if (alive == true && passedOut == true) {
                return (this.name + " is passed out");
            } else {
                return this.name + " is dead";
            }
        }
        int getIntoxication(){
        return this.intoxication;
        }

    String howsItGoingMate() {
        if (alive == true && passedOut == false){
            if (intoxication < 5) {
                return this.name +  " says: Pour me anudder!";
            } else {
                this.passedOut = true;
                return this.name +  " says: Arghh, I'ma Pirate. How d'ya d'ink its goin? I am going to sleep.";
            }
        } else if (alive == true && passedOut == true) {
            return this.name +  " is passed out";
        } else {
            return this.name + " is dead";
        }
    }

    String wakeUp(){
        if (this.passedOut == true) {
            this.passedOut = false;
            this.intoxication = intoxicationInnitial;
            return this.name + " says: I am up and ready!";
        } else {
            return this.name + " says: hey, I am still standing!";
        }
    }

    void die(){
        alive = false;
    }

    boolean isAlive() {
        return this.alive;
    }

    boolean isPassedOute() {
        return this.passedOut;
    }

    static boolean areTheyBothAlive(Pirate a, Pirate b) {
        return a.isAlive() && b.isAlive();
    }

    static boolean isAnyPassedOut(Pirate a, Pirate b) {
        return a.isPassedOute() && b.isPassedOute();
    }

    static String brawl(Pirate a,Pirate b) {
        if (Pirate.areTheyBothAlive(a, b)) {
            if (!Pirate.isAnyPassedOut(a, b)) {
                int chance = (int) (Math.random() * 9);
                if (chance < 3) {
                    b.die();
                    return "Pirates fought! " + b.name + " is dead";
                } else if (chance < 6) {
                    a.die();
                    return "Pirates fought! " + a.name + " is dead";
                } else {
                    b.passedOut = true;
                    a.passedOut = true;
                    return "Pirates fought! " + a.name + " and " + b.name + " are passed out";
                }

            } else {
                return "They can't fight. One of them is out.";
            }

        } else {
            return "They can't fight. One of them is dead.";
        }
    }
}
