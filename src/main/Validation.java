package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Validation {
    public List<String> validate(String... input) {
        List<String> errors = new ArrayList<>();
        for (String s : input) {
            if (new BigDecimal(s).scale() > 2)
                errors.add("Too many decimal places for value " + s);
        }
        return errors;
    }
}
