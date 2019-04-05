public class FizzBuzz {
    public static void main(String[] args) {

        int iter = 1;

        while (iter < 101) {
            if (iter % 15 == 0) {
                System.out.println("FizzBuzz");
                iter += 1;
            } else if (iter % 5 == 0) {
                System.out.println("Buzz");
                iter += 1;
            } else if (iter % 3 == 0) {
                System.out.println("Fizz");
                iter += 1;
            } else {
                System.out.println(iter);
                iter += 1;
            }

        }

    }
}
