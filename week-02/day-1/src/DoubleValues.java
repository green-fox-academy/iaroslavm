import java.util.Arrays;

public class DoubleValues {
    public static void main(String [] args) {
        int [] numList = {3, 4, 5, 6, 7};
        int j = 0;
        int [] doubleList = new int [numList.length];
        for (int i : numList) {
            doubleList [j] = i * 2;
            j++;
        }
        System.out.println(Arrays.toString(doubleList));
    }
}
