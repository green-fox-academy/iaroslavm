import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GetIndexTest {
  GetIndex testIndex = new GetIndex();


  @Test
  public void getIndexTest() {
    List<Integer> testList = new ArrayList();
    testList.add(1);
    testList.add(7);
    testList.add(3);
    testList.add(4);
    testList.add(5);
    testList.add(2);
    int test = 7;
    assertEquals(1, testIndex.getIndex(testList, test));
  }

  @Test
  public void getStringIndex() {
    List<String> testList = new ArrayList();
    testList.add("hahaha");
    testList.add("blah-blah");
    testList.add("sun");
    testList.add("moon");
    testList.add("banana");
    String test = "banana";
    assertTrue(testList.contains(test));

  }
}