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
	public void test() {
		//fail("Not yet implemented");
        System.out.println("This is the testcase for HelloWorld");
        String str1="This is the testcase for HelloWorld";
        String str2="This is the testcase for HelloWorld";
        assertEquals(str1, str2);

	}

}
