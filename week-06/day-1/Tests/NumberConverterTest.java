import org.junit.Test;

import static org.junit.Assert.*;

public class NumberConverterTest {
  NumberConverter testConverter;

  @Test
  public void numberWord() {
    testConverter = new NumberConverter();
    assertEquals("eight", testConverter.numberWord(8));
  }

  @Test
  public void twoDigitTest() {
    testConverter = new NumberConverter();
    assertEquals("two hundred twenty one", testConverter.numberWord(221));
  }
}