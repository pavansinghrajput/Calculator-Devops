package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new App();
	    }


		//Edge coverage

		@Test
		public void testfact12348()
	{

		//assertEquals(,calculator.Fact(-2));
		Throwable e = null;

		try {
			calculator.Fact(-2);
		} catch (Throwable ex) {
			e = ex;
		}

		assertTrue(e instanceof ArithmeticException);
	    //assertNotEquals(2, e instanceof ArithmeticException);

	}

	@Test
	public void testfact12356578()
	{

		//assertEquals(,calculator.Fact(-2));

		assertEquals(1,calculator.Fact(1));


	}

	//Prime path coverage
	@Test
	public void testfact123578() {

		//assertEquals(,calculator.Fact(-2));

		assertEquals(1, calculator.Fact(0));

	}
	@Test
	public void testfact1235656578()
	{

		//assertEquals(,calculator.Fact(-2));

		assertEquals(2,calculator.Fact(2));


	}
	@Test
	public void testfactnormalflow()
	{

		//assertEquals(,calculator.Fact(-2));

		assertEquals(120,calculator.Fact(5));


	}

//negative cases

	@Test
	public void Ntestfact12348()
	{

		//assertEquals(,calculator.Fact(-2));
		Throwable e = null;

		try {
			calculator.Fact(-2);
		} catch (Throwable ex) {
			e = ex;
		}

		//assertTrue(e instanceof ArithmeticException);
		assertNotEquals(2, e instanceof ArithmeticException);

	}
@Test
public void Ntestfact12356578()
{

	//assertEquals(,calculator.Fact(-2));

	assertNotEquals(2,calculator.Fact(1));


}
	@Test
	public void Ntestfact123578() {

		//assertEquals(,calculator.Fact(-2));

		assertNotEquals(3, calculator.Fact(0));

	}
	@Test
	public void Ntestfact1235656578()
	{

		//assertEquals(,calculator.Fact(-2));

		assertNotEquals(-3,calculator.Fact(2));


	}
	@Test
	public void Ntestfactnormalflow()
	{

		//assertEquals(,calculator.Fact(-2));

		assertNotEquals(120,calculator.Fact(6));


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

	@Test(expected = ArithmeticException.class)
	public void testNgtfact() {

		//long expectedResult = 3628800;
		calculator.Fact(-7);
		System.out.println("Number cant be negative.");
		//Assert.assertEquals(expectedResult, result, 0);
	}

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
