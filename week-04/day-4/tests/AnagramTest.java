import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;

public class AnagramTest {
    Anagram newAnagram = new Anagram();

    @Test
    public void testIfAnagramWorks1(){
        assertTrue(newAnagram.anagram("Good","oogd"));
    }

    @Test
    public void testIfAnagramWorks2(){
        assertFalse(newAnagram.anagram("Good","Bad"));
    }
}
