import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-10, calculator.add(-5, -5));
    }

    @Test
    void dif() {
        assertEquals(1, calculator.dif(3, 2));
        assertEquals(-2, calculator.dif(1, 3));
        assertEquals(0, calculator.dif(5, 5));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(6, 3));
        assertEquals(-2, calculator.div(-6, 3));
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    void times() {
        assertEquals(6, calculator.times(2, 3));
        assertEquals(0, calculator.times(0, 3));
        assertEquals(-15, calculator.times(-3, 5));
    }

    @Test
    void solver() {
        assertEquals(45, calculator.solver());
    }
}