import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SumTest {
    SummClass newSum = new SummClass();
    Integer [] intArray = {1,2,3,4};
    Integer [] intArrayOne = {1};
    Integer [] intArrayEmpty = {};
    List<Object> intList = Arrays.asList(intArray);
    List<Object> intListOne = Arrays.asList(intArrayOne);
    List<Object> intListEmpty = Arrays.asList(intArrayEmpty);
    List<Object> listObjects = new ArrayList<>();

    @Test
    public void checkSum(){
        assertEquals(10,newSum.sum(intList));
    }

    @Test
    public void checkSumFail(){
        assertNotEquals(30,newSum.sum(intList));
    }

    @Test
    public void checkSumEmpty(){
//        System.out.println(intListEmpty.toString());
        assertEquals(0,newSum.sum(intListEmpty)); //why it equals empty?
    }

    @Test
    public void checkSumFailEmpty(){
        assertNotEquals(10,newSum.sum(intListEmpty));
    }

    @Test
    public void checkSumOne(){
//        System.out.println(intListEmpty.toString());
        assertEquals(1,newSum.sum(intListOne));
    }

    @Test
    public void checkSumFailOne(){
        assertNotEquals(10,newSum.sum(intListOne));
    }

    @Test
    public void checkSumObject(){
        listObjects.add(1);
        listObjects.add('b');
//        System.out.println(intListEmpty.toString());
        assertEquals(1,newSum.sum(listObjects));
    }

    @Test
    public void checkSumFailObject(){
        listObjects.add(1);
        listObjects.add('b');
        assertNotEquals(10,newSum.sum(listObjects));
    }

}
