import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapsIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer,String> newMap = new HashMap<>();
        System.out.println(newMap.isEmpty());
        newMap.put(97,"a");
        newMap.put(98,"b");
        newMap.put(99,"c");
        newMap.put(65,"A");
        newMap.put(66,"B");
        newMap.put(67,"C");

        System.out.println(newMap.keySet());
        System.out.println(newMap.values());

        newMap.put(68,"D");
        System.out.println(newMap.size());
        System.out.println(newMap.get(99));
        newMap.remove(97);
        System.out.println(newMap.containsKey(100));
        System.out.println(newMap.keySet());

        //create an ArrayList of keySets
        List<Integer> keylist = new ArrayList<Integer>(newMap.keySet());

        for (Integer element : keylist) {
            newMap.remove(element);
        }


        System.out.println(newMap.isEmpty());

    }
}
