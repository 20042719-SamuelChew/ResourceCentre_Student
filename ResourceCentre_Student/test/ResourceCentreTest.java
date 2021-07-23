import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResourceCentreTest {
	private Camcorder cc1;
	private Camcorder cc2;
	private Chromebook cb1;
	private Chromebook cb2;
	
	private ArrayList<Camcorder> camcorderList;
	private ArrayList<Chromebook> chromebookList;
	
	public ResourceCentreTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		// prepare test data
		cc1 = new Camcorder("CC0011", "Nikon HDSLR", 40);
		cc2 = new Camcorder("CC0012", "Sony DSC-RX100M7", 20);
		cb1 = new Chromebook("CB0011", "My Google Chromebook 1st", "Mac OS");
		cb2 = new Chromebook("CB0012", "SAMSUNG Chromebook 4+", "Win 10");

		camcorderList= new ArrayList<Camcorder>();
		chromebookList= new ArrayList<Chromebook>();
	}

	
	@Test
	public void testAddCamcorder() {
		// Item list is not null, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		//The item just added is as same as the first item of the list
		ResourceCentre.addCamcorder(camcorderList, cc1);		
		assertEquals("Test if that Camcorder arraylist size is 1?", 1, camcorderList.size());
		assertSame("Test that Camcorder is added same as 1st item of the list?", cc1, camcorderList.get(0));
		

		//Add another item. test The size of the list is 2?
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Test that Camcorder arraylist size is 2?", 2, camcorderList.size());
		assertSame("Test that Camcorder is added same as 2nd item of the list?", cc2, camcorderList.get(1));
	}
	
	@Test
	public void testAddChromebook() {
		//fail("Not yet implemented");
		// write your code here
		// Item list is not null, so that can add a new item
				assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
				
		//Given an empty list, after adding 1 item, the size of the list is 1
		//•The item just added is as same as the first item of the list
		ResourceCentre.addChromebook(chromebookList, cb1);		
		assertEquals("Test if that chromebook arraylist size is 1?", 1, chromebookList.size());
		assertSame("Test that chromebook is added same as 1st item of the list?", cb1, chromebookList.get(0));
				
		//Add another item. test The size of the list is 2? - normal
		//•	The item just added is as same as the 2nd item of the list
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test that chromebook arraylist size is 2?", 2, chromebookList.size());
		assertSame("Test that chromebook is added same as 1st item of the list?", cb2, chromebookList.get(1));
			}
	
	@Test
	public void testRetrieveAllCamcorder() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", camcorderList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
				String allCamcorder= ResourceCentre.retrieveAllCamcorder(camcorderList);
				String testOutput = "";
				assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);
				
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		ResourceCentre.addCamcorder(camcorderList, cc1);
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, camcorderList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allCamcorder= ResourceCentre.retrieveAllCamcorder(camcorderList);

		testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0011", "Nikon HDSLR", "Yes", "", 40);
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","CC0012", "Sony DSC-RX100M7", "Yes", "", 20);
	
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);
		
	}
	
	@Test
	public void testRetrieveAllChromebook() {
		//fail("Not yet implemented");
		// write your code here
		// Test if Item list is not null but empty, so that can add a new item
				assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
				
	//test if the list of chromebooks retrieved from the SourceCentre is empty
		String allChromebook= ResourceCentre.retrieveAllChromebook(chromebookList);
		String testOutput = "";
		assertEquals("Check that ViewAllChromebooklist", testOutput, allChromebook);
						
	//Given an empty list, after adding 2 items, test if the size of the list is 2
	ResourceCentre.addChromebook(chromebookList, cb1);
	ResourceCentre.addChromebook(chromebookList, cb2);
	assertEquals("Test if that Chromebook arraylist size is 2?", 2, chromebookList.size());
				
	//test if the expected output string same as the list of chromebooks retrieved from the SourceCentre
			
	allChromebook= ResourceCentre.retrieveAllChromebook(chromebookList);

testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n","CB001", "ASUS Chromebook", "Yes", "","Win 10");
testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n","CB002", "HP Chromebook", "Yes", "","Win 10");
			
//assertEquals("Check that ViewAllCamcorderlist", testOutput, allChromebook);
						
	}

	@Test
	public void testDoLoanCamcorder() {
		//fail("Not yet implemented");
		// write your code here
		
		ResourceCentre.addCamcorder(camcorderList, cc1);
		ResourceCentre.addCamcorder(camcorderList, cc2);
	
	// Item list is not null, a newly added item can be loaned out.
		assertNotNull("Test that list is not null", camcorderList);
		
	//test if new item can be loaned out successfully.
		boolean loan1 = ResourceCentre.doLoanCamcorder(camcorderList,"cc0011", "01/12/1999");
		
assertTrue("Test if item can be successfully loaned", loan1);

//test if item availability is updated accordingly to false for loaned item.
assertFalse("Test that itemAvailability is false when, loaned out", cc1.getIsAvailable());

//Test that after item is loaned, item cannot be loaned again.
boolean loan2 = ResourceCentre.doLoanCamcorder(camcorderList,"cc0011", "01/12/1999");

assertFalse("Test that cc1 cannot be loaned again", loan2);
		
	}
	
	@Test
	public void testDoLoanChromebook() {
		//fail("Not yet implemented");
		// write your code here
		ResourceCentre.addChromebook(chromebookList, cb1);
		ResourceCentre.addChromebook(chromebookList, cb2);
	
	// Item list is not null, a newly added item can be loaned out.
		assertNotNull("Test that list is not null", chromebookList);
		
	//test if new item can be loaned out successfully.
	boolean loan1 = ResourceCentre.doLoanChromebook(chromebookList,"cb0011", "01/12/1999");
		
assertTrue("Test if item can be successfully loaned", loan1);

//test if item availability is updated accordingly to false for loaned item.
assertFalse("Test that itemAvailability is false when, loaned out", cb1.getIsAvailable());

//Test that after item is loaned, item cannot be loaned again.
boolean loan2 = ResourceCentre.doLoanChromebook(chromebookList,"cb0011", "01/12/1999");

assertFalse("Test that cb1 cannot be loaned again", loan2);
	}
	
	@Test
	public void testDoReturnCamcorder() {
		//fail("Not yet implemented");
		// write your code here
		ResourceCentre.addCamcorder(camcorderList, cc1);
		ResourceCentre.addCamcorder(camcorderList, cc2);
	
	// Item list is not null, a newly added item cannot be returned successfully.
		assertNotNull("Test that list is not null", camcorderList);
		
	//test that a newly added item cannot be returned successfully.	
		
		boolean return1 = ResourceCentre.doReturnCamcorder(camcorderList,"cc0011");	
assertFalse("Test that item cannot be returned", return1);

//Test that item can be return if the availability is false.
ResourceCentre.doLoanCamcorder(camcorderList,"cc0011", "01/12/1999");

boolean return2 = ResourceCentre.doReturnCamcorder(camcorderList,"cc0011");
assertTrue("Test that item can be return if the availability is false.", return2);


//Test that after item is returned, item can be loaned again.
boolean loan1 = ResourceCentre.doLoanCamcorder(camcorderList,"cc0011", "01/12/1999");

assertTrue("Test that after item is returned, item can be loaned again", loan1);
	
}
	
	@Test
	public void testDoReturnChromebook() {
		//fail("Not yet implemented");
		// write your code here
		ResourceCentre.addChromebook(chromebookList, cb1);
		ResourceCentre.addChromebook(chromebookList, cb2);
	
	// Item list is not null, a newly added item cannot be returned successfully.
		assertNotNull("Test that list is not null", chromebookList);
		
//test that a newly added item cannot be returned successfully.		
boolean return1 = ResourceCentre.doReturnChromebook(chromebookList,"cb0011");	

assertFalse("Test that item cannot be returned", return1);

//Test that item can be return if the availability is false.
ResourceCentre.doLoanChromebook(chromebookList,"cb0011", "01/12/1999");
boolean return2 = ResourceCentre.doReturnChromebook(chromebookList,"cb0011");

assertTrue("Test that item can be return if the availability is false.", return2);


//Test that after item is returned, item can be loaned again.
boolean loan1 = ResourceCentre.doLoanChromebook(chromebookList,"cb0011", "01/12/1999");

assertTrue("Test that after item is returned, item can be loaned again", loan1);
	
	}
	
	
	@After
	public void tearDown() throws Exception {
		cc1 = null;
		cc2 = null;
		cb1 = null;
		cb2 = null;
		camcorderList = null;
		chromebookList = null;

	}

}
