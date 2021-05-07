package in.kiruba;

import java.util.ArrayList;

/*display the loansLists
different types of loansLists*/

public class DisplayloansLists {
	static ArrayList<String>listOfloansLists=new ArrayList<String>();
	static {
	
		
		listOfloansLists.add("House Loan");
		listOfloansLists.add("Education Loan");
		listOfloansLists.add("Agriculture Loan");
		listOfloansLists.add("Personal Loan");
		listOfloansLists.add("Gold Loan");
		listOfloansLists.add("Veicle Loan");
		
	}
	public static void display() {
		for(String displayloansLists:listOfloansLists) {
			System.out.println("****"+displayloansLists+"****");
		}
	}
	 
	

	

}
