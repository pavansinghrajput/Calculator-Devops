package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new App();
	    }

		@Test
	    public void testSqeroot() {
	        double a = 4.0;

	        double expectedResult = 2.0;
	        double result = calculator.Sqeroot(a);
	        Assert.assertEquals(expectedResult, result, 0);
	    }
	@Test
	public void testNegsqeroot() {
		double a = -2;

		String expectedResult = "NaN";
		double result = calculator.Sqeroot(a);
		//if(result.equals(expectedResult)==true);

		Assert.assertEquals(expectedResult, String.valueOf(result));
	}



		
		@Test
		public void testFact() {
			long a = 10;

	        long expectedResult = 3628800;
	        double result = calculator.Fact(a);
	        Assert.assertEquals(expectedResult, result, 0);
		}

	/*@Test(expected = ArithmeticException.class)
	public void testNgtfact() {

		//long expectedResult = 3628800;
		calculator.Fact(-7);
		System.out.println("Number cant be negative.");
		//Assert.assertEquals(expectedResult, result, 0);
	}
*/
	@Test
	public void testLoge() {
		double a = 1;

		double expectedResult = 0.0;
		double result = calculator.Loge(a);
		Assert.assertEquals(expectedResult, result, 0.0001);
	}

	@Test
	public void testLogezero() {
		double a = 0;

		String expectedResult = "-Infinity";
		double result = calculator.Loge(a);
		Assert.assertEquals(expectedResult, String.valueOf(result));
	}

	@Test
	public void testLogeneg() {
		double a = -15;

		String expectedResult = "NaN";
		double result = calculator.Loge(a);
		//if(result.equals(expectedResult)==true);

		Assert.assertEquals(expectedResult, String.valueOf(result));
	}
		
		@Test
		public void testPowe() {
			double a = 7;
	        double b = 3;
	        double expectedResult = 343;
	        double result = calculator.Powe(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}

	@Test
	public void testPowezero() {
		double a = 0;
		double b = 0;
		double expectedResult = 1;
		double result = calculator.Powe(a, b);
		Assert.assertEquals(expectedResult, result, 0);
	}


		

		
		/*@Test(expected = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        int a = 25;
	        int b = 0;
	        calculator.Divide(a, b);
	    }*/
}
