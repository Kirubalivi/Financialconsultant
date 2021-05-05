package in.kiruba;

import java.util.ArrayList;

public class UserManager {

	static ArrayList<User> userlists = new ArrayList<User>();

	static {
		User user2 = new User();
		user2.username = "priya";
		user2.password = "kiru";
		user2.mobileNo1 = 8012009883L;
		userlists.add(user2);

		User user1 = new User();
		user1.username = "kiruba";
		user1.password = "livi";
		user1.mobileNo1= 9012345678L;
		userlists.add(user1);

	}

	// show the userlists
	public static void showUser() {
		for (User user : userlists) {
			System.out.println(user.username + " " + user.password + " " + user.mobileNo1);

		}

	}

	// validate the logindetails
	public static boolean validLogin(String username, String password, long mobileno) {
		boolean isExist = false;
		for (User user : userlists) {
			// System.out.println(user.Username+ " " + user.Password+ " " + user.MobileNo);
			if (user.username.equalsIgnoreCase(username) && (user.password.equals(password))
					&& (user.mobileNo1 == mobileno)) {
				isExist = true;

				// System.out.println("Successfully Login");
				break;
			}

		}
		return isExist;

	}
	
	
	
	/**
	 * add NewUserRegister details into userlists
	 * @param username
	 * @param password
	 * @param mobileno
	 * @return
	 */

	public static boolean newUserRegistration(String username, String password, long mobileno) {
		User user3 = new User();
		user3.username = username;
		user3.password = password;
		user3.mobileNo1 = mobileno;
		// System.out.println(user3.Username);
		userlists.add(user3);
		return true;

	}

	public static void main(String[] args) {

		newUserRegistration("kavi", "karthika", 1234567890L);
		showUser();

		validLogin("kavi", "karthika", 1234567890L);
		
		//DisplayLoans.display();

		
	}

}
