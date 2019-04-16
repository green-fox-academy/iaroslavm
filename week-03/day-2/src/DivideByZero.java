import java.sql.SQLOutput;

public class DivideByZero {

    public static void main(String[] args) {

        theDivider(10);

    }

    public static void theDivider(int a) {
        int result = 0;

        try {
            result = a / 0;

        } catch (ArithmeticException e){
            System.out.println("You might be dividing " + a + " by zero. So it's a fail." + "\n");
        } finally {
            System.out.println("Program out");
        }
    }
}
