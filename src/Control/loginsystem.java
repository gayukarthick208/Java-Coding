package Control;

//Simple Login System - Implement a simple login system using `if-else` to validate the
//username and password. 
public class loginsystem {
	public static void main(String[] args) {
		String Username = "Camcat_Admin";
		String Password = "Admin@123";
		if ((Username == "Camcat_Admin") && (Password == "Admin@123")) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Invalid User");
		}
	}

}
