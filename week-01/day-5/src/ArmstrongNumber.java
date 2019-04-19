import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        System.out.println("Please provide a number to check:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String strNumber = Integer.toString(number);
        String [] stringSplit = strNumber.split("");
//        String[] splitString = new String [strNumber.length()];
//        for (int i = 0; i < strNumber.length(); i++) {
//            splitString[i] = strNumber.substring(i, i+1);
//        }
        System.out.println(Arrays.toString((stringSplit)));

        int sum = 0;
        for (String each : stringSplit){
            sum += Math.pow(Integer.parseInt(each),stringSplit.length);
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
