package in;

import static org.junit.Assert.*;

import org.junit.Test;

import in.kiruba.CheckAmountPaid;

public class ValidAmountPaidOrNot {
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
