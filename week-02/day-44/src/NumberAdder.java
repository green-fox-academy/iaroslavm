public class NumberAdder {

    public static void main(String[] args) {

        System.out.println(adder(4));

//        adder2(4);
    }

    public static int adder(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return n + adder(n - 1);
        }


    }

//    public static void adder2 (int n) {
//        if (n >= 0) {
//
//            System.out.println(n + adder(n - 1));
//        }
//        System.out.println(n);
//
//    }
//
//}

}
