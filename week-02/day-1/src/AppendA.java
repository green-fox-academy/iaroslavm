import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        String [] animals = {"koal", "pand", "zebr"};
        String [] animalsA = new String [animals.length];
        int j = 0;
        for (String i : animals) {
            animalsA[j] = i + "a";
            j++;
        }
        System.out.println(Arrays.toString(animalsA));

    }
}
