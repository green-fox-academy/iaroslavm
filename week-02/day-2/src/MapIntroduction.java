import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapIntroduction {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("978-1-60309-452-8","A Letter to Jo");
        map.put("978-1-60309-459-7","Lupus");
        map.put("978-1-60309-444-3","Red Panda and Moon Bear");
        map.put("978-1-60309-461-0","The Lab");

        //create array out of keySet
        List<String> keylist = new ArrayList<String>(map.keySet());


        for (String element : keylist) {
            System.out.println(map.get(element) + " (ISBN: " + element + ")");
        }
        map.remove("978-1-60309-444-3");

        keylist = new ArrayList<String>(map.keySet());
        System.out.println(keylist.toString());

        System.out.println(map.get("978-1-60309-461-0").equals("The Lab"));

        for (String element : keylist) {
            if (map.get(element).equals("The Lab")) {
                map.remove(element);
            }
        }
        map.put("978-1-60309-450-4","They Called Us Enemy");
        map.put("978-1-60309-453-5","TWhy Did We Trust Him?");

        System.out.println(map.containsKey("478-0-61159-424-8"));
        System.out.println(map.get("978-1-60309-453-5"));

    }
}


