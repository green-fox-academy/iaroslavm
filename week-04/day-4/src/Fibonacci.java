public class Fibonacci {

//    public static void main(String[] args) {
//        System.out.println(fibonacci(6));
//    }

    public  int fibonacci(int num) {
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;

        for(int i = 3; i <= num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}


