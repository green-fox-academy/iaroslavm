import java.util.Scanner;

public class GuessNnumGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give range max:");
        int max = scanner.nextInt();

        System.out.println("Please give range min:");
        int min = scanner.nextInt();

        //generare random

        double number = (Math.random() * ((max - min) + 1)) + min;
        int intNum = (int) number;

        System.out.println(intNum);

        System.out.println("You have a number between "
                + min + " and " + max + " to guess. You have 5 lives, please provide the first guess:");
        int guess = scanner.nextInt();

        if (guess == intNum) {
            System.out.println("Lucky guess!");
        } else {

            if (guess > intNum) {
                System.out.println("Guess is too large.");

            } else if (guess < intNum) {
                System.out.println("Guess is too little.");
            }


            for (int attempt = 1; attempt <= 4; attempt++) {
                System.out.println("You have " + (5 - attempt) + " lives left. " + "Please give another number:");
                guess = scanner.nextInt();

                if (guess > intNum) {
                    System.out.println("Guess is too large.");

                } else if (guess < intNum) {
                    System.out.println("Guess is too little.");
                } else {
                    System.out.println("Correct!");
                    break;
                }
            }
        }

        if (guess != intNum) {
            System.out.println("Unfortunately you did not succeed! Try again later.");
        }

    }
}

