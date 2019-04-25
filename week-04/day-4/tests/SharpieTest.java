import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SharpieTest {
    Sharpie mySharpie;


    @Test
    public void test1() {
        mySharpie = new Sharpie("black",2);
        assertEquals(2, mySharpie.getInkAmount());
    }

    @Test
    public void test2() {
        mySharpie = new Sharpie("black",2);
        assertEquals(2, mySharpie.getWidth());
    }

    @Test
    public void test3() {
        mySharpie = new Sharpie("black",2);
        assertEquals("black", mySharpie.getColor());
    }

    @Test
    public void test4() {
        mySharpie = new Sharpie("black",2);
        mySharpie.use();
        assertEquals(1, mySharpie.getInkAmount());
    }
}
