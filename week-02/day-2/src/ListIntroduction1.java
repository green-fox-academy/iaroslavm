import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {

    public static void main(String[] args) {
        List<String> newStringList = new ArrayList<>();
        System.out.println(newStringList.size());

        newStringList.add("William");
        System.out.println(newStringList.size());
        System.out.println(newStringList);
        System.out.println(newStringList.isEmpty());
        newStringList.add("John");
        newStringList.add("Amanda");
        System.out.println(newStringList.size());
        System.out.println(newStringList.get(2));

        //iterate through the list and print out each name

        for (String element : newStringList) {
            System.out.println(element);
        }

        int iter = 1;
        for (String element : newStringList) {
            System.out.println(iter + "." + element);
            iter++;
        }

        newStringList.remove(1);

        for (int i = newStringList.size() - 1; i >= 0; i--) {
            System.out.println(newStringList.get(i));
        }

        while (!newStringList.isEmpty()) {
            newStringList.remove(0);
        }
        System.out.println(newStringList);





    }
}
