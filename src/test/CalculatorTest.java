package test;



import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
//	@Test
//	public void testSumMethod() throws Exception {
//		double a = 4.0;
//		double b = 7.0;
//			double result = classUnderTest.sum(a, b);
//			
//			assertEquals(11.0,result,0.001);
//				
//	}

//	@Test
//	public void testSubtractMethod() throws Exception {
//		double a = 3.0;
//		double b = 7.0;
//			double result = classUnderTest.subtract(a, b);
//			
//			assertEquals(-4.0,result,0.001);
//				
//	}
	
//	@Test
//	public void testMultiplyMethod() throws Exception {
//		double a = 3.0;
//		double b = 7.0;
//			double result = classUnderTest.multiply(a, b);
//			
//			assertEquals(21.0,result,0.001);
//				
//	}
	
	@Test
	public void testDivideMethod() throws Exception {
		double a = 10.0;
		double b = 2.0;
			double result = classUnderTest.divide(a, b);
			
			
			assertEquals(5.0,result,0.001);
			assertFalse(b==0);
			
	}	
	
	@Test (expected = IllegalArgumentException.class)
	public void testDivideMethod2() throws Exception {
		double a = 10.0;
		double b = 0.0;
			
			classUnderTest.divide(a, b);
	}	
	
	
	
	
	
}
