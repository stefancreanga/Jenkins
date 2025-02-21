import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(0, calculator.add(-2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(5, calculator.subtract(2, -3));
        assertEquals(-4, calculator.subtract(-2, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(0, calculator.multiply(0, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.0001);
        assertEquals(-2.0, calculator.divide(6, -3), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        calculator.divide(6, 0);
    }
}
