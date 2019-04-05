import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number:");
        int number = scanner.nextInt();

        int topNumber  = 0;


        if (number % 2 != 0) {
            topNumber = number / 2 + 1;

        } else {
            topNumber = number / 2;

        }



        for (int level = 0; level < topNumber; level++) {

            for (int spaces = level; spaces < (2 * topNumber - 1) / 2; spaces++) {
                System.out.print(" ");
            }

            for (int stars = 0; stars <= level * 2; stars++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        if (number % 2 == 0) {
            for (int level = topNumber; level > 0; level--) {

                for (int spaces = level; spaces < number / 2; spaces++) {
                    System.out.print(" ");
                }

                for (int stars = 0; stars < level * 2 - 1; stars++) {
                    System.out.print("*");
                }

                System.out.println(" ");
            }
        } else {
            for (int level = topNumber - 1; level > 0; level--) {

                for (int spaces = level; spaces < number / 2 + 1; spaces++) {
                    System.out.print(" ");
                }

                for (int stars = 0; stars < level * 2 - 1; stars++) {
                    System.out.print("*");
                }

                System.out.println(" ");
            }
        }

    }
}


