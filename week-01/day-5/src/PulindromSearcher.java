import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class PulindromSearcher {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give any string with at least 3 letters:");
        String str = "dog goat dad duck doodle never";
        System.out.println(str.length());
        palindrom(str);


    }

    public static void palindrom(String str) {

        String auxString;

        List<String> palString = new ArrayList<>();

        int k = 0;
        int m = 0;

        // outter loop to loop over all starting points, i should only go from 0 to n -2 (n is the last index, not size of str)
        // because we only want words starting from 3 chars
        for (int i = 0; i < str.length() - 2; i++) {
            //inner loop to loop over all word sizes from the end, j decreases only to i + 2 also because we want only at least 3 character words
            for (int j = str.length() - 1; j >= i + 2; j--) {
                //create auxiliary indexes that start from i j values and then itterated in while loop to see if every char in selected string has
                // a mirror char in it
                k = i;
                m = j;

                if (str.substring(i,j + 1).length() % 2 == 0) { // if selected string has even chars, substring method is exclusive in the end

                    while (str.charAt(k) == str.charAt(m) && k < m) { // while chars from start to end are the same,
                        // and left char index is less than right char index, if length = 4, index 0-3 then compare 0 - 3, 1-2
                        if (m == k + 1) {
                            palString.add(str.substring(i, j + 1)); //if they reached position whe 1-2 then add the whole selected string to list
                        }
                            k++;
                            m--;
                    }
                } else { // if selected string has odd chars
                    while (str.charAt(k) == str.charAt(m) && k + 2 <= m) { // while chars from start to end are the same,
                        // and left char index + 2 is less or equal to right char index, if length = 5, index 0-4 then compare 0 - 4, 1-3
                        // it is not necessary to go to 2-2 because it is the same character from both ends
                        if (m == k + 2) {
                            palString.add(str.substring(i, j + 1));
                        }
                        k++;
                        m--;
                    }
                }


                }
            }
        System.out.println(palString);
        }

//    public static String reverse (String str) {
//        String newStr = "";
//
//        for (int index = str.length() - 1; index >= 0; index--) {
//            char ch1 = str.charAt(index);
//            newStr += + ch1;
//        }
//        if (str.length() % 2 == 0) {
//            return str + newStr;
//        } else {
//            return str + newStr.subs;
//        }
//    }
}


