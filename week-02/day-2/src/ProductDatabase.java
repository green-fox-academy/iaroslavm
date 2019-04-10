import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ProductDatabase {

    public static void main(String[] args) {

        HashMap<String,Integer> products = new HashMap<>();

        products.put("Eggs",200);
        products.put("Milk",200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken",550);

        //fish price
        System.out.println("Fish is " + products.get("Fish"));

        List<Integer> prices = new ArrayList<>(products.values());

        Collections.sort(prices);
        int highPrice = prices.get(prices.size()-1);
        int lowPrice = prices.get(0);


        List<String> items = new ArrayList<>(products.keySet());

        String soughtItem = "";
        String soughtItem2 = "";

        for (String element : items) {
            soughtItem = element;
            if (products.get(element).equals(highPrice)) {
                break;
            }
        }

        System.out.println("Highest price is " + highPrice + " for " + soughtItem);

        double sum= 0.;

        for (Integer price : prices) {
            sum += price;
        }

        double average = sum / products.size();

        System.out.println("Average price is " + average);

        int priceCount = 0;

        for (Integer price : prices) {
            if (price < 300) {
                priceCount++;
            }
        }

        System.out.println("There are " + priceCount + " price below 300");

        if (products.containsValue(125)) {
            System.out.println("There is something we can buy for 125");
        } else {
            System.out.println("There is nothing we can buy for 125");
        }

        for (String element : items) {
            soughtItem2 = element;
            if (products.get(element).equals(lowPrice)) {
                break;
            }
        }
        System.out.println("Lowest price is " + lowPrice + " for " + soughtItem2);






    }
}
