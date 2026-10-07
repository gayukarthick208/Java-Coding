package constructor;

public class Bankdetails {
	Bankdetails(int accountnumber, String accountholdername, String bankname, double balance) {
		System.out.println("account number:" + accountnumber);
		System.out.println("accountholdername:" + accountholdername);
		System.out.println("bankname:" + bankname);
		System.out.println("balance:" + balance);
	}

	Bankdetails(String Branchname, String ifsccode) {
		System.out.println("Branchname:" + Branchname);
		System.out.println("ifsccode:" + ifsccode);

	}

	public static void main(String[] args) {
		Bankdetails a = new Bankdetails(677474, "Reju", "HDFC", 67000.765);
		Bankdetails b = new Bankdetails(433346, "Shreya", "HDFC", 38000.8664);
		Bankdetails c = new Bankdetails(854589, "Sharan", "HDFC", 86433.974);
		Bankdetails d = new Bankdetails(986432, "Eshu", "HDFC", 34335.85);
		Bankdetails e = new Bankdetails(743367, "Yash", "HDFC", 44356.654);
		Bankdetails f = new Bankdetails("neelankarai", "CF6678");

	}

}
