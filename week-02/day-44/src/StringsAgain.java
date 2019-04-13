public class StringsAgain {

    public static void main(String [] args) {

        System.out.println(change("x is extra extreme"));
        System.out.println(("x is extra extreme").substring(17));

    }

    public static String change(String a) {
        int index = a.indexOf('x'); // find "x" index
//        char[] ca = a.toCharArray(); // convert string to charArray

        if(!a.contains("x")){
            return a;
        } else {
            if (index == 0){
//
            return change(a.substring(index+1)); // return part with x replaced + new part
            } else {
                return a.substring(0,index) + change(a.substring(index));
            }
        }


    }
}