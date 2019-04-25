import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class COuntLetters {
//
//    public static void main(String[] args) {
//        counter("I'm gonna run down to electric avenue and then I'll take it higher");
//    }

    public  HashMap counter(String str){

        str = str.toLowerCase().replaceAll(" ","");
        char [] charArray = str.toCharArray();
        HashMap<Character,Integer> newDictionary = new HashMap<>();

        for(Character each : charArray){
                if (!newDictionary.containsKey(each)) {
                    newDictionary.put((each), 1);
                } else {
                    newDictionary.put(each, newDictionary.get(each)+1);
                }
        }

        for(Character each : newDictionary.keySet()){
            System.out.print("[ " + each + ": " + newDictionary.get(each) + " ]; " );
        }

        return  newDictionary;
    }
}
