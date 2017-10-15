package is.ru.stringCalculator;

import static org.junit.Assert.assertEquals;
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
}