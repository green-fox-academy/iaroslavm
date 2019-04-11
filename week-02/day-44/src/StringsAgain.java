public class StringsAgain {

    public static void main(String [] args) {

        System.out.println(change("x is extra extreme"));
    }

    public static String change(String a) {
        int index = a.indexOf('x'); // find "x" index
//        char[] ca = a.toCharArray(); // convert string to charArray

        if(!a.contains("x")){
            return a;
        } else {
            if (index == 0){
//
            return "" + change(a.substring(index+1, a.length())); // return part with x replaced + new part
            } else {
                return a.substring(0,index) + change(a.substring(index, a.length()));
            }
        }


    }
}