public class Bunnies {

    public static void main(String[] args) {

        System.out.println(buns(120));
    }

    public static int buns(int n) {

        if (n == 0) {
            return 0;
        } else {
            return 2 + buns(n - 1);
        }


    }
}
