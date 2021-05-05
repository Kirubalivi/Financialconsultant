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
		Long mobileno = 9025967216L;
		boolean isValid = UserManager.NewUserRegistration(name, password, mobileno);
		System.out.println(isValid);
		assertTrue(isValid);

	}

	/**
	 * it test for correct information
	 */
	@Test
	public void testWithCorrectInfo() {
		String name = "kiruba";
		String password = "livi";
		Long mobileno = 9012345678L;
		boolean isValid = UserManager.ValidLogin(name, password, mobileno);

		assertTrue(isValid);
	}

	@Test
	/** it test for Incorrectinformation
	 * 
	 */

	public void testwithIncorrectInfo() {
		String name = "kiruba";
		String password = "livi ";
		Long mobileno = 9025967216L;
		boolean isValid = UserManager.ValidLogin(name, password, mobileno);
		assertFalse(isValid);

	}

	@Test
	/**
	 * Dispaly the Loans
	 */

	public void validDisplay() {
		DisplayLoans.Display();

	}
	
	@Test
	/**
	 * chaec InterestAmount for HomeLoan
	 */

	public void test1HomeLoan() {
		int amount=1000000;
		int interest=CalculateInterestAmount.HouseLoan(amount);
		assertEquals(20000,interest);
		

	}
	@Test
	public void test2HomeLoan() {
		int amount=2500000;
		int interest=CalculateInterestAmount.HouseLoan(amount);
		assertEquals(75000,interest);
		

	}
	@Test
	public void test3HomeLoan() {
		int amount=5000000;
		int interest=CalculateInterestAmount.HouseLoan(amount);
		assertEquals(250000,interest);
		

	}
	/**
	 * check InterestAmount for EducationLoan
	 */
	@Test
	public void testEducationLoan() {
		//int amount=150000;
		int interest=CalculateInterestAmount.CalculationofEducation(150000);
		assertEquals(1500,interest);
		

	}
	@Test
	/**
	 * valid interestAmount for AgricultureLoan
	 */
	public void test1AgricultureLoan() {
		//int amount=200000;
		//int acre=2;
		int interest=CalculateInterestAmount.CalculationOfAgriculture(2,200000);
		assertEquals(2000,interest);
	}
	@Test
	public void test2AgricultureLoan() {
		int amount=500000;
		int acre=5;
		int interest=CalculateInterestAmount.CalculationOfAgriculture(acre,amount);
		assertEquals(10000,interest);
	}
	@Test
	public void test3AgricultureLoan() {
		int amount=800000;
		int acre=15;
		int interest=CalculateInterestAmount.CalculationOfAgriculture(acre,amount);
		assertEquals(24000,interest);
	}
	@Test
	/**
	 * check InterestAmount for goldLoan
	 */
	public void test1GoldLoan() {
		int amount=4380;
		String gram="22k";
		int Gram=8;
		int interest=CalculateInterestAmount.CalculationofGold(gram,Gram);
		assertEquals(350,interest);
	}
	@Test
	public void test2GoldLoan() {
		int amount=4599;
		String gram="24k";
		int Gram=8;
		int interest=CalculateInterestAmount.CalculationofGold(gram,Gram);
		assertEquals(367,interest);
	}
	@Test
	/**
	 * valid InterestAmount for vehicle loan
	 */
	public void test1VeicleLoan() {
		//int amount=150000;
		//String veicleType="twoWheeler";
		int interest=CalculateInterestAmount.CalculationofVeicle("twoWheeler",150000);
		assertEquals(3000,interest);
	}
	@Test
	public void test2VeicleLoan() {
		int amount=700000;
		String veicleType="fourWheeler";
		int interest=CalculateInterestAmount.CalculationofVeicle(veicleType,amount);
		assertEquals(28000,interest);
	}
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
		LoanApplication.displayLoans(name, FatherName,age,gender,email,mobileno,adharno,address);
		boolean isValid = LoanApplication.ValidDiplayApplicationForm(name, FatherName,age,gender,email,mobileno,adharno,address);
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
		LoanApplication.displayLoans(name, FatherName,age,gender,email,mobileno,adharno,address);
		boolean isValid = LoanApplication.ValidDiplayApplicationForm(name, FatherName,age,gender,email,mobileno,adharno,address);
		//System.out.println(isValid);
		assertFalse(isValid);
	

     }
	@Test
	/**
	 * valid user will be amount paid or not
	 */
	public void testAmountPaidOrNot() {
		int amount=12000;
		int lineAmount=1000;
		boolean isValid=CheckAmountPaid.amountPaidOrNot(amount,lineAmount);
		assertTrue(isValid);
		

	}
}
