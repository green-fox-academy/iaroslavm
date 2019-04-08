import java.util.Arrays;

public class TestFunctions {


    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        sum(a, b);

        int results = sumWithReturn(a, b);

        System.out.println("This is a print out from main method after sumWithReturn calculated and returned the sum and " +
                "multiplied by 2:");
        System.out.println(results * 2);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumOfElements = sumArrayElements(array);
        System.out.println(sumOfElements);

        int [] evenOnly = returnEvenOnly(array);

    }

    public static void sum(int a, int b) {
        System.out.println("This is a print out from sum method without return:");

        System.out.println(a + b);

    }

    public static int sumWithReturn(int a, int b) {

        return (a + b);
    }

    public static int sumArrayElements(int[] array) {
        int sumElements = 0;
        for (int i : array) { //this is a for each loop, instead of indexing we looping over elemenets
            sumElements += i; // THIS IS THE SAME AS SAYING INCREASE SUMELEMENTS BY I EVERY TURN
        }

        return (sumElements);

    }

    // return just even numbers
    public static int [] returnEvenOnly(int[] array) {
        int[] returnArray = new int[array.length];
        int j = 0;
        for (int i : array) { //this is a for each loop, instead of indexing we looping over elemenets
            if (i % 2 == 0) {
                returnArray[j] = i;
                j++;


            }
        }
        System.out.println(Arrays.toString(returnArray));
        return (returnArray);
    }
}
