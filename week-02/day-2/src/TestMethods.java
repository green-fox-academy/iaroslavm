import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMethods {
    public static void main(String [] args) {
        String newString = "this ends with this word";
        if (newString.endsWith("ord")) {
            System.out.println(newString);
        }

        String anotherString = newString.replace('o', 'a');
        System.out.println(anotherString);

        ArrayList<String> thisIsStringList = new ArrayList<>();

        thisIsStringList.add("first");
        thisIsStringList.add("second");
        thisIsStringList.add("third");
        thisIsStringList.add("third");
        thisIsStringList.add("third");
        thisIsStringList.add("third");
        thisIsStringList.add("third");
        thisIsStringList.add("third");
        thisIsStringList.add("third");

        System.out.println(thisIsStringList);

        while (thisIsStringList.contains("third")) {
            thisIsStringList.remove("third");
        }

        System.out.println(thisIsStringList);

        List<String> anotherListString = Arrays.asList("such","news","very","good");

        System.out.println(anotherListString);

    }
}
