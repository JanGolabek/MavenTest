import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    @Test
    public void convertOneToI() {
        assertEquals("I", romanNumbers(1));
    }

    @Test
    public void convertTwoToII() {
        assertEquals("II", romanNumbers(2));
    }

    private String romanNumbers(int Number) {
       return "I" ;
    }
}
