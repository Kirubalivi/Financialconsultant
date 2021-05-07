package in;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.DisplayloansLists;
import in.kiruba.UserManager;

public class UserTest {
	/**
	 * test for new user registration
	 */
	@Test
	public void testFornewUser() {
		String name = "kavi";
		String password = "karthik";
		Long mobileNo = 9025967216L;
		boolean isValid = UserManager.newUserRegistration(name, password, mobileNo);
		//System.out.println(isValid);
		assertTrue(isValid);

	}
	@Test
	public void testWithCorrectLogin() {
		String name = " kiruba";
		String password = "livi";
		Long mobileNo = 9012345678L;
		boolean isValid = UserManager.validLoginDetails(name, password,mobileNo);
		

		assertTrue(isValid);
	}

//	/**
//	 * it test for correct information
//	 */
//	@Test
//	public void testWithCorrectInfo() {
//		String name = "kiruba";
//		String password = "livi";
//		Long mobileNo = 9012345678L;
//		boolean isValid = UserManager.validLogin(name, password, mobileNo);
//
//		assertTrue(isValid);
//	}

	@Test
	/** it test for InCorrectInformation
	 * 
	 */

	public void testwithIncorrectInfo() {
		String name = "kiruba";
		String password = "livi ";
		Long mobileNo = 9025967216L;
		boolean isValid = UserManager.validLogin(name, password, mobileNo);
		assertFalse(isValid);

	}
	@Test
	public void testUserLists() {
		
		boolean isValid=UserManager.displayUserLists();
		assertTrue(isValid);
	}


	/**
	 * test for Displaying the Loans
	 */
	@Test
	public void validDisplay() {
           DisplayloansLists.display();
	

	}
	
	
}
