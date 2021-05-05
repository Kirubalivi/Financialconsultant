package in.kiruba;

import java.util.ArrayList;

public class LoanApplication {
	  static ArrayList<User> detailLists=new ArrayList<User>();
	  static {
		  User user5=new User();
		  user5.name="kiruba";
		  user5.fatherName="rangaraj";
		  user5.age=21;
		  user5.gender="female";
		  user5.email="kirubarangaraj15@gmail.com";
		  user5.mobileNo=9025967216l;
		  user5.adharNo=3089123423456789l;
		  user5.address="1/2442,sakthinagar,coimbatore";
		  detailLists.add(user5);
		  
	  }
	  
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
//	  public static boolean displayLoans (String name1,String fatherName1,int age,String gender1,String email1,long mobileNo1,long adharNo1,String address1) {
//		 boolean isExists1=false;
//		  User user4=new User();
//		  user4.name=name1;
//		  user4.fatherName=fatherName1;
//		  user4.Age=age;
//		  user4.gender=gender1;
//		  user4.email=email1;
//		  user4.address=address1;
//		  user4.mobileNo=mobileNo1;
//		  user4.adharNo=adharNo1;
//		  detailLists.add(user4);
//		  //System.out.println(detailLists.name);
//		 
//		 isExists1=ValidDiplayApplicationForm(name1, fatherName1, age, gender1, email1, mobileNo1, adharNo1, address1);
//		  
//		 return isExists1;
	 // }
	  
	  /**
	   * Valid Details are Correct
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

	 public static boolean validDiplayApplicationForm(String name,String FatherName,int age,String gender,String email,long mobileno,long adharno,String address) {
		 boolean isExists=false;
	 
		 for(User lists:detailLists) {
			 //System.out.println(lists.name+lists.fatherName+lists.Age+lists.gender+lists.email+lists.mobileNo+lists.adharNo+lists.address);
			 //System.out.println(FatherName);
			 if(lists.name.equalsIgnoreCase(name) && lists.fatherName.equalsIgnoreCase(FatherName)&&lists.age==age&&lists.gender.equalsIgnoreCase(gender)&&lists.email.equalsIgnoreCase(email)&&lists.mobileNo==mobileno&&lists.adharNo==adharno&&lists.address.equalsIgnoreCase(address)) {
			isExists=true; 
			 
			 }
			  
      
	 }
		 return isExists;
	}
}

	     

		 
		 
		 
			 
	 
	 
		 
	 





