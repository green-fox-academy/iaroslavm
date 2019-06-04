public class Main {

    public static void main(String[] args) {
        double sum = 0.;

        for(int i = 1; i<1000000; i++){
            sum +=  Math.pow((double) 1/6,i);
        }
        System.out.println(sum);
    }

}
