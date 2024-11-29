import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    void add() {
        assertEquals(5, calc.add(2, 3), "Сложение 2 + 3 должно быть равно 5");
        assertEquals(-1, calc.add(-2, 1), "Сложение -2 + 1 должно быть равно -1");
        assertEquals(0, calc.add(0, 0), "Сложение 0 + 0 должно быть равно 0");
    }

    @Test
    void dif() {
        assertEquals(1, calc.dif(3, 2), "Вычитание 3 - 2 должно быть равно 1");
        assertEquals(-3, calc.dif(-2, 1), "Вычитание -2 - 1 должно быть равно -3");
        assertEquals(0, calc.dif(0, 0), "Вычитание 0 - 0 должно быть равно 0");
    }

    @Test
    void div() {
        assertEquals(2, calc.div(4, 2), "Деление 4 / 2 должно быть равно 2");
        assertEquals(-2, calc.div(-4, 2), "Деление -4 / 2 должно быть равно -2");

        assertThrows(ArithmeticException.class, () -> calc.div(4, 0), "Деление на 0 должно вызвать исключение");
    }

    @Test
    void times() {
        assertEquals(6, calc.times(2, 3), "Умножение 2 * 3 должно быть равно 6");
        assertEquals(-6, calc.times(-2, 3), "Умножение -2 * 3 должно быть равно -6");
        assertEquals(0, calc.times(0, 100), "Умножение 0 * 100 должно быть равно 0");
    }

    @Test
    void solver() {
        assertEquals(7, calc.solver(10, 5, 3));
        assertEquals(28, calc.solver(20, 10, 5));
        assertEquals(8, calc.solver(5, 5, 5));
    }

    @Test
    void solverLinerEquation() {
        // Тест на корректное решение уравнения
        assertEquals(1, calc.solverLinerEquation(2, 2, 4), "Уравнение 2x + 2 = 4 должно иметь решение x = 1");
        assertEquals(-3, calc.solverLinerEquation(1, 3, 0), "Уравнение x + 3 = 0 должно иметь решение x = -3");

        // Тест на выброс исключения при a = 0
        assertThrows(ArithmeticException.class, () -> calc.solverLinerEquation(0, 2, 4));
    }
}