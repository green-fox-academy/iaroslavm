import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = scanner.nextInt();

        int Sum = 0;

        for (int integer = 0; integer < number; integer++) {
            System.out.println("Please give an integer:");
            Sum = Sum + scanner.nextInt();
        }

        double average = Sum/number;

        System.out.println("Sum: " + Sum + " , Average: " + average);

    }
}

