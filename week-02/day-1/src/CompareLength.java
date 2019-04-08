public class CompareLength {

    public static void main(String [] args) {
        int [] p1 = {1, 2, 3};
        int [] p2 = {4, 5};
        int lengthP1 = p1.length; // indexing is from 0 to n-1 so the third element is 2nd in this indexing
        int lengthP2 = p2.length; // indexing is from 0 to n-1 so the third element is 2nd in this indexing

        if (lengthP2 > lengthP1) {
            System.out.println("P2 is longer than P1");
        } else {
            System.out.println("P1 is longer than P2");
        }
    }
}
