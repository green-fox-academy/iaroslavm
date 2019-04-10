import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonalFinance {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(500);
        list.add(1000);
        list.add(1250);
        list.add(175);
        list.add(800);
        list.add(120);

        //1: sum

        Integer sum = 0;

        for (Integer element : list) {
            sum += element;
        }
        System.out.println("Total expense is " + sum);
        //2. sort
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Smallest expense is " + list.get(0));
        System.out.println("Largest expense is " + list.get(list.size()-1));
        int average = sum/list.size();
        System.out.println("Average expense is " + average);


    }
}
