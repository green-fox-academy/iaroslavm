import java.util.Scanner;
import java.util.List;

public class JosephusProblem {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please guess a number of participants:");
        int number = scanner.nextInt();

        int m = 0;
        int l = 0;
        int win = 0;




         while ((int) Math.pow(2, m) <= l); {
            l = number - (int) Math.pow(2, m);

            m++;
        }

      //  l = number - (int) Math.pow(2, m);
        win = 2 * l + 1;



            System.out.println("Winner is " + win);



        }
    }

