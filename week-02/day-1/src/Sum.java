import java.util.Scanner;

public class Sum {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give array length:");
        int length = scanner.nextInt();
        int sumOfNumbers = sum(length);

        System.out.println(sumOfNumbers);


    }
    public static int sum(int finish) {
        int [] array = new int[finish + 1]; //I am adding one because the array compilation will start from 0 so I need
        // to add additional element to store the last value, otherwise I can say array[i] = i+1
        int sumOfNumbers = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i : array) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }
}
