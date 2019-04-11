import java.util.Arrays;

public class Test2 {

    public static void main(String [] args) {

        int [] arr = {1,2,3,4};
        int [] arr2 = {1,2,3,4};
        int [] arr3 = new int [4];
        int [] arr4 = new int [4];

        arr3 = Arrays.copyOf(arr,4);
        arr4 = arr2.clone();


        System.out.println(Arrays.equals(arr, arr2));
        System.out.println(arr.equals(arr2)); // WHY IS IT FALSE?

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.toString()); // WHY IT DOES NOT WORK?

        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));




    }
}
