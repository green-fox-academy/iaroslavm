import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountLettersTest {
    HashMap<Character,Integer> checkMap = new HashMap<>();
    COuntLetters letterMap = new COuntLetters();

    @Test
    public void checkMap(){

        assertEquals(2,letterMap.counter("Test").get('t'));
    }

    @Test
    public void checkMap2(){
        assertNotEquals(1,letterMap.counter("Test").get('t'));
    }

    @Test
    public void test2(){
        checkMap.put('t',2);
        checkMap.put('e',1);
        checkMap.put('s',1);
        assertThat(letterMap.counter("Test"), is(checkMap));
    }

}
