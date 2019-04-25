import java.util.ArrayList;
import java.util.List;

public class SummClass {

    public int sum (List<Object> list){
        int sum = 0;

        for(Object each : list){
            sum += (int) each;
        }
        return sum;
    }
}
