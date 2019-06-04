import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Domino first = new Domino(1,2);
        Domino second = new Domino(1,2);
        Domino third = new Domino(2,3);
        Domino fourth = new Domino(1,4);
        Domino fifth = new Domino(1,1);

        List<Domino> dominoSet = new ArrayList<>();
        dominoSet.add(first);
        dominoSet.add(second);
        dominoSet.add(third);
        dominoSet.add(fourth);
        dominoSet.add(fifth);

        System.out.println(dominoSet);

        List<Domino> sortedSet = dominoSet;
        System.out.println(sortedSet);
        Collections.sort(sortedSet);
        System.out.println(sortedSet.toString().substring(2,3));

        System.out.println(first instanceof Comparable);

    }
}
