package fst;




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
        assertEquals(15.0, calculator.add(10, 5),0);
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-15.0, calculator.add(-10, -5),0);
    }

    @Test
    public void testSubtract() {
        assertEquals(5.0, calculator.subtract(10, 5), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals(50.0, calculator.multiply(10, 5), 0.0001);
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0.0, calculator.multiply(10, 0), 0);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(10, 5), 0);
    }

    @Test
    public void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}