package test;

import main.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Test FizzBuzz class")
public class FizzBuzzTest {

    @DisplayName("Test instance is not null")
    @Test
    public void shouldReturnInstance() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertNotNull(fizzBuzz, "Instance should not be null");
    }

    @Test
    public void shouldReturnFizzForMultiplesOfThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(9);
        assertEquals("Fizz", result, "Fizz should be returned");
    }

    @Test
    public void shouldReturnBuzzForMultiplesOfFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "Buzz";
        int input = 20;
        String result = fizzBuzz.test(input);
        assertEquals(expected, result, () -> expected + " should be returned for input " + input);
    }

    @Test
    public void shouldReturnFizzBuzzForBothMultiplesOfThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(15);
        assertEquals("FizzBuzz", result, "FizzBuzz should be returned");
    }

    @Test
    public void shouldReturnNumberIfNotMultiplesOfThreeOrFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(23);
        assertEquals("23", result, "Number should be returned");

    }
}
