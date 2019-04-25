import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FibonacciTest {
    Fibonacci countFibonacci = new Fibonacci();

    @Test
    public void setCountFibonacciTest(){
       assertEquals(8,countFibonacci.fibonacci(6));
    }

    @Test
    public void setCountFibonacciTest2(){
        assertNotEquals(2,countFibonacci.fibonacci(6));
    }

    @Test
    public void setCountFibonacciTest3(){
        assertNotEquals('g',countFibonacci.fibonacci(6));
    }
}
