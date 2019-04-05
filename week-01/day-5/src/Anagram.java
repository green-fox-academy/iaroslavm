import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give any word:");
        String word1 = scanner.nextLine();

        System.out.println("Please give another word:");
        String word2 = scanner.nextLine();

        //Get rid of spaces

        word1 = word1.replaceAll("\\s", "");
        word2 = word2.replaceAll("\\s", "");

        //Count characters
        boolean lengthComp = word1.length() == word2.length();

        if (!lengthComp) {
            System.out.println("Strings have different character length so they are not anagrams");
        } else {

            //Change to lower case

            char [] str1 = word1.toLowerCase().toCharArray();
            char [] str2 = word2.toLowerCase().toCharArray();

            Arrays.sort(str1); // It will sort and store the sorted values with the same name
            Arrays.sort(str2);

            if (Arrays.equals(str1, str1)) {
                System.out.println("These strings are anagrams");
                System.out.println(str1);
                System.out.println(str2);
            } else {
                System.out.println("These strings are not anagrams");
                System.out.println(str1);
                System.out.println(str2);
            }

        }

    }
}
