import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

//        let's start with a domino that has minimum left number
        int minLeft = 7;
        int index = 0;
        int targetIndex = 0;
        for (int i = 0; i < dominoes.size(); i++) {
            if(dominoes.get(i).getLeftSide() < minLeft) {
                minLeft = dominoes.get(i).getLeftSide();
                targetIndex = index;
            }
            index++;
        }

        //I can start from arbitrary number, not necessary the smallest left SO YOU CAN DO 2 NESTED LOOPS

        System.out.println(targetIndex);

        //starting from domino 2 get the other domino that has the same right tile
        List<Domino> orderedList = new ArrayList<>();
        orderedList.add(dominoes.get(targetIndex));
        System.out.println(orderedList);

        int endIndex = 0;
        while (orderedList.size() != dominoes.size()) {
            for (Domino each : dominoes) {
                if (orderedList.get(endIndex).getRightSide() == each.getLeftSide()){
                    orderedList.add(each);
                    endIndex++;
                }
            }
        }
        System.out.println("The ordered list is: " + orderedList);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}