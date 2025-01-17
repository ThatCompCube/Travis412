package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	public void testSubraction() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
	public void testMultiplication() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(6, 2), 12);
	}
	public void testDivision() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(9, 3), 2);
	}
}
