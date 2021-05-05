package in.kiruba;

import java.util.ArrayList;
/*display the loans
different types of loans*/
public class DisplayLoans {
	static ArrayList<String>listOfLoans=new ArrayList<String>();
	static {
		//String status="loans";
		listOfLoans.add("---House Loan---");
		listOfLoans.add("---Education Loan---");
		listOfLoans.add("---Agriculture Loan---");
		listOfLoans.add("---Personal Loan---");
		listOfLoans.add("---Gold Loan---");
		listOfLoans.add("---Veicle Loan---");
		
	}
	public static void display() {
		for(String displayloans:listOfLoans) {
			System.out.println(displayloans);
		}
	}
	 
	

	

}
