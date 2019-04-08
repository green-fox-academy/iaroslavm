import java.util.Scanner;

public class Factorio {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give array length:");
        int length = scanner.nextInt();
        double prodOfNumbers = factorial(length);

        System.out.println(prodOfNumbers);


    }
    public static double factorial(int finish) {
        int [] array = new int[finish];
        double prodOfNumbers = 1.;

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(array[array.length - 1]);
        for (int i : array) {
            prodOfNumbers = prodOfNumbers * i;
        }
        return prodOfNumbers;
    }
}
