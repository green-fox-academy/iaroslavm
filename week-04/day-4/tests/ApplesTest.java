import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplesTest {
    Apples apple = new Apples();

    @Test
    public void checkApples(){
        System.out.println("This test is running");
        assertEquals("apple",apple.getApple());
//        assertEquals("orange",apple.getApple());

    }


}
