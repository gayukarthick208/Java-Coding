package abstraction;

public class hdfc implements bank {
public void deposit() {
	System.out.println("amount deposited successfully");
}
public static void main(String[] args) {
	bank b =new hdfc();
	b.accountdetails();
	b.deposit();
	
}
}
