import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    public boolean anagram(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char [] string1 = str1.toCharArray();
        char [] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);

        return Arrays.equals(string1,string2);
    }
}
