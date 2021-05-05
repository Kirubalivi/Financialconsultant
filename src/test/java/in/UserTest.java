package in;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import in.kiruba.CalculateInterestAmount;
import in.kiruba.CheckAmountPaid;
import in.kiruba.DisplayLoans;
import in.kiruba.LoanApplication;
import in.kiruba.User;
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

	/**
	 * it test for correct information
	 */
	@Test
	public void testWithCorrectInfo() {
		String name = "kiruba";
		String password = "livi";
		Long mobileNo = 9012345678L;
		boolean isValid = UserManager.validLogin(name, password, mobileNo);

		assertTrue(isValid);
	}

	@Test
	/** it test for Incorrectinformation
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
	/**
	 * Dispaly the Loans
	 */

	public void validDisplay() {
		DisplayLoans.display();

	}
	
	
}
