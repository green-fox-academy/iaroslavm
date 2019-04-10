import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String,Integer> products = new HashMap<>();

        products.put("Eggs",200);
        products.put("Milk",200);
        products.put("Fish",400);
        products.put("Apples",150);
        products.put("Bread",50);
        products.put("Chicken",550);

        List<Integer> prices = new ArrayList<>(products.values());
        List<String> items = new ArrayList<>(products.keySet());

        List<String> cheapItems = new ArrayList<>();
        int cheapCount = 0;

        for (String element : items) {
            if (products.get(element) < 201) {
                cheapItems.add(element);

            }
        }
        System.out.println("Less than 201 items are " + cheapItems.toString());

        List<String> cheapItems2 = new ArrayList<>();

        for (String element : items) {
            if (products.get(element) > 150) {
                cheapItems2.add(element);

            }
        }
        System.out.print("More than 150 items are ");

        List<Integer> prices2 = new ArrayList<>();

        for (String item : cheapItems2) {
            prices2.add(products.get(item));
        }

        for (int i = 0; i < cheapItems.size(); i++) {
            System.out.print(cheapItems2.get(i) + "(" + prices2.get(i) + ") ");
        }
    }


}
