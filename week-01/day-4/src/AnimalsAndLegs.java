import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give number of chikens:");
        int nChiks = scanner.nextInt();

        System.out.println("Please give number of pigs:");
        int nPigs = scanner.nextInt();

        System.out.println("Number of legs: " + (nChiks * 2 + 4 * nPigs));
    }
}