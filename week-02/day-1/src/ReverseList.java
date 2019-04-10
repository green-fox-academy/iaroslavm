import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        int [] ai = {3, 4, 5, 6, 7};
        int [] aj = new int [ai.length];
        int j = 0;

        for (int i = ai.length -1; i >= 0; i--) {
            aj[j] = ai[i];
            j++;
        }
        System.out.println(Arrays.toString(aj));
    }
}
