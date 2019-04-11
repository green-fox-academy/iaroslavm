public class SumDigit {

    public static void main(String[] args) {

        System.out.println(addD(999));

        System.out.println(1 % 10);

    }

    public static int addD(int n) {

        if (n != 0) {
            return (n % 10) + addD(n/10);
        } else
            return 0;
    }
}
