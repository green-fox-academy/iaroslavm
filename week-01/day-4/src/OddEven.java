import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give an integer:");
        int number1 = scanner.nextInt();

        if (number1 % 2 != 0) {
            System.out.println("The number is odd");
        } else {
            System.out.println("The number is even");
        }

    }
}

