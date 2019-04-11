public class BunniesAgain {
    public static void main(String[] args) {

        System.out.println(buns(10));
    }

    public static int buns(int n) {

        if (n == 0) {
            return 0;
        } else {
            if (n % 2 == 0) {
                return 2 + buns(n - 1);
            } else {
                return 3 + buns(n - 1);
            }
        }


    }
}
