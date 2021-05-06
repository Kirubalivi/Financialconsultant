package in.kiruba;
public class CalculateInterestAmount {
	
	/**
	 * Calculate Interest Amount for house loan
	 * 10L-2%
	 * 25L-3%
	 * 50L-5%
	 * @param amount
	 * @return
	 */
	public static int houseLoan(int amount) {
		int interestamount=0;
		if(amount==1000000) {
			 interestamount=(amount*2)/100;
			
		}else if(amount==2500000) {
			interestamount=(amount*3)/100;
		}
		else if(amount==5000000) {
			interestamount=(amount*5)/100;
			
		}
	return interestamount;
	}
	/**
	 * calculate interest amount for Education loan
	 * @param amount
	 * @return
	 */
	
	public static int calculationOfEducation(int amount) {
		int interestamount=0;
		if(amount<=150000) {
			interestamount=(amount*1)/100;
		}
		return interestamount;
		
		
	}
	/**
	 * calculate interest amount for AgricultureLoan
	 * @param acre
	 * @param amount
	 * @return
	 */
	public static int calculationOfAgriculture(int acre,int amount) {
		int interestamount=0;
		
		if((acre<=3) && (amount<=200000)) {
				interestamount=(amount*1)/100;
				
			
		}
		if(((acre>=4 )&& (acre<=10)) &&((amount>=300000) && (amount<=650000)))
		//if((acre>=4) && (acre<=10))
		
		{
			 System.out.println(acre+	" "+amount);
				interestamount=(amount*2)/100;
			
		}
		if((acre>=11 || acre<=20) && (amount>=660000 && amount<=1000000)) {
				interestamount=(amount*3)/100;
			
		}return interestamount;
		
	}
	/**
	 * calculate interest Amount for goldloan
	 * @param goldtype
	 * @param quantityofgold
	 * @return
	 */
	public static int calculationofGold(String goldtype,int quantityofgold) {
		int interestamount=0,amount;
		
		if(goldtype.equals("22k")) {
			amount=(quantityofgold*4380);
			interestamount=(amount*1)/100;
		}
		else if(goldtype.equals("24k")) {
			amount=(quantityofgold*4599);
			interestamount=(amount*1)/100;
		}
		//return amount;
		return interestamount;
	}
	/**
	 * calculate interest Amount for vehicle loan
	 * @param vehicletype
	 * @param amount
	 * @return
	 */
	public static int calculationOfVeicle(String vehicletype,int amount) {
		int interestamount=0;
		
		if((vehicletype.equals("twoWheeler") && amount>=50000 && amount<=200000))
			{
			
				interestamount=(amount*2)/100;
				
			}
		else if(vehicletype.equals("fourWheeler") && amount>200000 && amount<1000000) {
					interestamount=(amount*4)/100;
			}
			
	return interestamount;
	}



}
