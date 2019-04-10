import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));

        if (list.contains("milk")) {
            System.out.println("List contains milk");
        } else {
            System.out.println("List does not contains milk");
        }

        if (list.contains("bananas")) {
            System.out.println("List contains bananas");
        } else {
            System.out.println("List does not contains bananas");
        }


    }


}
