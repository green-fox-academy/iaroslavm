import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give the first number:");
        int number1 = scanner.nextInt();

        System.out.println("Please give the second number:");
        int number2 = scanner.nextInt();
        int iter = number1;

        if (number2 < number1) {
            System.out.println("The second number should be bigger");
        } else if (number2 > number1) {
            while (iter < number2) {
                System.out.println(iter);
                iter += 1;
            }
        } else {
            System.out.println("Numbers are equal");
        }
    }
}
