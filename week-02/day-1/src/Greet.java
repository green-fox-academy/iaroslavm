public class Greet {

    public static void main(String [] args) {
        String al = "Greenfox";
        System.out.println(greet(al)); //it is not necessary to create a return variable you can pass it straigh to the print

    }
    public static String greet(String a) {
        return ("Greetings, dear " + a);
    }
}
