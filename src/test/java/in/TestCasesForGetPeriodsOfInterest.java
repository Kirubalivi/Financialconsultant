package in;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.CalculateLineAmount;

public class TestCasesForGetPeriodsOfInterest {

	//TestCases for calculating months to clear debt
	@Test
	public void test() {
		int month=CalculateLineAmount.MonthForLineAmount(600000);
		assertEquals(60,month);
	}
	
	//TestCases for calculating years to clear debt
	@Test
	public void test1() {
		int year=CalculateLineAmount.YearForLineAmount(600000);
		assertEquals(5,year);
	}

}
