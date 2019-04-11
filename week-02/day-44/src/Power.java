public class Power {
    public  static void main(String [] args) {

        System.out.println(powerN(2,8));

    }

    public static int powerN(int b, int n) {

        if (n == 1) {
            return b;
        } else {
            return b * powerN(b,n-1);
        }

    }
}
