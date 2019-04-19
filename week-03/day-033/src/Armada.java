import java.util.ArrayList;
import java.util.List;

public class Armada {
    private String name;
    private List<Ship> ships = new ArrayList<>();
    private int armadaSize;

    Armada(String name) {
        fillArmada(name);
    }

    void fillArmada(String name) {
        this.name = name;
        this.armadaSize = (int) (0 + Math.random() * (50));
        for (int i = 0; i <= this.armadaSize; i++) {
            ships.add(new Ship("Regular Ship"));
        }
    }

    int countUnSunk() {
        int countUnSunk = 0;
        for (int i = 0; i < this.ships.size(); i++) {
            if (this.ships.get(i).isUnSunk()) {
                countUnSunk++;
            }
        }
        return countUnSunk;
    }

    List<Ship> getShips() {
        return this.ships;
    }

    boolean war(Armada otherArmada) {
        int thisArmadaSize = this.ships.size();
        int otherArmadaSize = otherArmada.ships.size();
        int indexOther = 0;
        int indexThis = 0;

        while (thisArmadaSize != 0 && otherArmadaSize != 0) {
                if (this.ships.get(indexThis).battle(otherArmada.ships.get(indexOther))) {
                    otherArmadaSize--;
                    otherArmada.ships.get(indexOther).sink();
                    indexOther++;
                } else {
                    thisArmadaSize--;
                    this.ships.get(indexThis).sink();
                    indexThis++;
                }
            }
        return (otherArmadaSize == 0);
    }
}


