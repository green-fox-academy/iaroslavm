import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TelephoneBook {
    public static void main(String[] args) {

        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("William A. Lathan", "405 - 709 - 1865");
        contacts.put("John K. Miller", "402 - 247 - 8568");
        contacts.put("Hortensia E. Foster", "606 - 481 - 6467");
        contacts.put("Amanda D. Newland", "319 - 243 - 5613");
        contacts.put("Brooke P. Askew", "307 - 687 - 2982");

        System.out.println("JK Miller number is " + contacts.get("John K. Miller"));

        List<String> names = new ArrayList<>(contacts.keySet());
        String soughtName = "";

        for (String element : names) {
            soughtName = element;
            if (contacts.get(element).equals("307 - 687 - 2982")) {
                break;
            }

        }

        System.out.println("307 - 687 - 2982 belongs to " + soughtName);

        System.out.println("The fact that we know Chris E. Myers' phone number is " + contacts.containsKey("Chris E. Myers"));




    }
}
