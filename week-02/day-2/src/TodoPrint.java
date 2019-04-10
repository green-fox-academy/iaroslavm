public class TodoPrint {
    public static void main(String[] args){
        String todoText = " - Buy milk\n";
        // Add "My t
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My t
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String first = "My todo:\n";
        String third = " - Download games\n";
        String fourth = "     - Diablo\n";

        System.out.println(first + todoText + third + fourth);
    }
}