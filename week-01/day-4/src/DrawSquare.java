
import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = scanner.nextInt();

        for (int level = 0; level < number; level++) {
            if (level == 0 || level == number -1) {
                for (int lev = 0; lev < number; lev++) {
                    System.out.print("%");
                }
                System.out.print("\n");

            } else {
                System.out.print("%");
                for (int lev = 1; lev < number -1; lev++) {
                    System.out.print(" ");
                }
                System.out.print("%");
                System.out.print("\n");
            }
        }


    }


}
