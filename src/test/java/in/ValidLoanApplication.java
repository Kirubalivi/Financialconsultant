package in;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.LoanApplication;

public class ValidLoanApplication {
	@Test
	/**
	 * valid user correct details in LoanApplication
	 */
	public void testWithCorrectDetails() {
		String name = "kiruba";
		String FatherName = "rangaraj";
		Long mobileno = 9025967216L;
		int age=21;
		long adharno=3089123423456789l;
		String address="1/2442,sakthinagar,coimbatore";
		String email="kirubarangaraj15@gmail.com";
		String gender="female";
		//boolean isValid=LoanApplication.displayLoans(name, FatherName,age,gender,email,mobileno,adharno,address);
		boolean isValid = LoanApplication.validDiplayApplicationForm(name, FatherName,age,gender,email,mobileno,adharno,address);
		System.out.println(isValid);
		assertTrue(isValid);
	}
	@Test
	/**
	 * valid user incorrect details in Loanapplication
	 */
	public void testWithInCorrectDetails() {
		String name = "kiruba";
		String FatherName = "livi";
		Long mobileno = 9025967216L;
		int age=21;
		long adharno=3089123423456789l;
		String address="1/2442,sakthinagar,coimbatore";
		String email="kirubarangaraj15@gmail.com";
		String gender="female";
		//boolean isValid=LoanApplication.displayLoans(name, FatherName,age,gender,email,mobileno,adharno,address);
		boolean isValid = LoanApplication.validDiplayApplicationForm(name, FatherName,age,gender,email,mobileno,adharno,address);
		//System.out.println(isValid);
		assertFalse(isValid);
	

     }

	

}
