package in.kiruba;

import java.util.ArrayList;

public class LoanApplication {
	  static ArrayList<User> detailLists=new ArrayList<User>();
	 /**
	  * add details into ArrayList using user4 object
	  * @param name
	  * @param fatherName1
	  * @param age
	  * @param gender1
	  * @param email1
	  * @param mobileNo1
	  * @param adharNo1
	  * @param address1
	  */
	  public static void displayLoans (String name,String fatherName1,int age,String gender1,String email1,long mobileNo1,long adharNo1,String address1) {
		  User user4=new User();
		  user4.name=name;
		  user4.fatherName=fatherName1;
		  user4.Age=age;
		  user4.gender=gender1;
		  user4.email=email1;
		  user4.address=address1;
		  user4.mobileNo=mobileNo1;
		  user4.adharNo=adharNo1;
		  detailLists.add(user4);
		  //ValidDiplayApplicationForm(address1, address1, age, address1, address1, adharNo1, adharNo1, address1);
		  
	  }
	  
	  /**
	   * Valid Deatails are Correct
	   * @param name
	   * @param FatherName
	   * @param age
	   * @param gender
	   * @param email
	   * @param mobileno
	   * @param adharno
	   * @param address
	   * @return
	   */

	 public static boolean ValidDiplayApplicationForm(String name,String FatherName,int age,String gender,String email,long mobileno,long adharno,String address) {
		 boolean isExists=false;
	 
		 for(User lists:detailLists) {
			 if(lists.name.equalsIgnoreCase(name) && lists.fatherName.equalsIgnoreCase(FatherName)&&lists.Age==age&&lists.gender.equalsIgnoreCase(gender)&&lists.email.equalsIgnoreCase(email)&&lists.mobileNo==mobileno&&lists.adharNo==adharno&&lists.address.equalsIgnoreCase(address)) {
				isExists=true; 
			 }
			  
		 }return isExists;
		 
		 
			 
	 }
	 
		 
	 

	public static void main(String[] args)
	{
		
		displayLoans("kiruba","rangaraj",21,"female","kirubarangaraj15@gmail.com",9025967216l,3089123423456789l,"1/2442,sakthinagar,coimbatore");
		
		
        }

}
