import java.util.Arrays;

public class MaximumFinder {

    public static void main(String [] args) {

        int [] a = {1,2,4,5,4,3,4,7};
      System.out.println(Arrays.toString(finder(a)));

//        System.out.println(Arrays.toString(a));
//        a[0] = a[1];
//        System.out.println(Arrays.toString(a));
//        a = Arrays.copyOfRange(a, 1,a.length);
//        System.out.println(Arrays.toString(a));

    }

    public static int [] finder(int [] a) {

        if (a.length == 1) {
            return a;
        } else {
            if (a[1] > a[0]) {
                a = Arrays.copyOfRange(a, 1,a.length);
            } else {
                a[1] = a[0];
                a = Arrays.copyOfRange(a, 1,a.length);
            }
            return finder(a);
        }

    }
}
