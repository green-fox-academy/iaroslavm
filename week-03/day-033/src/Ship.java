import java.util.ArrayList;
import java.util.List;

public class Ship {
    private int crewSize;
    private boolean aliveCaptain;
    private boolean passedOutCaptain;
    private int intoxicationCaptain;

    Ship(){
    }
    void fillShip() {
        Pirate captain = new Pirate("Captain");
        List<Pirate> crew = new ArrayList<>();
        this.crewSize = (int) (20 + Math.random()*(31 - 20));
        for (int i = 0; i <= this.crewSize; i++) {
            crew.add(new Pirate("Crew Member"));
        }
        crew.add(captain);
    }

    void captainRum(){
        
    }

}
