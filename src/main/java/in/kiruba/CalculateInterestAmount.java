package in.kiruba;
import java.util.*;
public class CalculateInterestAmount {
	public static int amount;
	/**
	 * Calculate Interest Amount for house loan
	 * @param amount
	 * @return
	 */
	public static int HouseLoan(int amount) {
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
	 * 
	 * @param amount
	 * @return
	 */
	
	public static int CalculationofEducation(int amount) {
		int interestamount=0;
		if(amount<=150000) {
			interestamount=(amount*1)/100;
		}
		return interestamount;
		
		
	}
	public static int CalculationOfAgriculture(int acre,int amount) {
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
	public static int CalculationofGold(String goldtype,int quantityofgold) {
		int interestamount=0;
		
		if(goldtype=="22k") {
			amount=(quantityofgold*4380);
			interestamount=(amount*1)/100;
		}
		else if(goldtype=="24k") {
			amount=(quantityofgold*4599);
			interestamount=(amount*1)/100;
		}
		//return amount;
		return interestamount;
	}
	public static int CalculationofVeicle(String vehicletype,int amount) {
		int interestamount=0;
		//System.out.println(vehicletype +amount);
		if((vehicletype=="twoWheeler") && (amount>=50000 && amount<=200000))
			{
			//System.out.println("hii");
				interestamount=(amount*2)/100;
				//System.out.println("INT" + interestamount);
			}
		else if(vehicletype=="fourWheeler" && amount>200000 && amount<1000000) {
					interestamount=(amount*4)/100;
			}
			
	return interestamount;
	}



}
