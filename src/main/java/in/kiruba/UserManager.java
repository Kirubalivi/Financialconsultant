package in.kiruba;

import java.util.ArrayList;

public class UserManager {

	static ArrayList<User> userlists = new ArrayList<User>();

	static {
		User user2 = new User();
		user2.Username = "priya";
		user2.Password = "kiru";
		user2.MobileNo = 8012009883L;
		userlists.add(user2);

		User user1 = new User();
		user1.Username = "kiruba";
		user1.Password = "livi";
		user1.MobileNo = 9012345678L;
		userlists.add(user1);

	}

	// show the userlist
	public static void ShowUser() {
		for (User user : userlists) {
			System.out.println(user.Username + " " + user.Password + " " + user.MobileNo);

		}

	}

	// validate the logindetails
	public static boolean ValidLogin(String username, String password, long mobileno) {
		boolean isExist = false;
		for (User user : userlists) {
			// System.out.println(user.Username+ " " + user.Password+ " " + user.MobileNo);
			if (user.Username.equalsIgnoreCase(username) && (user.Password.equals(password))
					&& (user.MobileNo == mobileno)) {
				isExist = true;

				// System.out.println("Successfully Login");
				break;
			}

		}
		return isExist;

	}
	/*
	 * if(isExist) {
	 * 
	 * System.out.println("Successfully Login"); }else {
	 * System.out.println("Invalid"); }
	 */

	public static boolean NewUserRegistration(String username, String password, long mobileno) {
		User user3 = new User();
		user3.Username = username;
		user3.Password = password;
		user3.MobileNo = mobileno;
		// System.out.println(user3.Username);
		userlists.add(user3);
		return true;

	}

	public static void main(String[] args) {

		NewUserRegistration("kavi", "karthika", 1234567890L);
		ShowUser();

		ValidLogin("kavi", "karthika", 1234567890L);
		// ValidLogin("ki","li",9012345679L);
		DisplayLoans.Display();

		/*
		 * System.out.println("InterestAmount for HouseLoan "+CalculateInterestAmount.
		 * HouseLoan(2500000));
		 * 
		 * System.out.println("InterestAmount for EducationLoan "+
		 * CalculateInterestAmount.CalculationofEducation(100000));
		 * 
		 * System.out.println("InterestAmount for AgricultureLoan "+
		 * CalculateInterestAmount.CalculationOfAgriculture(2,200000));
		 * 
		 * System.out.println("InterestAmount for GoldLoan "+
		 * CalculateInterestAmount.CalculationofGold("22k",1));
		 * System.out.println("InterestAmount for Veicle "+
		 * CalculateInterestAmount.CalculationofVeicle("twowheeler",200000));
		 */
	}

}
