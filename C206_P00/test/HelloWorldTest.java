import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20032049, 15 Jul 2021 3:28:42 pm
 */

public class HelloWorldTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void findMaxTest1 () {
	int[] arrA = {1,2,3,4};
	assertEquals ("test if biggest int 4 ", 4, HelloWorld.findMax(arrA));
	
	}
	@Test
	public final void findMaxTest2 () {
	int[] arrB = {-11,-3,-1,-2,-4};
	assertEquals ("test if biggest int -1 ", -1, HelloWorld.findMax(arrB));
	
	}
	

	}


