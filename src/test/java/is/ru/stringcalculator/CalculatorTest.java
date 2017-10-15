package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{

	@Test //1
    public void testEmptyString() {
        assertEquals(0, Calculator.add(""));
    }
  @Test //1
    public void testOneString() {
        assertEquals(1, Calculator.add("1"));
    }
  @Test //2
    public void testTwoString() {
        assertEquals(3, Calculator.add("1,2"));
    }
  @Test //3
    public void testMultipleString() {
        assertEquals(8, Calculator.add("1,2,3,2"));
    }
  @Test //4
    public void testMultipleLinesString() {
        assertEquals(8, Calculator.add("1,2\n3,2"));
    }
	@Test //5
    public void testNegativeSting() {
			String message = null;
			try
			{
					Calculator.add("-1,2\n3,-2");
			}
			catch(Exception e)
			{
					message = e.getMessage();
			}
			assertEquals("Negatives not allowed: -1,-2", message);
		}
		@Test //6
	    public void testTooLargeString() {
	        assertEquals(2009, Calculator.add("1,6,3,1000,1002,999"));
	    }

}
