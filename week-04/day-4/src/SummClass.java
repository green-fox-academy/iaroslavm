import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SummClass {

    public int sum (List<Object> list){
        int sum = 0;

        for(Object each : list){
//            if (each == null) {
//                each = 0;
//            }
//            if (each instanceof java.lang.String) {
//                each = 0; // I can do this assignment because each is an Object in the firts place
//            }
            sum += (int) each;
        }
        return sum;
    }
}
