package is.ru.stringCalculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest{

	@Test
	public void testEmptyString(){
		assertEquals(0,Calculator.add(""));
	}

	@Test
	public void stringOneItem(){
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void stringTwoItem(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void stringMultiItem(){
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void stringNewLineItem(){
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test
	public final void stringNegativeItem() {
		RuntimeException ex = null;
		try {
			Calculator.add("3,-6,15,-18,46,33");
		} 
		catch (RuntimeException e) {
			ex = e;
		}
		assertNotNull(ex);
		assertEquals("Negatives not allowed: [-6, -18]", ex.getMessage());
	}

	@Test
	public void stringIgnoreOver1k(){
		assertEquals(2, Calculator.add("1001,2"));
	}
}