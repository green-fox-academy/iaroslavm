import java.util.Scanner;
import java.util.Arrays;


public class PulindromBuilder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give any string:");
        String string = scanner.nextLine();

        int stringLength = string.length();

        //Create reverse string

        String string2 = "";

        for (int index = stringLength - 1; index >= 0; index--) {
            char ch1 = string.charAt(index);
            string2 = string2 + ch1;
        }

        String Palindrom = string + string2;

        System.out.println(Palindrom);


    }
}
