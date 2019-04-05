import java.util.Scanner;
import java.util.List;

public class JosephusProblem {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please guess a number of participants:");
        int number = scanner.nextInt();

        int size = 0;
        while (number / 2 > 0) {
            size++;
        }


        int nArray [] = new int [number];
        int nArrayEven [] = new int [number/2];
        int nArrayOdd [] = new int [number/2 + 1];




        //fill array
        for (int num = 0; num < number; num++) {
            nArray[num] = num +1;
        }


    }
}
