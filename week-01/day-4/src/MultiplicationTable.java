import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number1 = scanner.nextInt();

        int iter = 1;

        while (iter < 11) {
            System.out.println(iter + " * " + number1 + " = " + (iter * number1));
            iter += 1;
        }
    }
}
