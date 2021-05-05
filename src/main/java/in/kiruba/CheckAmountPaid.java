package in.kiruba;

public class CheckAmountPaid {
static int price=0;
	public static boolean amountPaidOrNot(int amount,int lineAmount) {
	 //  public static int price=0;
		boolean isValid=false;
		for(int i=1;i<=12;i++) {
			amount=amount-lineAmount;
			System.out.println(i);
			System.out.println(lineAmount);
			System.out.println(amount);
		    
				
		}
		if(amount==0)
		{
			isValid=true;
		}
		return isValid;
		
		
		
	}

	public static void main(String[] args) {
		System.out.println(amountPaidOrNot(12000,1000));
		// TODO Auto-generated method stub

	}

}
