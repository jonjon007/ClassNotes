import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RunnerTestIGuess {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
		boolean a = true;
		boolean b = false;
		double num = 5*6/7+2;
		double expectedValue = 5.625;
		assertTrue(a);
		assertFalse(b);
		assertEquals(a, true);
		assertEquals(num, expectedValue, 0.5);
	}

}
