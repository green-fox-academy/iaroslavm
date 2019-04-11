public class Xstring {

    public static void main(String[] args) {

//        String newString = "xxx yyy kkk";
//        System.out.println(newString.indexOf('x'));
//        System.out.println(newString.indexOf('x'));
//
//        char[] charArray = newString.toCharArray();
//        charArray[0] = 'k';
//        String outputString = new String(charArray);
//
//
//        System.out.println(outputString);

        System.out.println(change("x is extra extreme"));
    }

    public static String change(String a) {
        int index = a.indexOf('x'); // find "x" index
        char[] ca = a.toCharArray(); // convert string to charArray

        if(!a.contains("x")){
            return a;
        } else {
            ca[index] = 'y'; // change "x" index to "y"
            String nca = new String(ca); // convert new charArray back to string
            return nca.substring(0,index +1) +change(a.substring(index + 1, a.length())); // return part with x replaced + new part
        }


    }
}
