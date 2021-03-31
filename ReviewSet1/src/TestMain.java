import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMain {
    @Test
    public void testAdd2IntegersPositiveIntegers(){
        assertEquals(6, Main.add2Integers(1, 5));
    }

    @Test
    public void testAdd2IntegersNegativeIntegers(){
        assertEquals(-1, Main.add2Integers(-6, 5));
    }

    @Test
    public void testComputeFactorial5(){
        assertEquals(120, Main.computeFactorial(5));
    }

    @Test
    public void testComputeFactorial12(){
        assertEquals(479001600, Main.computeFactorial(12));
    }

    @Test
    public void testCustomToUpperHelloWorld(){
        assertEquals("HELLO WORLD!", Main.customToUpper("hello world!"));
    }

    @Test
    public void testCustomToUpperAlreadyUpper(){
        assertEquals("ONEWORDALLCAPS", Main.customToUpper("ONEWORDALLCAPS"));
    }
}
