import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        int secretNUmber = 7;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please guess a number:");
        int number = scanner.nextInt();

        do {
              if (number > secretNUmber) {
                System.out.println("The stored number is lower");
                number = scanner.nextInt();

            } else if (number < secretNUmber) {
                System.out.println("The stored number is higher");
                 number = scanner.nextInt();
            }
        } while (number != secretNUmber);

        if (number == secretNUmber) {
            System.out.println("You found the number: " + secretNUmber);
        }
    }

}
