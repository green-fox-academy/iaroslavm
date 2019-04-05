import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = scanner.nextInt();


        for (int level = 0; level < number; level++) {

            for (int spaces = level; spaces < (2 * number - 1) / 2; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars <= level * 2; stars++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}


