import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give the long string:");
        String longStr = scanner.nextLine();

        System.out.println("Please give the short string:");
        String shortStr = scanner.nextLine();

        int index = longStr.indexOf(shortStr);

        if (index != -1) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }


    }



    public static int subStr(String input, String q) {
        return -1;
    }
}
