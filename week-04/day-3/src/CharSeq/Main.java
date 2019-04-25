package CharSeq;

public class Main {
    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("Hubbabubba");
        System.out.println(gnirts.length());
        System.out.println(gnirts.charAt(9));
        System.out.println(gnirts.subSequence(0,5));
    }
}
