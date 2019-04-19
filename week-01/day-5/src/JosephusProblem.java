import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> solutions = new ArrayList<>();

        for (int number = 1; number < 17; number ++) {
            int m = 0;
            int l;
            int win;

            while (Math.pow(2, m) < number) {
                if (Math.pow(2, m + 1) > number) {
                    break;
                } else {
                    m++;
                }
            }

            l = number - (int) Math.pow(2, m);
            win = 2 * l + 1;
            numbers.add(number);
            solutions.add(win);
        }

        System.out.println(numbers);
        System.out.println(solutions);
    }
}

