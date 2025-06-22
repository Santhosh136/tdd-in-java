package test;

import main.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnInstance() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertNotNull(fizzBuzz);
    }

    @Test
    public void shouldReturnFizzForMultiplesOfThree() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(9);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    public void shouldReturnBuzzForMultiplesOfFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(20);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    public void shouldReturnFizzBuzzForBothMultiplesOfThreeAndFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(15);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    public void shouldReturnNumberIfNotMultiplesOfThreeOrFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.test(23);
        Assertions.assertEquals("23", result);

    }
}
