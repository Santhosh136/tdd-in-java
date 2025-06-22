package test;

import main.Validation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationTest {

    private Validation validation;

    @BeforeEach
    void setUp() {
        validation = new Validation();
    }

    @Test
    public void shouldNotBeNull() {
        assertNotNull(validation);
    }

    @Test
    public void shouldReturnEmptyListForValidInput() {
        List<String> errors = validation.validate("2.3", "1.22");
        assertTrue(errors.isEmpty());
    }

    @Test void shouldThrowErrorsForInvalidInput() {
        List<String> errors = validation.validate("12.111", "12.223");
        assertEquals(2, errors.size());
        assertEquals("Too many decimal places for value 12.111", errors.getFirst());
        assertEquals("Too many decimal places for value 12.223", errors.get(1));
    }
}
