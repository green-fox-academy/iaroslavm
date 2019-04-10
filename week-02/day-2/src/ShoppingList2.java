import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingList2 {
    public static void main(String[] args) {

        HashMap<String,Double> myList = new HashMap<>();
        HashMap<String,Integer> bList = new HashMap<>();
        HashMap<String,Integer> aList = new HashMap<>();

        myList.put("Milk",1.07);
        myList.put("Rice",1.57);
        myList.put("Eggs",3.14);
        myList.put("Cheese",12.60);
        myList.put("Chicken Breasts",9.40);
        myList.put("Apples",2.31);
        myList.put("Tomato",2.58);
        myList.put("Potato",1.75);
        myList.put("Onion",1.10);

        bList.put("Milk",3);
        bList.put("Rice",2);
        bList.put("Eggs",2);
        bList.put("Cheese",1);
        bList.put("Chicken Breasts",4);
        bList.put("Apples",1);
        bList.put("Tomato",2);
        bList.put("Potato",1);


        aList.put("Rice",1);
        aList.put("Eggs",5);
        aList.put("Chicken Breasts",2);
        aList.put("Apples",1);
        aList.put("Tomato",10);

        List<String> myString = new ArrayList<>(myList.keySet());
        List<String> bString = new ArrayList<>(bList.keySet());
        List<String> aString = new ArrayList<>(aList.keySet());

        double bPay = 0;
        double aPay = 0;

        for (String item : bString) {
            bPay += bList.get(item) * myList.get(item);
        }

        System.out.println("Bob pays " + bPay);

        for (String item : aString) {
            aPay += aList.get(item) * aList.get(item);
        }
        System.out.println("Alice pays " + aPay);

        if (bList.get("Rice") > aList.get("Rice")) {
            System.out.println("Bob buys more rice");
        } else {
            System.out.println("Alice buys more rice");
        }

        if (aList.get("Potato") != null) {
            if (bList.get("Rice") > aList.get("Rice")) {
                System.out.println("Bob buys more rice");
            } else {
                System.out.println("Alice buys more rice");
            }

        } else {
            System.out.println("Alice does not buy potato");
        }


        int bItems = 0;
        int aItems = 0;

        for (String item : bString) {
            bItems++;
        }

        for (String item : aString) {
            aItems++;
        }

        if (bItems > aItems) {
            System.out.println("Bob buys more different products");
        } else {
            System.out.println("Alice buys more different products");
        }

    }
}
