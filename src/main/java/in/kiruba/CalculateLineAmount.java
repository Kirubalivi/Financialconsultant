package in.kiruba;
/*
 * calculate Line Amount
 */

public class CalculateLineAmount {
static int price=0;
	public static boolean amountPaidOrNot(int amount,int lineAmount) {
		boolean isValid=false;
		for(int i=1;i<=12;i++) {
			amount=amount-lineAmount;
			isValid=CheckAmountPaidOrNot.amountPaidOrNot(amount);
			
			
		    
				
		}return isValid;
	}

		
		
		
		
	

	}

	
