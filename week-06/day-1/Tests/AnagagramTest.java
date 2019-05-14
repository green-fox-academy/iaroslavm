import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagagramTest {
  Anagagram anagram;

  @Before
  public void before() {
    anagram = new Anagagram();
  }

  @Test
  public void isAnagramTest() {
    assertTrue(anagram.isAnagram("Abrakadabra", "KadabraAbra"));
  }
}