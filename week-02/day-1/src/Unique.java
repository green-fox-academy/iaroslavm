import java.util.Arrays;

public class Unique {

    public static void main(String [] args) {
        int [] array = {1, 11, 34, 11, 52, 61, 1, 34, 1, 2, 34, 58, 95, 79, 2};

        //Sort array
        Arrays.sort(array);


        int [] repeats = new int [array.length];
        int repeatsNum = 0;
        for (int i = 0; i < array.length - 1; i++) { // I need to shorten shorten length by 1 because in the end I compare n-1 and n and this way I avoid extra
            // coinsidence
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                   repeatsNum++; // why this counter did not work?
                    repeats[j] = 1;

                }
            }
        }

       // for (int i : repeats) {
         //   repeatsNum += i;
       // }



        System.out.println(Integer.toString(repeatsNum));

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(repeats));
     //  System.out.println(Arrays.toString(arrayUnique));

    }
}
