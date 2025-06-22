package test;

import main.Greetings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreetingsTest {
    @Test
    public void shouldReturnInstanceOfGreetings() {
        Greetings greetings = new Greetings();
        Assertions.assertNotNull(greetings);
    }

    @Test
    public void shouldReturnHelloWhenHelloIsCalled() {
        Greetings greetings = new Greetings();
        String result = greetings.hello();
        Assertions.assertEquals("Hello", result);
    }
}
