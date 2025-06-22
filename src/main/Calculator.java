package main;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Calculator {
    private final Validation validation;

    public Calculator(Validation validation) {
        this.validation = validation;
    }
    
    private void validate(String... input) {
        List<String> errors = validation.validate(input);
        if (!errors.isEmpty()) throw new IllegalArgumentException(errors.toString());
    }

    public String sum(String a, String b) {
        validate(a,b);
        BigDecimal i = new BigDecimal(a);
        BigDecimal j = new BigDecimal(b);
        return String.valueOf(i.add(j));
    }

    public String subtract(String a, String b) {
        validate(a,b);
        BigDecimal n = new BigDecimal(a);
        BigDecimal m = new BigDecimal(b);
        return String.valueOf(n.subtract(m));
    }

    public String multiply(String a, String b) {
        validate(a,b);
        BigDecimal n = new BigDecimal(a);
        BigDecimal m = new BigDecimal(b);
        return String.valueOf(n.multiply(m));
    }

    public String divide(String a, String b) {
        validate(a,b);
        BigDecimal n = new BigDecimal(a);
        BigDecimal m = new BigDecimal(b);
        return String.valueOf(n.divide(m, RoundingMode.CEILING));
    }
}
