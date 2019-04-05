import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number of girls:");
        int number1 = scanner.nextInt();

        System.out.println("Please give a number of boys:");
        int number2 = scanner.nextInt();


        if (number1 == 0) {
            System.out.println("Sausage party");
        } else if  ((number1 + number2 < 20)) {
            System.out.println("Average party...");
        } else if ((number1 != number2) && (number1 + number2 >= 20)) {
            System.out.println("Quite cool party!");
        } else  {
            System.out.println("The party is excellent!");
        }

        //if ((number1 == number2) && (number1 + number2 >= 20)) is redundant

        }
    }

