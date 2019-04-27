import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CAB {
    public static void main(String[] args) {
        int guessNum = (int) (1000 + Math.random() * (9000));
        System.out.println(guessNum);

        play(guessNum);
    }

    public static void play(int guessNum) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide guess of 4 digit number:");
        int number = scanner.nextInt();
        List<Integer> guessList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        int guessNumCopy = guessNum;
        int NumCopy = number;

        int index = 0;
        do {
            guessList.add(guessNum % 10);
            numList.add(number % 10);
            guessNum /= 10;
            number /= 10;
            index++;
        } while (number != 0);

        int cowCount = 0;
        int bullCount = 0;

        //Count cows
        index = 0;
        int iter = 0;
        int iterations = numList.size();
        while (iter < iterations) {
            if (guessList.get(index).equals(numList.get(index))) {
                cowCount++;
                guessList.remove(index);
                numList.remove(index);
            } else {
                index++;
            }
            iter++;
        }

        iter = 0;
        iterations = numList.size();
        int indexGuess = 0;
        while (iter < iterations){
            for (int i = 0; i < guessList.size(); i++){
                if (guessList.get(indexGuess).equals(numList.get(i))){
                    bullCount++;
                    guessList.remove(indexGuess);
                    numList.remove(i);
                    indexGuess--;
                    break;
                }
            }
            indexGuess++;
            iter++;
        }

        System.out.println("Given secret number " + guessNumCopy + " and a guess of " + NumCopy
        + " there are " + cowCount + " cows and " + bullCount + " bulls.");
    }
}
