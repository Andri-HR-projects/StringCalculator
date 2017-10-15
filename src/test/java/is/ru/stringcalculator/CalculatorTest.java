package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test //1
    public void testEmptyString() {
        assertEquals(0, Calculator.add(""));
    }
}
