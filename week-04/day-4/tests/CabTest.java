import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CabTest {
  CAB cab;
  int number;

  @Test
  public void checkCAB() {
    cab = new CAB();
    assertEquals(8,cab.play(2222,2222));
  }

  @Test
  public void checkCABlong() {
    cab = new CAB();
    assertNotEquals(8,cab.play(2222,1112222));
  }
}
