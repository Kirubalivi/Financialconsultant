package in.kiruba;
/*
 * calculate Line Amount
 */

public class CalculateLineAmount {
	static int price = 0;

	public static boolean amountPaidOrNot(int amount, int lineAmount) {
		boolean isValid = false;
		for (int i = 1; i <= 12; i++) {
			amount = amount - lineAmount;
			isValid = CheckAmountPaidOrNot.amountPaidOrNot(amount);

		}
		return isValid;
	}

	public static int MonthForLineAmount(int amount) {
		int month = 0;
		if (amount > 0) {
			month = amount / 10000;

		}

		return month;

	}

	public static int YearForLineAmount(int amount) {
		int month = 0;
		int years = 0;
		if (amount > 0) {
			month = amount / 10000;

			years = month / 12;

		}

		return years;

	}

	public static boolean amountPaidOrNot2(int amount, int lineAmount) {
		boolean isValid = false;
		for (int i = 1; i <= 12; i++) {
			amount = amount - lineAmount;
			isValid = CheckAmountPaidOrNot.amountPaidOrNot(amount);

		}
		return isValid;
	}

}
