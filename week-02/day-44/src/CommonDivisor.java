public class CommonDivisor {

    public static void main(String[] args) {

        System.out.println(greatDiv(100,5));

    }



        public static int greatDiv ( int a, int b){

            if (b == 0)
                return a;
            else
                return greatDiv(b, a % b);
        }

    }
