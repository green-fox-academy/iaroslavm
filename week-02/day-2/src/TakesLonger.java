public class TakesLonger {
    public static void main(String [] args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String iSub1 = quote.substring(0,20);
        int iSub2 = quote.lastIndexOf('.');
        String iSub3 = quote.substring(21,iSub2+1);
        String newString = "always takes longer than";

        String fin = iSub1 + " " +newString + " " + iSub3;


        System.out.println(fin);
    }
}