package test;

import main.Calculator;
import main.Validation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        Validation validation = new Validation();
        calculator = new Calculator(validation);
    }

    @Test
    public void shouldReturnCalculatorInstance() {
        assertNotNull(calculator);
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        String result = calculator.sum("1.11", "2.22");
        assertEquals("3.33", result);
    }

    @Test
    public void shouldReturnSumOfTwoNumbersWhenBothAreNegative() {
        String result = calculator.sum("-1.11", "-2.22");
        assertEquals("-3.33", result);
    }

    @Test
    public void shouldThrowExceptionForMoreThanTwoDecimalScalesPassedForSum() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum("1.111", "2.22"));
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        String result = calculator.subtract("2.22", "1.11");
        assertEquals("1.11", result);
    }

    @Test
    public void shouldSubtractTwoNumbersWhenBothAreNegative() {
        String result = calculator.subtract("-2.22", "-1.11");
        assertEquals("-1.11", result);
    }

    @Test
    public void shouldThrowExceptionForMoreThanTwoDecimalScalesPassedForSubtraction() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum("1.111", "2.22"));
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        String result = calculator.multiply("2.2", "3.4");
        assertEquals("7.48", result);
    }

    @Test
    public void shouldMultiplyTwoNumbersWithNegative() {
        String result = calculator.multiply("-4", "2");
        assertEquals("-8", result);
    }

    @Test
    public void shouldThrowExceptionForMoreThanTwoDecimalScalesPassedForMultiply() {
        assertThrows(IllegalArgumentException.class, () -> calculator.multiply("1.233", "2.22"));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        String result = calculator.divide("24.24", "2.2");
        assertEquals("11.02", result);
    }

    @Test
    public void shouldThrowExceptionForMoreThanTwoDecimalScalesPassedForDivision() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide("1.233", "2.22"));
    }

    @Test
    public void shouldThrowExceptionForZeroDivisor() {
        assertThrows(ArithmeticException.class, () -> calculator.divide("3", "0"));
    }


}
