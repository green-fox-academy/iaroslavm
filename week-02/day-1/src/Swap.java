import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        String [] abc = {"first", "second", "third"};
        String c = abc[2];
        String a = abc[0];
        abc[0] = c;
        abc[2] = a;

        System.out.println(Arrays.toString(abc));

    }
}
