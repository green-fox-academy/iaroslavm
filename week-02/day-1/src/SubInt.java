import java.util.Arrays;

public class SubInt {
    public static void main(String [] args) {
        int a = 1;
        int[] ab = {1, 11, 34, 52, 61};
        int[] resultsClean = indexArray(a, ab);

        System.out.println(Arrays.toString(resultsClean));
    }


    public static int [] indexArray(int a, int [] ab) {
        // create abString to copy ab values as strings
        String [] abString = new String [ab.length];
        int j = 0;
        for (int i : ab) {
            abString[j] = Integer.toString(i);
            j++;
        }

        int k = 0;
        int iter = 0;
        int [] results = new int [abString.length]; // create empty results with length of abString

        // change 0 empty results to -1
        for (int i = 0; i < results.length; i++) {
            results[i] = -1;
        }
        // loop over abString, if its element i contains number a add it into the results
        for (String i: abString) {
            int index = (i.indexOf(Integer.toString(a))); // check if this element of abString contains a
            if (index != -1) { // if it does contain a
                results[k] = iter; // then add its index (iter) to results
                k++; // k iterates only when the element contains the number a
            }
            iter++;
        }
        // since results will contain -1 in places where we did not have coinsidences we need to clean it
        int iter2= - 1;

        for (int i = 0; i < results.length; i++) {
            iter2++; // wee need to find index of results when firs -1 (empty) value appear excliding the

                if (results[i] == -1) {
                    break;
            }
        }
        int[] resultsClean = new int[iter2];
            for (int i = 0; i < iter2; i++) {
                resultsClean[i] = results[i];
            }
        return resultsClean;
    }
}
