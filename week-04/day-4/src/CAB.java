import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CAB {


    public static void main(String[] args) {
        int guessNum = (int) (1000 + Math.random() * (9000));
        int count = 0;
        System.out.println(guessNum);

        System.out.println(play(guessNum));
    }


    public static int play(int guessNum) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide guess of 4 digit number:");
        int number = scanner.nextInt();

        if (number > 9999 || number < 1000){
            return 0;
        }

//        counter();

        List<Integer> guessList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        List<Integer> guessListCopy = new ArrayList<>();
        List<Integer> numListCopy = new ArrayList<>();

        int guessNumCopy = guessNum;
        int NumCopy = number;

        int index = 0;
        do {
            guessListCopy.add(guessNum % 10);
            numListCopy.add(number % 10);
            guessNum /= 10;
            number /= 10;
            index++;
        } while (number != 0);

        guessList.addAll(guessListCopy);
        numList.addAll(numListCopy);

        for (int i = 0; i < guessListCopy.size(); i ++){
            guessList.set(i, guessListCopy.get(guessListCopy.size() - 1 - i));
        }

        for (int i = 0; i < numListCopy.size(); i ++){
            numList.set(i, numListCopy.get(numListCopy.size() - 1 - i));
        }

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
        return 2 * cowCount + bullCount;
    }

//    public int play(int guessNum, int number) {
//        if (number > 9999 || number < 1000){
//            return 0;
//        }
//
//
//        List<Integer> guessList = new ArrayList<>();
//        List<Integer> numList = new ArrayList<>();
//
//        List<Integer> guessListCopy = new ArrayList<>();
//        List<Integer> numListCopy = new ArrayList<>();
//
//        int guessNumCopy = guessNum;
//        int NumCopy = number;
//
//        int index = 0;
//        do {
//            guessListCopy.add(guessNum % 10);
//            numListCopy.add(number % 10);
//            guessNum /= 10;
//            number /= 10;
//            index++;
//        } while (number != 0);
//
//        guessList.addAll(guessListCopy);
//        numList.addAll(numListCopy);
//
//        for (int i = 0; i < guessListCopy.size(); i ++){
//            guessList.set(i, guessListCopy.get(guessListCopy.size() - 1 - i));
//        }
//
//        for (int i = 0; i < numListCopy.size(); i ++){
//            numList.set(i, numListCopy.get(numListCopy.size() - 1 - i));
//        }
//
//        int cowCount = 0;
//        int bullCount = 0;
//
//        //Count cows
//        index = 0;
//        int iter = 0;
//        int iterations = numList.size();
//        while (iter < iterations) {
//            if (guessList.get(index).equals(numList.get(index))) {
//                cowCount++;
//                guessList.remove(index);
//                numList.remove(index);
//            } else {
//                index++;
//            }
//            iter++;
//        }
//
//        iter = 0;
//        iterations = numList.size();
//        int indexGuess = 0;
//        while (iter < iterations){
//            for (int i = 0; i < guessList.size(); i++){
//                if (guessList.get(indexGuess).equals(numList.get(i))){
//                    bullCount++;
//                    guessList.remove(indexGuess);
//                    numList.remove(i);
//                    indexGuess--;
//                    break;
//                }
//            }
//            indexGuess++;
//            iter++;
//        }
//
//        System.out.println("Given secret number " + guessNumCopy + " and a guess of " + NumCopy
//            + " there are " + cowCount + " cows and " + bullCount + " bulls.");
//        return 2 * cowCount + bullCount;
//    }

//    public void counter(){
////        count++;
////    }
////
////    public int getCount() {
////        return count;
    }



