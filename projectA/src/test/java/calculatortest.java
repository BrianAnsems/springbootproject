import calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class calculatortest{

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result = calculator.add(6, 4);

        assertEquals(10, result);
    }

    @Test
	public void testSubtract() {
	    Calculator calculator = new Calculator();

	    int result = calculator.subtract(6, 4);

	    assertEquals(2, result);
	}

    @Test
	public void testMultiply() {
	    Calculator calculator = new Calculator();

	    int result = calculator.multiply(6, 4);

	    assertEquals(24, result);
	}

    @Test
	public void testDivide() {
	    Calculator calculator = new Calculator();

	    int result = calculator.divide(8, 4);

	    assertEquals(2, result);


	    try{
	    	assertEquals(true, calculator.divide(1,0));
	    	fail("An Exception should be given.");
		}catch(ArithmeticException e){

		}
		
	
    }

}