import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction2 {
    public static void main(String[] args) {
        List<String> ListA = new ArrayList<>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        System.out.println(ListA);
        List<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println(ListB);
        System.out.println(ListB.contains("Durian"));

        //first copy the 5th element
        ListA.add("Lychee");
        ListA.set(3, new String("Kiwifrui"));

        if (ListA.size() > ListB.size()) {
            System.out.println("A is bigger");
        } else if (ListB.size() > ListA.size()) {
            System.out.println("B is bigger");
        } else {
            System.out.println("Equal");
        }


        int iter = 0;
        for (String element : ListA) {
            if (element.equals("Avocado")) {
                break;
            }
            iter++;

        }
        System.out.println("Avokado index in ListA is " + iter);

        int iter2 = 0;
        for (String element : ListB) {
            if (element.equals("Durian")) {
                break;
            }
            iter2++;

        }
        System.out.println("Durian index in ListA is " + iter2);

        List<String> newS = new ArrayList<>(Arrays.asList("Passion Fruit", "Pumello"));
        ListA.addAll(newS);
        System.out.println(ListA);
        System.out.println(ListA.get(3));








    }
}
