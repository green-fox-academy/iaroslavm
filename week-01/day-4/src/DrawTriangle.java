import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = scanner.nextInt();


        for (int level = 0; level < number; level++) {

            for (int dots = 0; dots <= level; dots++) {
                System.out.print("*");

            }
                System.out.println(" ");
        }






    }
}
